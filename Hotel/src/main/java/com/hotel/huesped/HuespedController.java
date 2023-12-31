package com.hotel.huesped;

import com.hotel.reservacion.ReservacionEntity;
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


    @GetMapping(value="/hola")
    @ResponseStatus(HttpStatus.OK)
    public String hola() {
        return "HOla estoy vivo";
    }




    @PutMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    public HuespedEntity actualizarHuesped(@RequestBody HuespedEntity HuespedEntity) {
         HuespedEntity updateHuesped=huespedservice.actualizarHuesped(HuespedEntity);
        return updateHuesped;}


    @PostMapping(value ="/")
    @ResponseStatus(HttpStatus.OK)
    public HuespedEntity crearHuesped(@RequestBody HuespedDTO huespedDTO) throws Exception {
            return huespedservice.crearHuesped(huespedDTO);
    }


    @DeleteMapping(value = "/eliminar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void borrarHuesped(@PathVariable Long id){

      huespedservice.borrarHuesped(id);
    }




}












