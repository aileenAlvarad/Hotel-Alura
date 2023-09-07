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
	
	@GetMapping({"/altaReservacion"})
	public String altaReserva( ) {
		  System.out.println("Alta Reservacion");
		return "/altaReservacion2.html";
	}


	@GetMapping({"/altaHuesped"})
	public String altaHuesped( ) {
		return "/altaHuesped.html";
	}
	
}
