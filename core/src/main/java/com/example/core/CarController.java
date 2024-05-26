package com.example.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {


    @GetMapping
    public List<Car> findAll() throws InterruptedException {
        Thread.sleep(3000);
        return List.of(
                new Car("Lexus", "silver", "xxxxx1111", 2023));
    }
}
