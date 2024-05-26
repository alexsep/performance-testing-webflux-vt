package com.example.client_vt;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "core-app", url = "localhost:8087/cars")
public interface CarCoreClient {


    @GetMapping
    List<Car> getCars();

}
