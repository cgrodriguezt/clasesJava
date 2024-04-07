package com.clasesJava.repositories;


import com.clasesJava.models.Ciudades;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudades, Long> {
}