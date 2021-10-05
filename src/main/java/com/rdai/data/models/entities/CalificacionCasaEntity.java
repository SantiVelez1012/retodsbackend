package com.rdai.data.models.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class CalificacionCasaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion")
    private Integer idCalificacion;

    @Column(length = 500)
    private String comentario;

    @Column(name = "calificacion")
    private Integer calificacion;

    @JoinColumn(name = "fk_casa_afiliada")
    @ManyToOne
    private CasaEntity casa;

    public Integer getIdCalificacion() {
        return idCalificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public CasaEntity getCasa() {
        return casa;
    }
}
