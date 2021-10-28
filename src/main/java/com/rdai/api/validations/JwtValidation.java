package com.rdai.api.validations;


import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Builder
public class JwtValidation {

    @NotNull
    @NotBlank
    private String token;


    public String getToken() {
        return token;
    }
}
