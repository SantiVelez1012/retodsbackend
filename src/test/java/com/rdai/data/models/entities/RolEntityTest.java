package com.rdai.data.models.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RolEntityTest {
    RolEntity rol = new RolEntity();


    private void createRol() {
        rol = RolEntity.builder().idRol(1).nombreRol("RolPrueba").build();
    }


    @Test
    void rolVerify(){
        createRol();
        assertEquals(1,rol.getIdRol());
        assertEquals("RolPrueba", rol.getNombreRol());
    }
}
