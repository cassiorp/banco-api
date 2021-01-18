package com.forttiori;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@SuperBuilder
@Document(collection = "clientePF")
@NoArgsConstructor
public class ClientePF extends Cliente{
    @Getter
    @Setter
    private String cpf;
}
