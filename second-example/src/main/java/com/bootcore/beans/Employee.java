package com.bootcore.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {
    @Value("${empNo}")
    private int empNo;
    @Value("${empName}")
    private String empName;
    @Value("${age}")
    private int age;
    @Value("${contactNo}")
    private String contactNo;
    @Value("${emailAddress}")
    private String emailAddress;
}
