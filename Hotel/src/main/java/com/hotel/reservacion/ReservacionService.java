package com.hotel.reservacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ReservacionService { 
	
	private ReservacionRepository reservacionRepository;

	
	public ReservacionService(ReservacionRepository reservacionRepository) {
		this.reservacionRepository = reservacionRepository;
	} 
	
	public ReservacionEntity registrarReservas(ReservacionDTO reservacionDTO){ 
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 LocalDate checkIn = LocalDate.parse(reservacionDTO.checkIn(), formatter); 
		 LocalDate checkOut = LocalDate.parse(reservacionDTO.checkOut(), formatter);
		 
		ReservacionEntity reservacionEntity = new ReservacionEntity(); 
		reservacionEntity.setCheckIn(checkIn);
		reservacionEntity.setCheckOut(checkOut);
		reservacionEntity.setValorReserva(reservacionDTO.valorReserva());
		reservacionEntity.setFormaPago(reservacionDTO.formaPago());
		System.out.println(reservacionEntity);
		return reservacionRepository.save(reservacionEntity); 
	}
	
	public List<ReservacionEntity> consultarTodasLasReservaciones() {
		return reservacionRepository.findAll();
		
	} 
	
	public Long eliminarReservacion(Long id) {
		reservacionRepository.deleteById(id);
		return id; 
	}  
	
	
}
