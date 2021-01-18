package com.forttiori;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ClientePJ extends Cliente{
    @Getter
    @Setter
    private String cnpj;
}
