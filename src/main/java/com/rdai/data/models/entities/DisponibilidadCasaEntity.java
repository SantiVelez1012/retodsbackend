package com.rdai.data.models.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder

public class DisponibilidadCasaEntity {

    @Id
    @Column(name = "id_disp")
    private Integer idDisp;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_inicio")
    private String fechaInicio;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_fin")
    private String fechaFin;

    @JoinColumn(name = "fk_casa")
    @ManyToOne
    private CasaEntity casaEntity;

    public Integer getIdDisp() {
        return idDisp;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public CasaEntity getCasaEntity() {
        return casaEntity;
    }
}
