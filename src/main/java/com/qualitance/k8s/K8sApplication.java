package com.qualitance.k8s;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.qualitance")
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

        @Value("${app.title:#{null}}")
        private String appTitle;

        public void startApplication() {
            System.out.printf("-- running application: %s --%n", appTitle);

        }
    }
}