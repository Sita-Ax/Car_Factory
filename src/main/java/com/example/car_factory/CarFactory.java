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
        this.licencePlate = generateLicencePlate();
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

    public String generateLicencePlate() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char ch = (char) (Math.random() * 26 + 'A');
            s.append(ch);
        }
        for (int i = 0; i < 3; i++) {
            char digit1 = (char) (Math.random() * 10 + '0');
            s.append(digit1);
        }
        String licenceplate = String.valueOf(s);
        return licenceplate;
    }



}
