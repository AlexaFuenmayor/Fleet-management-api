package com.fleet.fleetmanagement.repository;

import com.fleet.fleetmanagement.models.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi, Integer> {
}
