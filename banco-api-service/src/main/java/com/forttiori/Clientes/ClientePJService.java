package com.forttiori.Clientes;

import com.forttiori.ClientePJ;
import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ClientePJService {

    public ClientePJ saveClientePJ(ClienteDTO clienteDTO);

    public List<ClientePJ> findAllClientePJ();

    public ClientePJ findClientePJByID(String id);

    public ClientePJ upDateSenhaPJ(String id, UpDateSenhaDTO upDateSenhaDTO);

    public void deleteClientePJByID(String id);
}
