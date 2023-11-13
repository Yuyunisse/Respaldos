package com.example.Pagos.Service;

import com.example.Pagos.Entity.PagoEntity;
import com.example.Pagos.Repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PagoService {

    @Autowired
    PagoRepository pagoRepository;

    //obtener los pagos e informacion del estudiante
    public List<PagoEntity> getHistorialAlumno(String rut){
        return pagoRepository.findAllByRut(rut);
    }






    //Calculo de interes por no pago de cuota
  //  public void interes(PagoEntity pago, Date fecha_actual){
    //    double monto_actual = pagoRepository.obtener_monto(pago);
      //  Date fecha = pagoRepository.vencimiento(pago);
        //Integer mes_vencimeinto = fecha.getMonth();
       // Integer mes_actual = fecha_actual.getMonth();
        //Double monto_interes = 0.0;
        //Integer diferencia = mes_actual - mes_vencimeinto;
        //if (diferencia > 3) {
          //  monto_interes = monto_actual + ((monto_actual*15.0) /100.0);
        //}
        //else if (diferencia.equals(3)) {
          //  monto_interes = monto_actual + ((monto_actual*9.0) /100.0);
        //}
        //else if (diferencia.equals(2)) {
          //  monto_interes = monto_actual + ((monto_actual*6.0) /100.0);
        //}
        //else if (diferencia.equals(1)) {
         //   monto_interes = monto_actual + ((monto_actual*3.0) /100.0);
        //}
        //else {
          //  monto_interes = monto_actual;
        //}
        //pagoRepository.cambio_monto(pago, monto_interes);
    //}

}
