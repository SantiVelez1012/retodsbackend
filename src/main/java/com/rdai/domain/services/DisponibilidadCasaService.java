package com.rdai.domain.services;

import com.rdai.data.models.entities.CasaEntity;
import com.rdai.data.models.entities.DisponibilidadCasaEntity;
import com.rdai.data.models.entities.UsuarioEntity;
import com.rdai.data.repository.DisponibilidadCasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DisponibilidadCasaService {


    @Autowired
    private DisponibilidadCasaRepository dispRepo;

    public List<DisponibilidadCasaEntity> findAllByCasa(CasaEntity casaEntity){
        return dispRepo.findAllByCasaEntity(casaEntity);
    }

    public List<DisponibilidadCasaEntity> findAllByUsuario(UsuarioEntity usuarioEntity){
        return dispRepo.findAllByUsuarioReservado(usuarioEntity);
    }

}
