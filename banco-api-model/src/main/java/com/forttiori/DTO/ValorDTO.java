package com.forttiori.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
public class ValorDTO {

    @NotNull
    private Double valor;

}
