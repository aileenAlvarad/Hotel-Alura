package com.hotel.reservacion;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crosscutting.BaseController;
/*
{
  "checkIn": "02-05-2023",
  "checkOut": "05-05-2023",
  "valorReserva": 1000,
  "formaPago": "transferencia"
}
 */
//POST http://localhost:8080/hotel/reservacion/  

@RequestMapping("/reservacion")
@Controller
@RestController 
public class ReservacionController extends BaseController{
	
	private ReservacionService reservacionService;
	
	public ReservacionController(ReservacionService reservacionService) {
		this.reservacionService = reservacionService;
	}

	@PostMapping(value = "/")
	@ResponseStatus(HttpStatus.OK)
	public ReservacionEntity reservar(@RequestBody ReservacionDTO reservacionDTO) {
		return reservacionService.guardarReservas(reservacionDTO);
	}
	 
	
	@GetMapping(value = "/consultar")
	@ResponseStatus(HttpStatus.OK)
	public List<ReservacionEntity> consultar() {
		return reservacionService.consultarTodasLasReservaciones();
	}  
	
	@PutMapping(value = "/")
	@ResponseStatus(HttpStatus.OK)
	public ReservacionEntity modificar(@RequestBody ReservacionDTO reservacionDTO) {
		return reservacionService.modificarReservacion(reservacionDTO);
	}
	
	@DeleteMapping(value = "/eliminar/{id}")
	@ResponseStatus(HttpStatus.OK) 
	public Long eliminarReservacion(@PathVariable Long id) {
		return reservacionService.eliminarReservacion(id);
	}
	
	
}
