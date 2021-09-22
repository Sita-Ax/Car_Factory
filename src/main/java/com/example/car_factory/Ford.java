package com.example.car_factory;

public class Ford implements Car{
    @Override
    public String brand() {
        return "Ford";
    }

    @Override
    public String carEngine() {
        return "V12";
    }
}
