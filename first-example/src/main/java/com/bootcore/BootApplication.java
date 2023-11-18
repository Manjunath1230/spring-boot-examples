package com.bootcore;

import com.bootcore.beans.CreditScore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootApplication.class);
        CreditScore score = context.getBean(CreditScore.class);
        System.out.println(score);
    }
}
