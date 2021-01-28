package com.forttiori.Clientes;

import com.forttiori.Cliente;
import com.forttiori.ClientePF;
import com.forttiori.ClientePJ;
import com.forttiori.RepositoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService{

    private final RepositoryFacade repositoryFacade;


    @Override
    public Optional<Cliente> getAnyCliente(String id) {
        Optional<ClientePF> clientePF = this.repositoryFacade.findClientePFByID(id);
        Optional<ClientePJ> clientePJ = this.repositoryFacade.findClientePJByID(id);
        if(clientePF.isPresent()) {
            return Optional.ofNullable(clientePF.get());
        }
        if(clientePJ.isPresent()){
            return Optional.ofNullable(clientePJ.get());
        }
        return Optional.empty();
    }


    @Override
    public Cliente saveAnyCliente(Cliente cliente) {
        if(cliente instanceof ClientePF) return this.repositoryFacade.saveClientePF((ClientePF) cliente);
        return this.repositoryFacade.saveClientePJ((ClientePJ) cliente);
    }

}
