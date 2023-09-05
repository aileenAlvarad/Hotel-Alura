package com.hotel.buscador.reservacion;

import org.springframework.stereotype.Service;

import com.hotel.reservacion.ReservacionEntity;

@Service
public class BuscadorReservacionService {
	
	private BuscadorReservacionRepository buscadorReservacionRepository;
	public BuscadorReservacionService(BuscadorReservacionRepository buscadorReservacionRepository) {
		this.buscadorReservacionRepository = buscadorReservacionRepository;
	}


	public ReservacionEntity buscarReservacionPorId(Long id) {
		return buscadorReservacionRepository.findById(id).get();
		
	} 
}
