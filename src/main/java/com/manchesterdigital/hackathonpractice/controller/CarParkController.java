package com.manchesterdigital.hackathonpractice.controller;

import com.manchesterdigital.hackathonpractice.domain.CarPark;
import com.manchesterdigital.hackathonpractice.domain.CarParks;
import com.manchesterdigital.hackathonpractice.service.CarParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/carpark")
public class CarParkController {
    private final CarParkService carParkService;

    @Autowired
    public CarParkController(CarParkService carParkService) {
        this.carParkService = carParkService;
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(method = RequestMethod.GET, produces = "application/hal+json")
    @ResponseBody
    public CarPark getCarParks() {
        System.out.println("hi");
        return new CarPark("name", "short", "pay and display", "Manchester", "M15 4FN");
        //return carParkService.getCarParks();
    }

}
