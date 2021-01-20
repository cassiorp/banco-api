package com.forttiori;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositoryFacade {

    public ClientePF saveClientePF(ClientePF clientePF);
    public List<ClientePF> findAllClientePF();
    public Optional<ClientePF> findClientePFByID(String id);
    public void deleteClientePFByID(String id);

    public ClientePJ saveClientePJ(ClientePJ clientePJ);
    public List<ClientePJ> findAllClientePJ();
    public Optional<ClientePJ> findClientePJByID(String id);
    public void deleteClientePJByID(String id);

    public Optional<Cliente> getAnyCliente(String id);
    public Cliente saveAnyCliente(Cliente cliente);

    public Conta saveConta(Conta conta);
    public List<Conta> findAllConta();
    public Optional<Conta> findContaByID(String id);
    public void deleteContaByID(String id);


}
