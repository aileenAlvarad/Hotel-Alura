package com.hotel.huesped;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {


    private HuespedRepository huespedrepository;

    public HuespedService(HuespedRepository huespedrepository) {
        this.huespedrepository = huespedrepository;
    }

    public List<HuespedEntity> consultarTodo() {


        return huespedrepository.findAll();
    }
}
