package com.training.Feb19th_Day1.BankTask;

public class BankTester {

    public static void main (String[] args){
        UBI ubi1 = new UBI(20000,5);
        SBI sbi1 = new SBI(20000,5);
        System.out.println(ubi1.getMaturity());
        System.out.println(sbi1.getMaturity());

    }
}
