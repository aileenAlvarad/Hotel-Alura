package com.hotel.buscador.reservacion;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.reservacion.ReservacionEntity;

public interface BuscadorReservacionRepository extends JpaRepository<ReservacionEntity, Long>{

}
