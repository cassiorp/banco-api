package com.forttiori.Clientes;

import com.forttiori.ClientePF;
import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientePFService {

    public ClientePF saveClientePF(ClienteDTO clienteDTO);

    public List<ClientePF> findAllClientePF();

    public ClientePF findClientePFByID(String id);

    public ClientePF upDateSenhaPF(String id, UpDateSenhaDTO upDateSenhaDTO);

    public void deleteClientePFByID(String id);

}
