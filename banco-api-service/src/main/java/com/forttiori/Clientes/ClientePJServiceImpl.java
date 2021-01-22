package com.forttiori.Clientes;

import com.forttiori.ClientePJ;
import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
import com.forttiori.Exceptions.ClienteNotFoundException;
import com.forttiori.RepositoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientePJServiceImpl implements ClientePJService{

    private final RepositoryFacade repositoryFacade;

    public ClientePJ saveClientePJ(ClienteDTO clienteDTO) {
        ClientePJ clientePF = ClientePJ.builder()
                .nome(clienteDTO.getNome())
                .email(clienteDTO.getEmail())
                .senha(clienteDTO.getSenha())
                .cnpj(clienteDTO.getCpfOuCnpj())
                .build();
        return this.repositoryFacade.saveClientePJ(clientePF);
    }

    public List<ClientePJ> findAllClientePJ() {
        return this.repositoryFacade.findAllClientePJ();
    }

    public ClientePJ findClientePJByID(String id) {
        Optional<ClientePJ> clientePJ = (this.repositoryFacade.findClientePJByID(id));
        return clientePJ.orElseThrow(() -> new ClienteNotFoundException("Cliente não encontrado"));
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
