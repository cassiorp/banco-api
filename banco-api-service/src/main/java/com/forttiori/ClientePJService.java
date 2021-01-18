package com.forttiori;

import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientePJService {

    private final RepositoryFacade repositoryFacade;

    public ClientePJ save(ClienteDTO clienteDTO) {
        ClientePJ clientePJ = ClientePJ.builder()
                .nome(clienteDTO.getNome())
                .email(clienteDTO.getEmail())
                .senha(clienteDTO.getSenha())
                .cnpj(clienteDTO.getCpfOuCnpj())
                .build();
        return this.repositoryFacade.saveClientePJ(clientePJ);
    }

    public List<ClientePJ> findAll() {
        return this.repositoryFacade.findAllClientePJ();
    }

    public ClientePJ findByID(String id) {
        return this.repositoryFacade.findClientePJByID(id);
    }

    public ClientePJ upDateSenha(String id, UpDateSenhaDTO upDateSenhaDTO) {
        ClientePJ clientePJ = this.findByID(id);
        clientePJ.setSenha(upDateSenhaDTO.getSenha());
        return clientePJ;
    }

    public void delete(String id) {
        this.repositoryFacade.deleteClientePJByID(id);
    }
}
