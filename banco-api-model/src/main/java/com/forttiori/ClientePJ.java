package com.forttiori;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@SuperBuilder
@Document(collection = "clientePJ")
@NoArgsConstructor
public class ClientePJ extends Cliente{
    @Getter
    @Setter
    private String cnpj;
}
