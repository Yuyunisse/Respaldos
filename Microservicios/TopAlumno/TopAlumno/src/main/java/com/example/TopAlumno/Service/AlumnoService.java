package com.example.TopAlumno.Service;

import com.example.TopAlumno.Entity.AlumnoEntity;
import com.example.TopAlumno.Model.Examen;
import com.example.TopAlumno.Model.Pago;
import com.example.TopAlumno.Repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
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


   // public List<AlumnoEntity> getAll() { return alumnoRepository.findAll();}
//    public ArrayList<AlumnoEntity> obtenerAlumno() {
    //    return (ArrayList<AlumnoEntity>) alumnoRepository.findAll();
    //}

  //  public List<Examen> getExamenesporRut(String rut){
 //       List<Examen> examenes = restTemplate.getForObject("http://localhost/Examen/examen/exambyalum/") + rut, List.class);
   //     return examenes;
    //}



    //public List<AlumnoEntity> obtenerPorRut(String rut){
      //  return alumnoRepository.findByRut(rut);
    //}

    //Calcular descuento en arancel al pagar con cuota (descuento dependiente del tipo de colegio)
    //public double decuento_colegio(AlumnoEntity alumno) {
      //  String tipo_colegio = alumnoRepository.tipoColegio(alumno);
        //double descuento_colegio = 0.0;

        //if (tipo_colegio.toLowerCase().equals("municipal")) {
          //  descuento_colegio = (1500000.0 * 20.0) / 100.0;
        //}
        //else if (tipo_colegio.toLowerCase().equals("subvencionado")){
          //  descuento_colegio = (1500000.0 * 10.0) / 100.0;
        //}
        //else if (tipo_colegio.toLowerCase().equals("privado")) {
          //  descuento_colegio = 1500000.0;
        //}
        //return descuento_colegio;

  //  }

    //Descuento por pago al contado
    //public double descuento_contado(AlumnoEntity alumno){
      //  Integer cuotas = alumnoRepository.cantCuotas(alumno);
        //double descuento = 0;
        //if (cuotas.equals(1)){
          //  descuento = 1500000.0 / 2.0;
       // }
        //return descuento;
    //}

    //Descuento por año de egreso
    //public double descuento_ano(AlumnoEntity alumno) {
      //  Integer ano = alumnoRepository.ano_egreso(alumno);
        //ano = 2024 - ano;
        //double descuento = 0.0;
        //if (ano < 1) {
          //  descuento = (1500000.0 * 15.0) / 100.0;
        //} else if (ano == 1 | ano == 2) {
          //  descuento = (1500000.0 * 8.0) / 100.0;
        //} else if (ano == 3 | ano == 4) {
          //  descuento = (1500000.0 * 4) / 100.0;
        //} else {
          //  descuento = 0.0;
        //}
        //return descuento;
   // }

    //Corroborar cantidad maxima de cuotas:
    //public Integer cuotasmax(AlumnoEntity alumno){
      //  Integer max_cuota = 0;
        //String tipocolegio = alumnoRepository.tipoColegio(alumno);
        //if (tipocolegio.toLowerCase().equals("municipal")){
          //  max_cuota = 10;
        //} else if (tipocolegio.toLowerCase().equals("subvencionado")) {
          //  max_cuota = 7;
        //} else if (tipocolegio.toLowerCase().equals("privado")) {
          //  max_cuota = 4;
        //}
        //return max_cuota;

//    }

