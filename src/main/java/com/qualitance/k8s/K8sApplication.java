package com.qualitance.k8s;

import com.qualitance.service.Tasker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.qualitance")
public class K8sApplication {

//    @Autowired
    private final Tasker tasker;

    public K8sApplication(Tasker tasker) {
        this.tasker = tasker;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(K8sApplication.class, args);
        Tasker bean = ctx.getBean(Tasker.class);
        bean.startSch();
    }
}