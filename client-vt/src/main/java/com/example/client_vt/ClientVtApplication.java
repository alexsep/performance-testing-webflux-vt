package com.example.client_vt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class ClientVtApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientVtApplication.class, args);
    }

}
