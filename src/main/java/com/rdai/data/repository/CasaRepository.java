package com.rdai.data.repository;


import com.rdai.data.models.entities.CasaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CasaRepository extends JpaRepository<CasaEntity, Integer> {

    List<CasaEntity> findAllByPais(String pais);

    List<CasaEntity> findAllByEstado(String estado);

    List<CasaEntity> findAllByCiudad(String ciudad);

}
