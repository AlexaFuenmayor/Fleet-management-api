package com.fleet.fleetmanagement.controllers;

import com.fleet.fleetmanagement.models.Taxi;
import com.fleet.fleetmanagement.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("taxis")

public class TaxiControllers {
    @Autowired
    private TaxiRepository repository;

    @GetMapping("/")
    public List<Taxi> list(){
        return repository.findAll();

    }


}
