package com.manchesterdigital.hackathonpractice.service;

import com.manchesterdigital.hackathonpractice.domain.CarParks;
import org.springframework.stereotype.Service;

@Service
public class CarParkService {

    public CarParks getCarParks() {
        return new CarParks();
    }
}
