package com.forttiori;

import com.forttiori.DTO.ClienteDTO;

import java.util.List;

public interface RepositoryFacade {

    public ClientePF saveClientePF(ClientePF clientePF);
    public List<ClientePF> findAllClientePF();
    public ClientePF findClientePFByID(String id);
    public void deleteClientePFByID(String id);

    public ClientePJ saveClientePJ(ClientePJ clientePJ);
    public List<ClientePJ> findAllClientePJ();
    public ClientePJ findClientePJByID(String id);
    public void deleteClientePJByID(String id);

    public Conta saveConta(Conta conta);
    public List<Conta> findAllConta();
    public Conta findContaByID(String id);
    public void deleteContaByID(String id);


}
