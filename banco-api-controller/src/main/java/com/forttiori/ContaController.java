package com.forttiori;


import com.forttiori.Contas.ContaServiceImpl;
import com.forttiori.DTO.ContaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/conta")
@RequiredArgsConstructor
public class ContaController {

    private final ServiceFacade serviceFacade;

    @PostMapping("/{idCliente}")
    public Conta save(@PathVariable String idCliente, @RequestBody ContaDTO contaDTO) {
        return this.serviceFacade.saveConta(idCliente, contaDTO);
    }

    @GetMapping
    public List<Conta> findAll() {
        return this.serviceFacade.findAllConta();
    }
}
