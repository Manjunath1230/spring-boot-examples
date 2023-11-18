package com.bootcore.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class LoanApplication {
    @Value("${loanApplicationNo}")
    private int loanApplicationNo;
    @Value("${applicantName}")
    private String applicantName;
    @Value("${loanType}")
    private String loanType;
    @Value("${tenure}")
    private int tenure;
    @Value("${principalAmount}")
    private double principalAmount;
}
