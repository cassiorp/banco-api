package com.forttiori.Clientes;


import com.forttiori.Cliente;
import com.forttiori.ClientePF;
import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
import com.forttiori.RepositoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientePFServiceImpl implements ClientePFService{

    private final RepositoryFacade repositoryFacade;

    public Cliente saveClientePF(ClienteDTO clienteDTO) {
        ClientePF clientePF = ClientePF.builder()
                .nome(clienteDTO.getNome())
                .email(clienteDTO.getEmail())
                .senha(clienteDTO.getSenha())
                .cpf(clienteDTO.getCpfOuCnpj())
                .build();
        return this.repositoryFacade.saveClientePF(clientePF);
    }

    public List<ClientePF> findAllClientePF() {
        return this.repositoryFacade.findAllClientePF();
    }

    public ClientePF findClientePFByID(String id) {
        return this.repositoryFacade.findClientePFByID(id);
    }

    public ClientePF upDateSenhaPF(String id, UpDateSenhaDTO upDateSenhaDTO) {
        ClientePF clientePF = this.findClientePFByID(id);
        clientePF.setSenha(upDateSenhaDTO.getSenha());
        return this.repositoryFacade.saveClientePF(clientePF);
    }

    public void deleteClientePFByID(String id) {
        this.repositoryFacade.deleteClientePFByID(id);
    }
}
