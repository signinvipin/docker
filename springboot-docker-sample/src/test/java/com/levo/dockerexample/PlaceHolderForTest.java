package com.levo.dockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Spring Boot application entry point
@SpringBootApplication
public class PlaceHolderForTest {
    public static void main(String[] args) {
        SpringApplication.run(PlaceHolderForTest.class, args);
    }
}

// REST controller for "/" endpoint
@RestController
class HomeController {
    @GetMapping("/")
    public String home() {
        return "hello! This is a test app.\nCongratulations on setting up docker image successfully.\n\n" +
            "/\\_/\\  \n" +
            "( o.o ) \n" +
            " > ^ < ";
    }
}

