package com.sbmp;

import com.sbmp.beans.RocketLunchPad;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootApplication.class);
        RocketLunchPad rocketLunchPad = context.getBean(RocketLunchPad.class);
        rocketLunchPad.getLunchPad();
    }
}
