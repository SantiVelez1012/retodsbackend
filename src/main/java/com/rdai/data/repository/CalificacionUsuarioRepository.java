package com.rdai.data.repository;

import com.rdai.data.models.entities.CalificacionUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalificacionUsuarioRepository extends JpaRepository<CalificacionUsuarioEntity, Integer> {



}
