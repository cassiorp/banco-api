package com.forttiori;

import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
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

    @GetMapping("/{id}")
    public ClientePJ findById(@PathVariable String id) {
        return this.serviceFacade.findClientePJByID(id);
    }

    @PatchMapping("/{id}")
    public ClientePJ upDateSenha(@PathVariable String id, @RequestBody UpDateSenhaDTO upDateSenhaDTO) {
        return this.serviceFacade.upDateSenhaPJ(id, upDateSenhaDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        this.serviceFacade.deleteClientePJByID(id);
    }
}
