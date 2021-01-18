package com.forttiori;


import com.forttiori.DTO.ContaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContaService {

    private final RepositoryFacade repositoryFacade;

    public Conta save(String idCliente, ContaDTO contaDTO) {

        Cliente cliente = this.repositoryFacade.findClientePFByID(idCliente);
        if(cliente == null) cliente = this.repositoryFacade.findClientePJByID(idCliente);

        Conta conta = new Conta.ContaBuilder().numero().agencia().build();
        cliente.setConta(conta);

        if(cliente instanceof ClientePJ) this.repositoryFacade.saveClientePJ((ClientePJ) cliente);
            else this.repositoryFacade.saveClientePF((ClientePF) cliente);


        return this.repositoryFacade.saveConta(conta);
    }

}
