package com.forttiori.Contas;


import com.forttiori.Cliente;
import com.forttiori.Conta;
import com.forttiori.DTO.ContaDTO;
import com.forttiori.RepositoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContaServiceImpl implements ContaService{

    private final RepositoryFacade repositoryFacade;

    public Conta saveConta(String idCliente, ContaDTO contaDTO) {

        Cliente cliente = this.repositoryFacade.getAnyCliente(idCliente);

        Conta conta = new Conta.ContaBuilder()
                .numero(contaDTO.getNumero())
                .agencia(contaDTO.getAgencia())
                .saldo(0.0)
                .build();

        cliente.setConta(conta);


        this.repositoryFacade.saveConta(conta);
        this.repositoryFacade.saveAnyCliente(cliente);
        return conta;
    }

    public List<Conta> findAllConta(){
        return this.repositoryFacade.findAllConta();
    }

}
