package com.example.alumnoservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Alumno")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoEntity {

    @Id
    private String rut;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private Date nacimiento;
    private String colegio;
    private String tipoColegio;
    private Integer egreso;
    private Integer cuotas;
}
