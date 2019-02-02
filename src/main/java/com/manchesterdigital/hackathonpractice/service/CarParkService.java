package com.manchesterdigital.hackathonpractice.service;

import com.manchesterdigital.hackathonpractice.domain.CarPark;
import com.manchesterdigital.hackathonpractice.domain.CarParks;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CarParkService {

    public CarParks getCarParks() {
        CarPark carPark1 = new CarPark("Total Car Parks: Strangeways");
        CarPark carPark2 = new CarPark("NCP: Chillangos");

        return new CarParks(Arrays.asList(carPark1, carPark2));
    }
}
