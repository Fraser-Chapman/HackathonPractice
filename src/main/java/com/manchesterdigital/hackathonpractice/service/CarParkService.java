package com.manchesterdigital.hackathonpractice.service;

import com.manchesterdigital.hackathonpractice.FileConverter;
import com.manchesterdigital.hackathonpractice.domain.CarPark;
import com.manchesterdigital.hackathonpractice.domain.CarParks;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarParkService {

    public static final String CAR_PARK_DATA_1 = "src/main/resources/carpark/CarParkData_1.xml";
    public static final String Car_Park_Data_2 = "src/main/resources/carpark/CarParkData_2.xml";
    public static final String Car_Park_Data_3 = "src/main/resources/carpark/CarParkData_3.xml";
    public static final String Car_Park_Data_4 = "src/main/resources/carpark/CarParkData_4.xml";
    public static final String Car_Park_Data_5 = "src/main/resources/carpark/CarParkData_5.xml";
    public static final String Car_Park_Data_6 = "src/main/resources/carpark/CarParkData_6.xml";
    public static final String Car_Park_Data_7 = "src/main/resources/carpark/CarParkData_7.xml";
    public static final String Car_Park_Data_8 = "src/main/resources/carpark/CarParkData_8.xml";

    public CarParks getCarParks() {
        List<String> filepaths = Arrays.asList(CAR_PARK_DATA_1,
                Car_Park_Data_2,
                Car_Park_Data_3,
                Car_Park_Data_4,
                Car_Park_Data_5,
                Car_Park_Data_6,
                Car_Park_Data_7,
                Car_Park_Data_8);

//        CarPark carPark1 = new CarPark("Total Car Parks: Strangeways");
//        CarPark carPark2 = new CarPark("NCP: Chillangos");


        FileConverter fileConverter = new FileConverter();

        for (String filepath : filepaths) {
            fileConverter.generateCarParks(filepath);
        }

        //return new CarParks(Arrays.asList(carPark1, carPark2));
        return null;
    }
}
