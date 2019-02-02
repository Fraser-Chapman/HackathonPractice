package com.manchesterdigital.hackathonpractice.controller;

import com.manchesterdigital.hackathonpractice.domain.CarParks;
import com.manchesterdigital.hackathonpractice.service.CarParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/carpark")
public class CarParkController {
    private final CarParkService carParkService;

    @Autowired
    public CarParkController(CarParkService carParkService) {
        this.carParkService = carParkService;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/hal+json")
    @ResponseBody
    public CarParks getCarParks() {
        return carParkService.getCarParks();
    }

}
