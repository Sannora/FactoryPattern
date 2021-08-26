package com.company;

public class FamilyInsurance extends InsurancePlan{


    public FamilyInsurance(double insuranceRate, double insuranceCut, double insuranceDuration) {
        super(insuranceRate, insuranceCut, insuranceDuration);
        this.insuranceRate = 1.8;
        this.insuranceDuration = 2;
        this.insuranceCut = 800;
    }
}
