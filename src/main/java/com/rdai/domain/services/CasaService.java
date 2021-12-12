package com.rdai.domain.services;

import com.rdai.data.models.entities.CasaEntity;
import com.rdai.data.repository.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CasaService {

    @Autowired
    private CasaRepository casaRepository;

    public CasaEntity publicarCasa(CasaEntity casa){
        return casaRepository.save(casa);
    }


}
