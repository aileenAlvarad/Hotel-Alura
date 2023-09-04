package com.hotel.login;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.huesped.HuespedEntity;

public interface LoginRepository extends JpaRepository<HuespedEntity, Long>{

	 public HuespedEntity findByNameAndPassword(String name, String password);
}
