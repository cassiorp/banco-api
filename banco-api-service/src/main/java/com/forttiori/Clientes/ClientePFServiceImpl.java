package com.forttiori.Clientes;

import com.forttiori.ClientePF;
import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
import com.forttiori.Exceptions.ClienteNotFoundException;
import com.forttiori.RepositoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Repository
@RequiredArgsConstructor
public class ClientePFServiceImpl implements ClientePFService{

    private final RepositoryFacade repositoryFacade;

    public ClientePF saveClientePF(ClienteDTO clienteDTO) {
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
        Optional<ClientePF> clientePF = this.repositoryFacade.findClientePFByID(id);
        return clientePF.orElseThrow(() -> new ClienteNotFoundException("Cliente não encontrado"));
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
