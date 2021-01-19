package com.forttiori;

import com.forttiori.Clientes.ClientePFService;
import com.forttiori.Clientes.ClientePJService;
import com.forttiori.Contas.ContaService;
import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.ContaDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceFacade {

    public Cliente saveClientePF(ClienteDTO clienteDTO);
    public List<ClientePF> findAllClientePF();
    public ClientePF findClientePFByID(String id);
    public ClientePF upDateSenhaPF(String id, UpDateSenhaDTO upDateSenhaDTO);
    public void deleteClientePFByID(String id);

    public ClientePJ saveClientePJ(ClienteDTO clienteDTO);
    public List<ClientePJ> findAllClientePJ();
    public ClientePJ findClientePJByID(String id);
    public ClientePJ upDateSenhaPJ(String id, UpDateSenhaDTO upDateSenhaDTO);
    public void deleteClientePJByID(String id);

    public Conta saveConta(String idCliente, ContaDTO contaDTO);
    public List<Conta> findAllConta();


}
