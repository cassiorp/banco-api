package com.forttiori;

import com.forttiori.DTO.ClienteDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clientePF")
@RequiredArgsConstructor
public class ClientePFController {

    private final ServiceFacade serviceFacade;

    @PostMapping
    public Cliente save(@RequestBody ClienteDTO clienteDTO) {
        return this.serviceFacade.saveClientePF(clienteDTO);
    }

    @GetMapping
    public List<ClientePF> findAll() {
        return this.serviceFacade.findAllClientePF();
    }
}
