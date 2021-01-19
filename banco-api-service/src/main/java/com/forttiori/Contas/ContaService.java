package com.forttiori.Contas;

import com.forttiori.Cliente;
import com.forttiori.Conta;
import com.forttiori.DTO.ContaDTO;

import java.util.List;

public interface ContaService {

    public Conta saveConta(String idCliente, ContaDTO contaDTO);
    public List<Conta> findAllConta();

}
