package com.rdai.api.controllers;

import com.rdai.api.controllers.util.ReservasUtil;
import com.rdai.api.validations.DisponibilidadValidation;
import com.rdai.api.validations.MessageValidation;
import com.rdai.data.models.entities.DisponibilidadCasaEntity;
import com.rdai.domain.services.DisponibilidadCasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;

@RestController
@CrossOrigin
@RequestMapping(ReservasController.RUTAPRINCIPAL)
public class ReservasController {

    public static final String RUTAPRINCIPAL = "/api/reservas";
    public static final String BUSCARPORUSUARIO = "/busquedau";
    public static final String BUSCARPORCASA = "/busquedac";
    public static final String CREARESERVA = "/crear";

    @Autowired
    private DisponibilidadCasaService reservaService;

    @Autowired
    private ReservasUtil reservasUtil;


    @PostMapping(CREARESERVA)
    public ResponseEntity<MessageValidation> crearReserva(@Valid @RequestBody DisponibilidadValidation reserva,
                                                          BindingResult bindingResult,
                                                          @RequestHeader("Authorization") String token) throws ParseException {

        if(bindingResult.hasErrors()){
            return new ResponseEntity<MessageValidation>(new MessageValidation("Campos mal puestos"), HttpStatus.BAD_REQUEST);
        }

        if(!reservasUtil.validarFechas(reserva) || !reservasUtil.verificarDisponibilidad(reserva)){
            return new ResponseEntity<MessageValidation>(new MessageValidation("La casa no puede ser reservada"), HttpStatus.NOT_ACCEPTABLE);
        }

        if(!reservasUtil.verificarDisponibilidad(reserva)){
            return new ResponseEntity<MessageValidation>(new MessageValidation("La casa no está disponible para esas fechas"), HttpStatus.CONFLICT);
        }


        DisponibilidadCasaEntity dispEntity = reservasUtil.crearReserva(reserva, token);

        try{
            reservaService.guardarReserva(dispEntity);
            return new ResponseEntity<>(new MessageValidation("Reserva creada correctamente"), HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(new MessageValidation("Error desconocido. perdòn :c"), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }



}
