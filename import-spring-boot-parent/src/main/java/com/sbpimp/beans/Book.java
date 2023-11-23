package com.sbpimp.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Book {
    @Value("${bookNo}")
    private String bookNo;
    @Value("${bookName}")
    private String bookName;
    @Value("${amount}")
    private double amount;
}
