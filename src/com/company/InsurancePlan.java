package com.company;

public abstract class InsurancePlan {

    double insuranceRate;
    double insuranceCut;
    double insuranceDuration;
    double getInsuranceBalance(double subscriptionDuration){

       double balance = insuranceRate*insuranceCut*subscriptionDuration*12;
        System.out.println(balance);
       return balance;
    }

    public InsurancePlan(double insuranceRate, double insuranceCut, double insuranceDuration) {
        this.insuranceRate = insuranceRate;
        this.insuranceCut = insuranceCut;
        this.insuranceDuration = insuranceDuration;
    }

    public double getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(int insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    public double getInsuranceCut() {
        return insuranceCut;
    }

    public void setInsuranceCut(int insuranceCut) {
        this.insuranceCut = insuranceCut;
    }

    public double getInsuranceDuration() {
        return insuranceDuration;
    }

    public void setInsuranceDuration(int insuranceDuration) {
        this.insuranceDuration = insuranceDuration;
    }

}
