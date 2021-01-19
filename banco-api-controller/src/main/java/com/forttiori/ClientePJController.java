package com.forttiori;


import com.forttiori.Clientes.ClientePJServiceImpl;
import com.forttiori.DTO.ClienteDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clientePJ")
@RequiredArgsConstructor
public class ClientePJController {

    private final ServiceFacade serviceFacade;

    @PostMapping
    public ClientePJ save(@RequestBody ClienteDTO clienteDTO) {
        return this.serviceFacade.saveClientePJ(clienteDTO);
    }

    @GetMapping
    public List<ClientePJ> findAll() {
        return this.serviceFacade.findAllClientePJ();
    }
}
