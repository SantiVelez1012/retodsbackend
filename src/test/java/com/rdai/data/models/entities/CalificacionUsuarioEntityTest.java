package com.rdai.data.models.entities;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalificacionUsuarioEntityTest {

    CalificacionUsuarioEntity calificacion = new CalificacionUsuarioEntity();

    private void crear(){
        calificacion = CalificacionUsuarioEntity.builder().idCalificacionUsuario(1)
                .calificacion(5).usuarioEntity(null).comentario("Buenardo").build();
    }


    @Test
    void verifyCalificacion(){

        crear();

        assertEquals(1, calificacion.getIdCalificacionUsuario());
        assertEquals(5, calificacion.getCalificacion());
        assertNull(calificacion.getUsuarioEntity());
        assertEquals("Buenardo", calificacion.getComentario());


    }





}
