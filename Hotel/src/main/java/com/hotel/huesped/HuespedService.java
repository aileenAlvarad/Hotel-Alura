package com.hotel.huesped;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.swing.text.html.parser.Entity;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;


@Service
public class HuespedService {


    private HuespedRepository huespedrepository;

    public HuespedService(HuespedRepository huespedrepository) {
        this.huespedrepository = huespedrepository;
    }


    public HuespedEntity crearHuesped(HuespedDTO huespedDTO) throws Exception {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthday = LocalDate.parse(huespedDTO.birthday(), formatter);

            HuespedEntity huespedEntity = new HuespedEntity();
            huespedEntity.setName(huespedDTO.name());
            huespedEntity.setLastName(huespedDTO.lastName());
            huespedEntity.setBirthday(birthday);
            huespedEntity.setId(huespedDTO.id());
            huespedEntity.setNacionalidad(huespedDTO.nacionalidad());
            huespedEntity.setNumeroDeTelefono(huespedDTO.numeroDeTelefono());
            huespedEntity.setPassword(huespedDTO.password());
            Random random = new Random();

            Long numeroRandom = 1000 + random.nextLong(9000); // Número aleatorio entre 1000 y 9999
            huespedEntity.setNumeroDeReserva(numeroRandom);

            huespedEntity = huespedrepository.save(huespedEntity);
            HuespedEntity user=huespedEntity;
            // Guarda la entidad en la base de datos
            System.out.println(user.getNumeroDeReserva());
            return huespedEntity;

        } catch (Exception e) {
            // Manejo de errores
            throw new Exception("Error al crear el huésped: " + e.getMessage());
        }
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




}
