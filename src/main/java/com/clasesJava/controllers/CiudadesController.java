package com.clasesJava.controllers;

import com.clasesJava.models.Ciudades;
import com.clasesJava.repositories.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciudades")
public class CiudadesController {

    @Autowired
    private CiudadRepository ciudadRepository;

    @GetMapping("/todas")
    public List<Ciudades> obtenerTodasLasCiudades() {  
        return ciudadRepository.findAll();
    }
}
