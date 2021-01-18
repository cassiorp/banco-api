package com.forttiori;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ClientePF extends Cliente{
    @Getter
    @Setter
    private String cpf;
}
