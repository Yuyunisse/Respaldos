package com.example.alumnoservice.services;

import com.example.alumnoservice.entity.AlumnoEntity;
import com.example.alumnoservice.model.Examen;
import com.example.alumnoservice.model.Pago;
import com.example.alumnoservice.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Date;
import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    @Autowired
    RestTemplate restTemplate;

    public List<AlumnoEntity> getAll () { return alumnoRepository.findAll();}

    public List<AlumnoEntity> getAlumnoByRut(String rut){
        return  alumnoRepository.findAllByRut(rut);
    }
    public AlumnoEntity findAlumnoByRut(String rut){
        return alumnoRepository.findByRut(rut);
    }

    public AlumnoEntity guardarAlumno(AlumnoEntity alumno){
        AlumnoEntity nuevoAlumno = alumnoRepository.save(alumno);
        return nuevoAlumno;
    }

    public List<Examen> getExamenesAlumno(String rut){
        List<Examen> examenesAlumno = restTemplate.getForObject("http://Examen/examen/byrut/" + rut, List.class);
        return examenesAlumno;
    }

    public List<Examen> getExamenesByFecha(Date fecha){
        List<Examen> examenesFecha = restTemplate.getForObject("http://Examen/examen/byfecha/" + fecha, List.class);
        return examenesFecha;
    }

    public List<Pago> getPagosByRut(String rut){
        List<Pago> pagoAlumno = restTemplate.getForObject("http://Pagos/pago/byrut" + rut, List.class);
        return pagoAlumno;
    }



}
