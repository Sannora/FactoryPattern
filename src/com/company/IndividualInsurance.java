package com.company;

public class IndividualInsurance extends InsurancePlan{

    public IndividualInsurance(double insuranceRate, double insuranceCut, double insuranceDuration) {
        super(insuranceRate, insuranceCut, insuranceDuration);
        this.insuranceRate = 1.5;
        this.insuranceDuration = 1;
        this.insuranceCut = 600;
    }
}
