package com.example.car_factory;

public class CarFactory {

    String color;
    Car car;
    String carEngine;
    String brand;
    String licencePlate;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public CarFactory(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    Car createCar(CarType carType) {
        switch (carType) {
            case VOLVO: {
                car = new Volvo();
                return car;

            }
            case FORD: {
                car = new Ford();
                return car;
            }
            case SAAB: {
                car = new Saab();
                return car;
            }
        }
        throw new RuntimeException("No car could be made");
    }



}
