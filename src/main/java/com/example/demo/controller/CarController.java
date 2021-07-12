package com.example.demo.controller;

import com.example.demo.annotation.CarResolver;
import com.example.demo.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @RequestMapping
    public Car getCar(@CarResolver Car car) {
        return car;
    }
}
