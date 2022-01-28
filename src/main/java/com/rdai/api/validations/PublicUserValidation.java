package com.rdai.api.validations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PublicUserValidation {

    private String nombreCompleto;

    private String nombreUsuario;

    private String pais;

}
