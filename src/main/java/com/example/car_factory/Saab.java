package com.example.car_factory;

public class Saab implements Car{
    @Override
    public String brand() {
        return "Saab";
    }

    @Override
    public String carEngine() {
        return "V6";
    }
}
