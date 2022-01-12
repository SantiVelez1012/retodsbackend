package com.rdai.api.controllers;


import com.rdai.api.controllers.util.ManejoBusquedasUtil;
import com.rdai.api.validations.CasaValidation;
import com.rdai.api.validations.SearchValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(BusquedaCasasController.MROUTE)
public class BusquedaCasasController {

    public static final String MROUTE = "/api/casas/busqueda";
    public static final String TODAS = "/todas";
    public static final String UNASOLA = "/{id}";
    public static final String CRITERIO = "/criterio";

    @Autowired
    private ManejoBusquedasUtil manejoBusquedasUtil;

    @GetMapping(TODAS)
    public ResponseEntity<List<CasaValidation>> obtenerTodasLasCasas(){
        List<CasaValidation> casas = manejoBusquedasUtil.buscandoCasas();

        return new ResponseEntity<>(casas, HttpStatus.OK);
    }

    @GetMapping(UNASOLA)
    public ResponseEntity<CasaValidation> obtenerCasa(@PathVariable String id){
        CasaValidation casa = manejoBusquedasUtil.buscarCasaPorId(id);

        return new ResponseEntity<>(casa, HttpStatus.OK);
    }

    @PostMapping(CRITERIO)
    public ResponseEntity<List<CasaValidation>> buscarPorCriterio(@RequestBody SearchValidation criterio){
        List<CasaValidation> casas = manejoBusquedasUtil.busquedaPorCriterio(criterio);

        return new ResponseEntity<>(casas, HttpStatus.OK);
    }







}
