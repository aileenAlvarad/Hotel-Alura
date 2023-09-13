package com.hotel.buscador.huesped;

import com.hotel.huesped.HuespedEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.crosscutting.BaseController;


//Get http://localhost:8080/hotel/buscar/huesped/{id}
@RequestMapping("/buscar")
@Controller
@RestController
public class BuscadorHuespedController extends BaseController {

    private BuscadorHuespedService BuscadorHuespedService;


    public BuscadorHuespedController(com.hotel.buscador.huesped.BuscadorHuespedService buscadorHuespedService) {
        BuscadorHuespedService = buscadorHuespedService;
    }


    @GetMapping(value="/huesped/{id}")
    @ResponseStatus(HttpStatus.OK)
    public HuespedEntity consultarporId(@PathVariable Long id) {
        return BuscadorHuespedService.consultarPorId(id);
    }




}
