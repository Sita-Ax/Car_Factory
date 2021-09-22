package com.example.car_factory;

public class Volvo implements Car{

    @Override
    public String brand() {
        return "Volvo";
    }

    @Override
    public String carEngine() {
        return "V8";
    }
}
