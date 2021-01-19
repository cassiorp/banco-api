package com.forttiori.Clientes;

import com.forttiori.ClientePJ;
import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
import com.forttiori.RepositoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientePJServiceImpl implements ClientePJService{

    private final RepositoryFacade repositoryFacade;

    public ClientePJ saveClientePJ(ClienteDTO clienteDTO) {
        ClientePJ clientePJ = ClientePJ.builder()
                .nome(clienteDTO.getNome())
                .email(clienteDTO.getEmail())
                .senha(clienteDTO.getSenha())
                .cnpj(clienteDTO.getCpfOuCnpj())
                .build();
        return this.repositoryFacade.saveClientePJ(clientePJ);
    }

    public List<ClientePJ> findAllClientePJ() {
        return this.repositoryFacade.findAllClientePJ();
    }

    public ClientePJ findClientePJByID(String id) {
        return this.repositoryFacade.findClientePJByID(id);
    }

    public ClientePJ upDateSenhaPJ(String id, UpDateSenhaDTO upDateSenhaDTO) {
        ClientePJ clientePJ = this.findClientePJByID(id);
        clientePJ.setSenha(upDateSenhaDTO.getSenha());
        return this.repositoryFacade.saveClientePJ(clientePJ);
    }

    public void deleteClientePJByID(String id) {
        this.repositoryFacade.deleteClientePJByID(id);
    }
}
