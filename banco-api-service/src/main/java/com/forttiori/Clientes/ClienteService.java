package com.forttiori.Clientes;

import com.forttiori.Cliente;

import java.util.Optional;

public interface ClienteService {

    public Optional<Cliente> getAnyCliente(String id);
    public Cliente saveAnyCliente(Cliente cliente);

}
