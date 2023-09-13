package com.hotel.login;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.huesped.HuespedEntity;

public interface LoginRepository extends JpaRepository<HuespedEntity, Long>{

	 public Optional<HuespedEntity> findByNameAndPassword(String name, String password);
}
