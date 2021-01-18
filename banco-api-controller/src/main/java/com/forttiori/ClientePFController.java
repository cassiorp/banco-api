package com.forttiori;

import com.forttiori.DTO.ClienteDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clientes")
@RequiredArgsConstructor
public class ClientePFController {

    private final ServiceFacede serviceFacede;

    @PostMapping
    public Cliente save(@RequestBody ClienteDTO clienteDTO) {
        return this.serviceFacede.clientePFService.save(clienteDTO);
    }

    @GetMapping
    public List<ClientePF> findAll() {
        return this.serviceFacede.clientePFService.findAll();
    }
}
