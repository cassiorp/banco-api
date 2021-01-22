package com.forttiori.Contas;

import com.forttiori.Conta;
import com.forttiori.DTO.ContaDTO;
import com.forttiori.DTO.ValorDTO;

import java.util.List;

public interface ContaService {

    public Conta saveConta(String idCliente, ContaDTO contaDTO);
    public List<Conta> findAllConta();
    public Double deposito(String idCliente, ValorDTO valorDTO);
    public Double saque(String idCliente, ValorDTO valorDTO);

}
