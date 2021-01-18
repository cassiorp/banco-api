package com.forttiori;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;

@SuperBuilder
@Getter
abstract public class Cliente {

    @Id
    private String id;
    @Setter
    private String nome;
    @Setter
    private String email;
    @Setter
    private String senha;
    @Setter
    private Conta conta;

}
