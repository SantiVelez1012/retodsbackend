package com.rdai.data.repository;


import com.rdai.data.models.entities.CasaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasaRepository extends JpaRepository<CasaEntity, Integer> {



}
