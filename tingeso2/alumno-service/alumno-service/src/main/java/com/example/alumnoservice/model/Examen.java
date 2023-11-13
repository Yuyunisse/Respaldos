package com.example.alumnoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Examen {
    private String rut;
    private Date rendicion;
    private Integer puntaje;
}

