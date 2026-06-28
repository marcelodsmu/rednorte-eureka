package com.rednorte.rednorte_eureka; // Tu package puede variar un poco, deja el que viene por defecto.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RednorteEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(RednorteEurekaApplication.class, args);
    }
}