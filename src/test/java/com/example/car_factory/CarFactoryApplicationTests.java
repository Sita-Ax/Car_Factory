package com.example.car_factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CarFactoryApplicationTests {

    CarFactory carFactory;

    @Test
    void contextLoads() {
    }

    @BeforeEach
    void setUp( ) {
        carFactory = new CarFactory("blue");
    }

    @Test
    void test_colors() {
        assertEquals("blue", carFactory.getColor());
    }
}
