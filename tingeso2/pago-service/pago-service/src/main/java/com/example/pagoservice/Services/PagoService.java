package com.example.pagoservice.Services;


import com.example.pagoservice.entity.PagoEntity;
import com.example.pagoservice.repositories.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {
    @Autowired
    PagoRepository pagoRepository;

    //obtener los pagos e informacion del estudiante
    public List<PagoEntity> getHistorialAlumno(String rut){
        return pagoRepository.findAllByRut(rut);
    }
}
