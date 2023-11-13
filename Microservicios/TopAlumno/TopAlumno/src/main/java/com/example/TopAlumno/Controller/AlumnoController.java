package com.example.TopAlumno.Controller;


import com.example.TopAlumno.Entity.AlumnoEntity;
import com.example.TopAlumno.Model.Pago;
import com.example.TopAlumno.Service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import com.example.TopAlumno.Model.Examen;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    //
    @GetMapping("/todos")
    public ResponseEntity<List<AlumnoEntity>> getAll() {
        List<AlumnoEntity> alumnos = alumnoService.getAll();
        if (alumnos.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(alumnos);
    }

    //Listar por rut
    @GetMapping("alumno/{rutalumno}")
    public ResponseEntity<AlumnoEntity> getbyRut(@PathVariable("rut") String rut){
        AlumnoEntity alumno = alumnoService.findAlumnoByRut(rut);
        if (alumno == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(alumno);
    }

    //Listar los examenes de un alumno
    @GetMapping("/examenes/{rut}")
    public ResponseEntity<List<Examen>> getExamen(@PathVariable("rut") String rut) {
        AlumnoEntity alumno = alumnoService.findAlumnoByRut(rut);
        if (alumno == null)
            return ResponseEntity.notFound().build();
        List<Examen> examenAlumno = alumnoService.getExamenesAlumno(rut);
        return ResponseEntity.ok(examenAlumno);
    }

    @GetMapping("/examenes/{fecha}")
    public ResponseEntity<List<Examen>> getExamenFecha(@PathVariable("fecha") Date fecha){
        List<Examen> examen = alumnoService.getExamenesByFecha(fecha);
        if (examen.isEmpty())
            return ResponseEntity.notFound().build();
        List<Examen> examensFecha = alumnoService.getExamenesByFecha(fecha);
        return ResponseEntity.ok(examensFecha);
    }

    @GetMapping("pagos/{rut}")
    public ResponseEntity<List<Pago>> getPagosAlumno(@PathVariable ("rut") String rut){
        List<Pago> pagosAlumno = alumnoService.getPagosByRut(rut);
        if (pagosAlumno.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(pagosAlumno);
    }

    //Los post de examen segun se basan en la escritura de archivo
}
