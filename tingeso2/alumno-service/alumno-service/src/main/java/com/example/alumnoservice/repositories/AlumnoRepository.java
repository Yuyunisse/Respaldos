package com.example.alumnoservice.repositories;

import com.example.alumnoservice.entity.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoEntity, String> {

    AlumnoEntity findByRut(String rut);

    List<AlumnoEntity> findAllByRut(String rut);

}
