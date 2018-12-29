package com.betse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties(StorageProporties.class)
public class BookingApplication {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(BookingApplication.class, args);
    }
}
