package com.forttiori.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
public class UpDateSenhaDTO {

    @NotEmpty
    @NotNull
    private String senha;

}
