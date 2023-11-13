package com.example.Pagos.Repository;

import com.example.Pagos.Entity.PagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface PagoRepository extends JpaRepository<PagoEntity, Long> {

    List<PagoEntity> findAll();

    //buscar por rut
    List<PagoEntity> findAllByRut(String rut);



  //  public default Integer cantidadCuotas(PagoEntity pago){
    //    return pago.getCant_cuotas();
    //}
    //public default Double obtener_monto(PagoEntity pago){
      //  return pago.getMonto();
    //}
    //public default Date vencimiento(PagoEntity pago){
     //   return pago.getFecha_vencimiento();
    //}

   // public default void cambio_monto(PagoEntity pago, Double interes){
     //   double monto_nuevo = pago.getMonto() + interes;
       // pago.setMonto(monto_nuevo);
       // return;
    //}
}