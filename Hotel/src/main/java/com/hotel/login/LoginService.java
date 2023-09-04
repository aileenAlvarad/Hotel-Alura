package com.hotel.login;

import org.springframework.stereotype.Service;

import com.hotel.huesped.HuespedEntity;

@Service
public class LoginService {

	private LoginRepository loginRepository;
	
	public LoginService(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}
	
	
	public HuespedEntity login(LoginDTO loginDTO) {
		
		HuespedEntity huesped = loginRepository.findByNameAndPassword("aaa", "123");
		if (huesped == null) {
			huesped = new HuespedEntity();
			huesped.setName("aaa");
			huesped.setPassword("123");
			huesped.setNacionalidad("Mexicano");
			loginRepository.save(huesped);
		}
		return loginRepository.findByNameAndPassword(loginDTO.usuario(), loginDTO.password());
	}

}
