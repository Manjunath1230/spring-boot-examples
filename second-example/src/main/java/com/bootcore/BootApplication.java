package com.bootcore;

import com.bootcore.beans.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootApplication.class);
        Address address = context.getBean(Address.class);
        System.out.println(address);
    }
}
