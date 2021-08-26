package com.company;

public class CorporateInsurance extends InsurancePlan{

    public CorporateInsurance(double insuranceRate, double insuranceCut, double insuranceDuration) {
        super(insuranceRate, insuranceCut, insuranceDuration);
        this.insuranceRate = 2.0;
        this.insuranceDuration = 0.5;
        this.insuranceCut = 1000;
    }
}
