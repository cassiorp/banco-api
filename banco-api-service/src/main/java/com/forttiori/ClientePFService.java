package com.forttiori;


import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientePFService {

    private final RepositoryFacade repositoryFacade;

    public Cliente save(ClienteDTO clienteDTO) {
        ClientePF clientePF = ClientePF.builder()
                .nome(clienteDTO.getNome())
                .email(clienteDTO.getEmail())
                .senha(clienteDTO.getSenha())
                .cpf(clienteDTO.getCpfOuCnpj())
                .build();
        return this.repositoryFacade.saveClientePF(clientePF);
    }

    public List<ClientePF> findAll() {
        return this.repositoryFacade.findAllClientePF();
    }

    public ClientePF findByID(String id) {
        return this.repositoryFacade.findClientePFByID(id);
    }

    public ClientePF upDateSenha(String id, UpDateSenhaDTO upDateSenhaDTO) {
        ClientePF clientePF = this.findByID(id);
        clientePF.setSenha(upDateSenhaDTO.getSenha());
        return clientePF;
    }

    public void delete(String id) {
        this.repositoryFacade.deleteClientePFByID(id);
    }
}
