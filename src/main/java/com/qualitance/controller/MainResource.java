package com.qualitance.controller;

import com.qualitance.config.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainResource {

//    @Autowired
    private final ApplicationProperties appProps;

    public MainResource(ApplicationProperties appProps) {
        this.appProps = appProps;
    }

    @GetMapping("/get-message")
    public String getMessage(){
        System.out.println("Request to get app title! Getting it from the object "+ appProps.toString());
        return appProps.getTitle();
    }

}
