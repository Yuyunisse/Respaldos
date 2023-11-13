package com.example.Examen.Service;

import com.example.Examen.Entity.ExamenEntity;
import com.example.Examen.Repository.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ExamenService {

    @Autowired
    ExamenRepository examenRepository;

    public List<ExamenEntity> getAll() { return examenRepository.findAll();}
    public List<ExamenEntity> getExamenesByRut(String rut) { return examenRepository.findAllByrut(rut);}
   // public List<ExamenEntity> byAlumnoRut(String rut) {return examenRepository.findByRut(rut);}

    //Listar todos los examenes or fecha
    public List<ExamenEntity> getExamenesByFecha(Date fecha) { return examenRepository.findAllByRendicion(fecha); }


    //Guardar examen == Importar archivo.csv
    //Promedio
    //public double puntajesPorRut(String rut){
      //  List <ExamenEntity> puntajes =  examenRepository.findAllByrut(rut);
        //double prom = 0.0;
        //for (int i = 0; i < puntajes.size(); i++){
          //  double punt = examenRepository.obtenerPuntaje(puntajes.get(i));
            //prom = prom + punt;
        //}
        //prom = prom / puntajes.size();
        //return prom;

    //}

    //descuento por puntaje
   // public void descuento_puntaje(String rut){
     //   double promedio = puntajesPorRut(rut);
       // double descuento = 0.0;
        //double monto_cuota = pagoModel.getMonto();
        //Integer cuotas = pagoModel.getCant_cuotas();
       // if (cuotas.equals(1)){
        //}
        //else {
          //  if (promedio >= 950.0) {
            //    descuento = monto_cuota - ((monto_cuota * 10.0) / 100.0);
            //} else if (promedio >= 900.0 && promedio <= 949.0) {
              //  descuento = monto_cuota - ((monto_cuota * 5.0) / 100.0);
            //} else if (promedio >= 850.0 && promedio <= 899.0) {
              //  descuento = monto_cuota - ((monto_cuota * 2.0) / 100.0);
            //}
            //else if (promedio <= 850.0) {
              //  descuento = 0.0;
            //}
        //}
        //pagoModel.setMonto(descuento);
        //return;
   // }

    // Listar examenes por fecha
 //   public ArrayList<ExamenEntity> obtenerExamenFecha(Date fecha) {
   //     return (ArrayList<ExamenEntity>) examenRepository.findAllByRendicion(fecha);


}
