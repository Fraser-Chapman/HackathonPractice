package com.manchesterdigital.hackathonpractice;


import com.manchesterdigital.hackathonpractice.domain.CarPark;
import com.manchesterdigital.hackathonpractice.domain.CarParks;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileConverter {
    private static final String CAR_PARK_DATA_1 = "src/main/resources/carpark/CarParkData_1.xml";
    private static final String Car_Park_Data_2 = "src/main/resources/carpark/CarParkData_2.xml";
    private static final String Car_Park_Data_3 = "src/main/resources/carpark/CarParkData_3.xml";
    private static final String Car_Park_Data_4 = "src/main/resources/carpark/CarParkData_4.xml";
    private static final String Car_Park_Data_5 = "src/main/resources/carpark/CarParkData_5.xml";
    private static final String Car_Park_Data_6 = "src/main/resources/carpark/CarParkData_6.xml";
    private static final String Car_Park_Data_7 = "src/main/resources/carpark/CarParkData_7.xml";
    private static final String Car_Park_Data_8 = "src/main/resources/carpark/CarParkData_8.xml";

    public CarParks generateCarParks(String filePath) {
        //https://www.youtube.com/watch?v=2JH5YeQ68H8

        List<CarPark> carParks = new ArrayList<>();

        try {
            File xmlDoc = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlDoc);

            NodeList nodeList = document.getElementsByTagName("CarPark");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String name = element.getElementsByTagName("CarParkName").item(0).getTextContent();
                    String location = element.getElementsByTagName("Location").item(0).getTextContent();
                    String postcode = element.getElementsByTagName("Postcode").item(0).getTextContent();
                    String stayType = element.getElementsByTagName("StayType").item(0).getTextContent();
                    String paymentType = element.getElementsByTagName("PaymentType").item(0).getTextContent();

                    carParks.add(mapToCarPark(name, location, postcode, stayType, paymentType));
                }
            }

            //TODO handle error better
        } catch (Exception e) {
            System.out.println("fuck");
        }

        return new CarParks(carParks);

    }

    private CarPark mapToCarPark(String carParkName, String location, String postcode, String stayType, String paymentType) {
        return new CarPark(carParkName, stayType, location, postcode, paymentType);
    }

    public static void main(String[] args) {
        FileConverter fileConverter = new FileConverter();

//        List<String> filepaths = Arrays.asList(CAR_PARK_DATA_1,
//                Car_Park_Data_2,
//                Car_Park_Data_3,
//                Car_Park_Data_4,
//                Car_Park_Data_5,
//                Car_Park_Data_6,
//                Car_Park_Data_7,
//                Car_Park_Data_8);
//
//        for (String filepath : filepaths) {
//            fileConverter.generateCarParks(filepath);
//        }

        CarParks carParks = fileConverter.generateCarParks(CAR_PARK_DATA_1);
        System.out.println(carParks.getCarParks().get(0).getName());

        //TODO check for duplicates
    }
}
