package com.ly.reservesrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ReservesrcApplication   {

    public static void main(String[] args) {
        SpringApplication.run(ReservesrcApplication.class, args);
    }

}
