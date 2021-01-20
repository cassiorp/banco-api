package com.forttiori;


import com.forttiori.Contas.ContaServiceImpl;
import com.forttiori.DTO.ContaDTO;
import com.forttiori.DTO.ValorDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/conta")
@RequiredArgsConstructor
public class ContaController {

    private final ServiceFacade serviceFacade;

    @PostMapping("/{idCliente}")
    public Conta saveContaPF(@PathVariable String idCliente, @RequestBody ContaDTO contaDTO) {
        return this.serviceFacade.saveConta(idCliente, contaDTO);
    }

    @GetMapping
    public List<Conta> findAll() {
        return this.serviceFacade.findAllConta();
    }

    @PatchMapping("/deposito/{idCliente}")
    public Double deposito(@PathVariable String idCliente, @RequestBody ValorDTO valorDTO) {
        return this.serviceFacade.deposito(idCliente, valorDTO);
    }

    @PatchMapping("/saque/{idCliente}")
    public Double saque(@PathVariable String idCliente, @RequestBody ValorDTO valorDTO) {
        return this.serviceFacade.saque(idCliente, valorDTO);
    }

}
