package com.hotel.huesped;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table
public class HuespedEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;

	private String lastName;


	private LocalDate birthday;



	private Long numeroDeReserva;

	private String password;
	
	private String nacionalidad;


	private String numeroDeTelefono;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNumeroDeTelefono() {
		return numeroDeTelefono;
	}

	public void setNumeroDeTelefono(String numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}


	public void setNumeroDeReserva(Long numeroDeReserva) {
		this.numeroDeReserva = numeroDeReserva;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}




	public Long getNumeroDeReserva() {
		return numeroDeReserva;
	}









}
