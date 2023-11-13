package com.example.TopAlumno.Repository;

import com.example.TopAlumno.Entity.AlumnoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoEntity, String> {


    AlumnoEntity findByRut(String rut);

    List<AlumnoEntity> findAllByRut(String rut);

    // List<AlumnoEntity> findByRut(String rut);
   // public default String tipoColegio(AlumnoEntity alumno){
    //    return alumno.getTipoColegio();
    //}

//    public default Integer cantCuotas(AlumnoEntity alumno){
  //      return alumno.getCuotas();
    //}

    //public default Integer ano_egreso(AlumnoEntity alumno){
      //  return alumno.getEgreso();
    //}
}
