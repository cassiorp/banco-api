package com.forttiori;


import com.forttiori.Clientes.ClientePFRepository;
import com.forttiori.Clientes.ClientePJRepository;
import com.forttiori.Contas.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class RepositoryFacadeImpl implements RepositoryFacade{
    
    public final ClientePFRepository clientePFRepository;
    public final ClientePJRepository clientePJRepository;
    public final ContaRepository contaRepository;

    @Override
    public ClientePF saveClientePF(ClientePF clientePF) {
        return clientePFRepository.save(clientePF);
    }
    @Override
    public List<ClientePF> findAllClientePF() {
        return this.clientePFRepository.findAll();
    }
    @Override
    public Optional<ClientePF> findClientePFByID(String id) {
        return this.clientePFRepository.findById(id);
    }
    @Override
    public void deleteClientePFByID(String id) {
        this.clientePFRepository.deleteById(id);
    }


    @Override
    public ClientePJ saveClientePJ(ClientePJ clientePJ) {
        return this.clientePJRepository.save(clientePJ);
    }
    @Override
    public List<ClientePJ> findAllClientePJ() {
        return this.clientePJRepository.findAll();
    }
    @Override
    public Optional<ClientePJ> findClientePJByID(String id) {
        return this.clientePJRepository.findById(id);
    }
    @Override
    public void deleteClientePJByID(String id) {
        this.clientePJRepository.deleteById(id);
    }


    @Override
    public Conta saveConta(Conta conta) {
        return this.contaRepository.save(conta);
    }
    @Override
    public List<Conta> findAllConta() {
        return this.contaRepository.findAll();
    }
    @Override
    public Optional<Conta> findContaByID(String id) {
        return this.contaRepository.findById(id);
    }
    @Override
    public void deleteContaByID(String id) {
        this.contaRepository.deleteById(id);
    }
}
