package com.forttiori;

import com.forttiori.DTO.ClienteDTO;
import com.forttiori.DTO.UpDateSenhaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clientePF")
@RequiredArgsConstructor
public class ClientePFController {

    private final ServiceFacade serviceFacade;

    @PostMapping
    public ClientePF save(@RequestBody ClienteDTO clienteDTO) {
        return this.serviceFacade.saveClientePF(clienteDTO);
    }

    @GetMapping
    public List<ClientePF> findAll() {
        return this.serviceFacade.findAllClientePF();
    }

    @GetMapping("/{id}")
    public ClientePF findById(@PathVariable String id) {
        return this.serviceFacade.findClientePFByID(id);
    }

    @PatchMapping("/{id}")
    public ClientePF upDateSenha(@PathVariable String id, @RequestBody UpDateSenhaDTO upDateSenhaDTO) {
        return this.serviceFacade.upDateSenhaPF(id, upDateSenhaDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        this.serviceFacade.deleteClientePFByID(id);
    }
}
