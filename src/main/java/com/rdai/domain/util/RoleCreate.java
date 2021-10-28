package com.rdai.domain.util;

import com.rdai.data.models.entities.RolEntity;
import com.rdai.data.models.enums.NombreRol;
import com.rdai.domain.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class RoleCreate implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) {
        RolEntity rolAnfitrion = new RolEntity(null,NombreRol.ANFITRION);
        RolEntity rolViajero = new RolEntity(null, NombreRol.VIAJERO);
        rolService.crearRol(rolAnfitrion);
        rolService.crearRol(rolViajero);
    }


}
