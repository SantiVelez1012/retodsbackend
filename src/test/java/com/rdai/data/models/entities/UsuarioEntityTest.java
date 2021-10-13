package com.rdai.data.models.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioEntityTest {

    @Test
    void chargeEntity(){
        assertEquals("santivelez", createUser().getNombreUsuario());
        assertEquals("123456789", createUser().getPassword());
    }




    private UsuarioEntity createUser() {
        UsuarioEntity user = new UsuarioEntity();
        user.setNombreUsuario("santivelez");
        user.setPassword("123456789");
        return user;
    }

}
