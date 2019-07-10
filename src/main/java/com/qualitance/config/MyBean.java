package com.qualitance.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
public class MyBean {

        @Autowired
        private ApplicationProperties appProps;

        public void startApplication() {
            System.out.printf("-- running application: %s --%n", appProps.getTitle());

        }
}
