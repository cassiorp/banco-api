package com.forttiori.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ClienteDTO {

    private String nome;
    private String email;
    private String senha;
    private String cpfOuCnpj;

}
