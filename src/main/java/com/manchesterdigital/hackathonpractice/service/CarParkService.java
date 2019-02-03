package com.manchesterdigital.hackathonpractice.service;

import com.manchesterdigital.hackathonpractice.FileConverter;
import com.manchesterdigital.hackathonpractice.domain.CarPark;
import com.manchesterdigital.hackathonpractice.domain.CarParks;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CarParkService {

    public static final String Car_Park_Data = "src/main/resources/carpark/CarParkData_1.xml";

    public CarParks getCarParks() {
        CarPark carPark1 = new CarPark("Total Car Parks: Strangeways");
        CarPark carPark2 = new CarPark("NCP: Chillangos");


        FileConverter fileConverter = new FileConverter();

        fileConverter.readXmlFromFile(Car_Park_Data);

        return new CarParks(Arrays.asList(carPark1, carPark2));
    }
}
