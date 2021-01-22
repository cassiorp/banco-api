package com.forttiori.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
public class ContaDTO {

    @NotNull
    @NotEmpty
    private String numero;
    @NotNull
    @NotEmpty
    private String agencia;

}
