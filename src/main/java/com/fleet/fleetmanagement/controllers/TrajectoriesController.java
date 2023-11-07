package com.fleetmanagement.demo.controllers;

import com.fleet.fleetmanagement.models.Taxi;
import com.fleet.fleetmanagement.models.Trajectories;
import com.fleet.fleetmanagement.repository.TrajectorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("trajectories")

public class TrajectoriesController {
    @Autowired
    private TrajectorieRepository repository;
    @GetMapping("/")
    public List<Trajectories> list(@RequestParam Integer taxi_id) {
        return repository.listTrajectories(taxi_id);
    }

}
