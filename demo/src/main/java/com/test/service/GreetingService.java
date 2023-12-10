package com.test.service;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingService {

    public static String greeting() {
        return "Please, Hot dog World~";
    }   
}
