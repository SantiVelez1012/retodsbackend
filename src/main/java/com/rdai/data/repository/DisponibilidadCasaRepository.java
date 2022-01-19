package com.rdai.data.repository;

import com.rdai.data.models.entities.CasaEntity;
import com.rdai.data.models.entities.DisponibilidadCasaEntity;
import com.rdai.data.models.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisponibilidadCasaRepository extends JpaRepository<DisponibilidadCasaEntity,Integer> {


    List<DisponibilidadCasaEntity> findAllByCasaEntity(CasaEntity casaEntity);

    List<DisponibilidadCasaEntity> findAllByUsuarioReservado(UsuarioEntity usuarioEntity);
}
