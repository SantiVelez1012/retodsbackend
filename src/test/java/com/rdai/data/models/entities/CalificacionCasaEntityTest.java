package com.rdai.data.models.entities;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalificacionCasaEntityTest {

    CalificacionCasaEntity calificacionCasa = new CalificacionCasaEntity();


    private CalificacionCasaEntity crearCalificacion() {
        calificacionCasa = CalificacionCasaEntity.builder()
                .idCalificacion(1).calificacion(5)
                .comentario("Buenardo").casa(null).build();
        return calificacionCasa;
    }


    @Test
    void validarCalificacionCasa(){
        crearCalificacion();

        assertEquals(1, calificacionCasa.getIdCalificacion());
        assertEquals(5, calificacionCasa.getCalificacion());
        assertEquals("Buenardo", calificacionCasa.getComentario());
        assertNull(calificacionCasa.getCasa());
    }


}
