package com.company;

public class InsuranceFactory {

    /* Bütün sigorta planı çeşitlerini kapsayacak şekilde InsurancePlan cinsinden sigorta planını parametre olarak alan
    factory metodu:  */

    public static void getPlan(InsurancePlan insurancePlan, double subscriptionDuration){

        insurancePlan.getInsuranceBalance(subscriptionDuration);

    }
}
