package com.manchesterdigital.hackathonpractice.domain;

public class CarPark {
    private String name;
    private String stayType;
    private String paymentType;
    private String location;
    private String postcode;


    public CarPark(String name, String stayType, String paymentType, String location, String postcode) {
        this.name = name;
        this.stayType = stayType;
        this.paymentType = paymentType;
        this.location = location;
        this.postcode = postcode;
    }

    public String getStayType() {
        return stayType;
    }

    public String getPaymentType() {
        return paymentType;
    }
    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
