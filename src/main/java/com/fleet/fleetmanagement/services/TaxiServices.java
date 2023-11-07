package com.fleet.fleetmanagement.services;

import com.fleet.fleetmanagement.models.Taxi;
import com.fleet.fleetmanagement.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxiServices {
    private final TaxiRepository taxiRepository;

    @Autowired
    public TaxiServices(TaxiRepository taxiRepository){
        this.taxiRepository = taxiRepository;
    }
    public Taxi createTaxi(Taxi taxi){
        return taxiRepository.save(taxi);
    }

}
