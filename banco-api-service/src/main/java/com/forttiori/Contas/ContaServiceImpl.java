package com.forttiori.Contas;


import com.forttiori.Cliente;
import com.forttiori.Conta;
import com.forttiori.DTO.ContaDTO;
import com.forttiori.DTO.ValorDTO;
import com.forttiori.Exceptions.ClienteNotFoundException;
import com.forttiori.Exceptions.ClienteSemContaException;
import com.forttiori.Exceptions.SaldoInsuficienteException;
import com.forttiori.Exceptions.ValorInvalidoException;
import com.forttiori.RepositoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContaServiceImpl implements ContaService{

    private final RepositoryFacade repositoryFacade;


    public Conta saveConta(String idCliente, ContaDTO contaDTO) {

        Optional<Cliente> cliente = this.buscaCliente(idCliente);

        Conta conta = new Conta.ContaBuilder()
                .numero(contaDTO.getNumero())
                .agencia(contaDTO.getAgencia())
                .saldo(0.0)
                .build();

        cliente.get().setConta(conta);

        this.repositoryFacade.saveConta(conta);
        this.repositoryFacade.saveAnyCliente(cliente.get());
        return conta;

    }

    public List<Conta> findAllConta(){
        return this.repositoryFacade.findAllConta();
    }

    @Override
    public Double deposito(String idCliente, ValorDTO valorDTO) {

        Optional<Cliente> cliente = this.buscaCliente(idCliente);

        if(Boolean.TRUE.equals(seTemConta(cliente.get()))) throw new ClienteSemContaException("Cliente nao possui conta!");

        if(valorDTO.getValor() <= 0)throw new ValorInvalidoException("Valor invalido!");

        Conta conta = cliente.get().getConta();
        conta.setSaldo(conta.getSaldo() + valorDTO.getValor());
        cliente.get().setConta(conta);
        this.repositoryFacade.saveConta(conta);
        this.repositoryFacade.saveAnyCliente(cliente.get());

        return conta.getSaldo();

    }

    private Optional<Cliente> buscaCliente(String id){
        Optional<Cliente> cliente = this.repositoryFacade.getAnyCliente(id);
        if(!cliente.isPresent()) {
            throw new ClienteNotFoundException("Cliente não encontrado");
        }
        return cliente;
    }

    public Double saque(String idCliente, ValorDTO valorDTO) {

        Optional<Cliente> cliente = this.buscaCliente(idCliente);


        if(Boolean.TRUE.equals(seTemConta(cliente.get())))
            throw new ClienteSemContaException("Cliente nao possui conta!");

        Conta conta = cliente.get().getConta();

        if(valorDTO.getValor() > conta.getSaldo())
            throw new SaldoInsuficienteException("Saldo insuficiente");

        conta.setSaldo(conta.getSaldo() - valorDTO.getValor());
        cliente.get().setConta(conta);
        this.repositoryFacade.saveConta(conta);
        this.repositoryFacade.saveAnyCliente(cliente.get());

        return conta.getSaldo();
    }


    private Boolean seTemConta(Cliente cliente) {
        return cliente.getConta() == null;
    }

}
