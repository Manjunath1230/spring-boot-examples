package com.bootcore.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class CreditScore {
    @Autowired
    private LoanApplication loanApplication;
    @Value("${civilScore}")
    private int civilScore;
    @Value("${description}")
    private String description;
}
