package com.hotel.huesped;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.crosscutting.BaseController;

import java.util.List;

//GET: http://localhost:8080/hotel/

@RestController
@RequestMapping("/huesped")
public class HuespedController extends BaseController {

    private HuespedService huespedservice;

    public HuespedController(HuespedService huespedservice) {
        this.huespedservice = huespedservice;
    }

    @GetMapping(value="/consultar")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<HuespedEntity> consultarTodo() {
        return huespedservice.consultarTodo();
    }

    @PutMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    public String editarHuesped(@RequestBody HuespedEntity huespedEntity) {
        return "La solicitud se envio"+huespedEntity.getName();}


    @PostMapping(value = "/editar")
    @ResponseStatus(HttpStatus.CREATED)
    public String crearHuesped(@RequestBody HuespedEntity huespedEntity) {
return "Huesped Editado con el nombre de : "+huespedEntity.getName();
    }

}












