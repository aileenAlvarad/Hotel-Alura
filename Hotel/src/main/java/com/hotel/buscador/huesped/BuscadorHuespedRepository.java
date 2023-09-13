package com.hotel.buscador.huesped;

import com.hotel.huesped.HuespedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuscadorHuespedRepository extends JpaRepository<HuespedEntity,Long> {

}
