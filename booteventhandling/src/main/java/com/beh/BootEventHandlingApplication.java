package com.beh;

import com.beh.listener.ApplicationEventStartedListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootEventHandlingApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplicationBuilder(BootEventHandlingApplication.class).listeners(new ApplicationEventStartedListener()).build();
        ApplicationContext context = springApplication.run(args);
        System.out.println("Application Started....");
    }
}
