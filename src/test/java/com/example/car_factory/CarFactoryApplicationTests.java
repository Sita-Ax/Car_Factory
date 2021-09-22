package com.example.car_factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CarFactoryApplicationTests {

    CarFactory carFactory;
    CarFactory Ford;
    CarFactory Volvo;
    CarFactory Saab;

    @Test
    void contextLoads() {
    }

    @BeforeEach
    void setUp( ) {
        carFactory = new CarFactory("blue");
        Ford = new CarFactory("green");
        Ford.createCar(CarType.FORD);
        Volvo = new CarFactory("orange");
        Volvo.createCar(CarType.VOLVO);
        Saab = new CarFactory("white");
        Saab.createCar(CarType.SAAB);

    }

    @Test
    void test_colors() {
        assertEquals("blue", carFactory.getColor());
    }

    @Test
    void test_Brands() {
        assertEquals("Saab", Saab.getCar().brand());
        assertEquals("Ford", Ford.getCar().brand());
        assertEquals("Volvo", Volvo.getCar().brand());

    }

}
