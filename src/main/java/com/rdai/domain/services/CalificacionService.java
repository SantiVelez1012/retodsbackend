package com.rdai.domain.services;

import com.rdai.data.models.entities.CalificacionEntity;
import com.rdai.data.repository.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@Transactional
public class CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;

    /*public List<Integer> obtenerCalificacion(Integer idCasa) {
        //TODO:BUSCAR CALIFICACIONES DE UNA RESERVA DADO ID DE CASA
        // FILTRAR VALORES DISTINTOS DE NULL

        List<Integer> calificaciones = List.of(5);

        return calificaciones.stream().map(calificacion.getPuntaje()).filter(Objects::nonNull).collect(Collectors.toList());

    }*/

    public List<CalificacionEntity> buscarPorIdCasa(Integer idCasa){
        return calificacionRepository.findAllByDisponibilidadCasaEntity_CasaEntity_IdCasa(idCasa);
    }

    public List<CalificacionEntity> buscarPorNombreUsuario(String nombreUsuario){
        return calificacionRepository.findAllByDisponibilidadCasaEntity_UsuarioReservado_NombreUsuario(nombreUsuario);
    }

    public CalificacionEntity guardarCalificacion(CalificacionEntity calificacion){
        return calificacionRepository.save(calificacion);
    }
}
