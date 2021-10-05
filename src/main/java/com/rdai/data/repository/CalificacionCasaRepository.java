package com.rdai.data.repository;


import com.rdai.data.models.entities.CalificacionCasaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalificacionCasaRepository extends JpaRepository<CalificacionCasaEntity, Integer> {
}
