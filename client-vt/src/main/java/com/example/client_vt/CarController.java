package com.example.client_vt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarCoreClient carCoreClient;

    @Autowired
    public CarController(CarCoreClient carCoreClient) {
        this.carCoreClient = carCoreClient;
    }


    @GetMapping
    public List<Car> findAll() throws InterruptedException {

        System.out.println("Calling the core application");
        return carCoreClient.getCars();
    }
}
