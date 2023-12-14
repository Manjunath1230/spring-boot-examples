package com.sbc.beans;

import org.springframework.boot.Banner;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class BootCustomizedApplication {
    public static void main(String[] args) {
        // ApplicationContext context = SpringApplication.run(BootCustomizedApplication.class,args);
        /*SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(BootCustomizedApplication.class);
        springApplicationBuilder.bannerMode(Banner.Mode.OFF);
        SpringApplication springApplication = springApplicationBuilder.build();
        ApplicationContext context = springApplication.run(args);*/
        ApplicationContext context = new SpringApplicationBuilder(BootCustomizedApplication.class).bannerMode(Banner.Mode.OFF).build().run(args);
        Truck truck = context.getBean(Truck.class);
        truck.getStart();
    }
}
