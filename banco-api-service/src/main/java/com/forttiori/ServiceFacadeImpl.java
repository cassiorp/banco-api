package com.forttiori;

import com.forttiori.Clientes.ClientePFService;
import com.forttiori.Clientes.ClientePJService;

import com.forttiori.Contas.ContaService;
import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.ContaDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
import com.forttiori.DTO.ValorDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@RequiredArgsConstructor
public class ServiceFacadeImpl implements ServiceFacade{
    private final ClientePFService clientePFService;
    private final ClientePJService clientePJService;
    private final ContaService contaService;

    @Override
    public ClientePF saveClientePF(ClienteDTO clienteDTO) {
        return clientePFService.saveClientePF(clienteDTO);
    }
    @Override
    public List<ClientePF> findAllClientePF() {
        return this.clientePFService.findAllClientePF();
    }
    @Override
    public ClientePF findClientePFByID(String id) {
        return this.clientePFService.findClientePFByID(id);
    }
    @Override
    public ClientePF upDateSenhaPF(String id, UpDateSenhaDTO upDateSenhaDTO) {
        return this.clientePFService.upDateSenhaPF(id, upDateSenhaDTO);
    }
    @Override
    public void deleteClientePFByID(String id) {
        this.clientePFService.deleteClientePFByID(id);
    }


    @Override
    public ClientePJ saveClientePJ(ClienteDTO clienteDTO) {
        return this.clientePJService.saveClientePJ(clienteDTO);
    }

    @Override
    public List<ClientePJ> findAllClientePJ() {
        return this.clientePJService.findAllClientePJ();
    }

    @Override
    public ClientePJ findClientePJByID(String id) {
        return this.clientePJService.findClientePJByID(id);
    }
    @Override
    public ClientePJ upDateSenhaPJ(String id, UpDateSenhaDTO upDateSenhaDTO) {
        return this.clientePJService.upDateSenhaPJ(id, upDateSenhaDTO);
    }
    @Override
    public void deleteClientePJByID(String id) {
        this.clientePJService.deleteClientePJByID(id);
    }


    @Override
    public Conta saveConta(String idCliente, ContaDTO contaDTO) {
        return this.contaService.saveConta(idCliente, contaDTO);
    }
    @Override
    public List<Conta> findAllConta() {
        return this.contaService.findAllConta();
    }

    @Override
    public Double deposito(String idCliente, ValorDTO valorDTO) {
        return this.contaService.deposito(idCliente, valorDTO);
    }

    @Override
    public Double saque(String idCliente, ValorDTO valorDTO) {
        return this.contaService.saque(idCliente, valorDTO);
    }
}
