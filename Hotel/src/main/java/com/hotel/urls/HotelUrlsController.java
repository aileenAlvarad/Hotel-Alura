package com.hotel.urls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 

@Controller
public class HotelUrlsController {

	@GetMapping({"/login3", "/"})
	public String landingPage3( ) {
		  System.out.println("Login page");
		return "/loginpage.html";
	}
	
}
