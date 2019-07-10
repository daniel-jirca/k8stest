package com.qualitance.service;

import com.qualitance.config.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
@EnableConfigurationProperties
public class Tasker {

    private final ApplicationProperties appProps;

    public Tasker(ApplicationProperties appProps) {
        this.appProps = appProps;
    }

    @Scheduled(fixedRate = 10000)
    public void startSch(){
        System.out.println("Printing the bean object:" + appProps.getTitle());
    }
}
