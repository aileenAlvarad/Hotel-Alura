package com.hotel.huesped;
import java.util.Objects;
public record HuespedDTO(

        Long id,
        String name,
        String lastName,
        String birthday,
        Long numeroDeReserva,
        String nacionalidad,
        String numeroDeTelefono

) {

    // Puedes agregar métodos de acceso (getters) si lo deseas
}
