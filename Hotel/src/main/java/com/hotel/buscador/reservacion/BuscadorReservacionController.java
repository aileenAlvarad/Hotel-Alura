package com.hotel.buscador.reservacion;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crosscutting.BaseController;
import com.hotel.reservacion.ReservacionEntity;

//Get http://localhost:8080/hotel/buscar/reservacion/{id}

@RequestMapping("/buscar")
@Controller
@RestController
public class BuscadorReservacionController extends BaseController {

	private BuscadorReservacionService buscadorReservacionService;

	public BuscadorReservacionController(BuscadorReservacionService buscadorReservacionService) {
		this.buscadorReservacionService = buscadorReservacionService;
	}

	@GetMapping(value = "/reservacion/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ReservacionEntity buscarReservaciones(@PathVariable Long id) {
		return buscadorReservacionService.buscarReservacionPorId(id);
	}

}
