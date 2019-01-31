package com.manchesterdigital.hackathonpractice.controller;

import com.manchesterdigital.hackathonpractice.service.CarParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("get")
    @ResponseBody
    public String getCarParks() {
        System.out.println("hi");
        return carParkService.getCarParks().toString() + "Hello Fraser";
    }

}
