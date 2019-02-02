package com.manchesterdigital.hackathonpractice.domain;

import java.util.List;

public class CarParks {
    private final List<CarPark> carParks;

    public CarParks(List<CarPark> carParks) {
        this.carParks = carParks;
    }

    public List<CarPark> getCarParks() {
        return carParks;
    }
}
