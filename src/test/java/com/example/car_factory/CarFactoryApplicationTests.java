package com.example.car_factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarFactoryApplicationTests {

    CarFactory carFactory;
    @Test
    void contextLoads() {
    }

    @BeforeEach
    void setUp() {
        carFactory = new CarFactory();
    }

    @Test
    void test_colors() {

    }
}
