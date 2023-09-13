package com.hotel.buscador.huesped;

import com.hotel.huesped.HuespedEntity;
import org.springframework.stereotype.Service;

@Service
public class BuscadorHuespedService {



private  BuscadorHuespedRepository huespedRepository;


    public BuscadorHuespedService(BuscadorHuespedRepository huespedRepository) {
        this.huespedRepository = huespedRepository;
    }

        public HuespedEntity consultarPorId(Long id) {
            return huespedRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("El huésped con ID " + id + " no existe."));
        }

}
