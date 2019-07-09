package com.qualitance.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainResource {

    @Value("${title:VALUE_NOT_DEFINED}")
    private String appTitle;

    @GetMapping("/get-message")
    public String getMessage(){
        return appTitle;
    }

}
