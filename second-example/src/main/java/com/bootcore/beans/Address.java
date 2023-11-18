package com.bootcore.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Address {
    @Autowired
    private Employee employee;
    @Value("${addressLine1}")
    private String addressLine1;
    @Value("${addressLine2}")
    private String addressLine2;
    @Value("${city}")
    private String city;
    @Value("${state}")
    private String state;
    @Value("${pinNo}")
    private int pinNo;
}
