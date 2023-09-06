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

	public ReservacionEntity guardarReservas(ReservacionDTO reservacionDTO) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
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

	public ReservacionEntity modificarReservacion(ReservacionDTO reservacionDTO) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate checkIn = LocalDate.parse(reservacionDTO.checkIn(), formatter);
		LocalDate checkOut = LocalDate.parse(reservacionDTO.checkOut(), formatter);
		ReservacionEntity reservacionEntity = reservacionRepository.findById(reservacionDTO.id()).orElse(null);
		reservacionEntity.setCheckIn(checkIn);
		reservacionEntity.setCheckOut(checkOut);
		reservacionEntity.setFormaPago(reservacionDTO.formaPago());
		reservacionEntity.setValorReserva(reservacionDTO.valorReserva());
		return reservacionRepository.save(reservacionEntity);
	}

}
