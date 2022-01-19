package com.rdai.api.validations;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DisponibilidadValidation {


    private String idDisp;

    @NotNull
    @NotBlank
    private String idUsuario;

    @NotNull
    @NotBlank
    private String idCasa;

    @NotNull
    @NotBlank
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String fechaInicio;

    @NotNull
    @NotBlank
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String fechaFin;


    public String getIdDisp() {
        return idDisp;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getIdCasa() {
        return idCasa;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }





}
