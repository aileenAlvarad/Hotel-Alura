package com.hotel.huesped;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class HuespedService {


    private HuespedRepository huespedrepository;

    public HuespedService(HuespedRepository huespedrepository) {
        this.huespedrepository = huespedrepository;
    }



    public  HuespedEntity crearHuesped(HuespedEntity huespedEntity) {

        HuespedEntity nuevoHuesped = huespedrepository.save(huespedEntity);

        return nuevoHuesped;
    }




    public List<HuespedEntity> consultarTodo() {

        return huespedrepository.findAll();
    }

    public HuespedEntity actualizarHuesped(HuespedEntity huespedEntity) {
        // Verificar si el huésped existe en la base de datos por su ID
        Long huespedId = huespedEntity.getId();
        if (huespedId != null && huespedrepository.existsById(huespedId)) {
            // El huésped existe, por lo que se actualiza
            return huespedrepository.save(huespedEntity);
        } else {
             // Puedes lanzar una excepción o realizar alguna otra acción
            throw new RuntimeException("El huésped con ID " + huespedId + " no existe.");
        }
    }


    public void borrarHuesped(Long id) {
        // Verificar si el huésped existe en la base de datos por su ID
        if (huespedrepository.existsById(id)) {
            // El huésped existe, por lo que se elimina
            huespedrepository.deleteById(id);
        } else {

            throw new RuntimeException("El huésped con ID " + id + " no existe.");
        }
    }

    public HuespedEntity consultarPorId(Long id) {
        return huespedrepository.findById(id)
                .orElseThrow(() -> new RuntimeException("El huésped con ID " + id + " no existe."));
    }

}
