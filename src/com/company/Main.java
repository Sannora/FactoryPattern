/* Bir sigorta şirketinin müşteri çeşitlerine göre sunduğu farklı sigorta planlarını simüle eden kod bloğu: */
/* Kullanılan oran ve içerikler tamamen varsayımsal ve hayalidir. */
package com.company;

public class Main {

    public static void main(String[] args) {

        /* Bireysel sigorta simülasyonu: */
        InsuranceFactory.getPlan(new IndividualInsurance(1.5,600,1),0.7);

        /* Kurumsal sigorta simülasyonu: */
        InsuranceFactory.getPlan(new CorporateInsurance(2.0,1000,0.5),6);

        /* Aile sigortası simülasyonu: */
        InsuranceFactory.getPlan(new FamilyInsurance(1.8,800,2),2);

        /* Böylece sigorta girişi yapan bir müşterinin verileri, plan değişikliği ya da paket içeriğinin değişmesi durumunda
        nesneyi içeren bütün arayüzlerin baştan yazılması gerekmeden yalnızca ilgili olan Insurance classının güncellenmesiyle
        düzenlenebilecektir. */

    }
}

