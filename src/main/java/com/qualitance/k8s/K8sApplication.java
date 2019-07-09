package com.qualitance.k8s;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@ComponentScan("com.qualitance")
@EnableScheduling
public class K8sApplication {

    @Bean
    MyBean myBean() {
        return new MyBean();
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(K8sApplication.class, args);
        MyBean bean = ctx.getBean(MyBean.class);
        bean.startApplication();
    }

    private static class MyBean {

        @Value("${title:VALUE_NOT_DEFINED}")
        private String appTitle;

        @Scheduled(fixedRate = 10000)
        public void startApplication() {
            System.out.printf("-- running application: %s --%n", appTitle);

        }
    }
}