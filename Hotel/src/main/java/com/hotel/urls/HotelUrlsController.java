package com.hotel.urls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 

@Controller
public class HotelUrlsController {

	@GetMapping({"/login3"})
	public String landingPage3( ) {
		  System.out.println("Login page");
		return "/loginpage.html";
	}
	
	
	@GetMapping({"/login", "/"})
	public String pagesLogin( ) {
		  System.out.println("Login page");
		return "/pages-login.html";
	} 
	
	@GetMapping({"/altaReservacion"}) //http://localhost:8080/hotel/altaReservacion
	public String altaReserva( ) {
		  System.out.println("Alta Reservacion");
		return "/altaReservacion2.html";
	} 
	
	@GetMapping({"/altaHuesped"})
	public String altaHuesped( ) {
		return "/altaHuesped.html";
	} 
	
	@GetMapping({"/buscar"}) //http://localhost:8080/hotel/buscar
	public String buscador( ) {
		  System.out.println("Buscador");
		return "/buscar.html";
	} 
	
	@GetMapping({"/modificarReservaciones"}) // http://localhost:8080/hotel/modificarReservaciones?id=1
	public String modificadorReservaciones( ) {
		  System.out.println("modificadorReservaciones");
		return "/modificarReservaciones.html";
	}


	@GetMapping({"/modificarHuesped"}) // http://localhost:8080/hotel/modificarHuesped?id=1
	public String modificadorHuesped( ) {
		System.out.println("modificadorReservaciones");
		return "/modificarHuesped.html";
	}


	
}
