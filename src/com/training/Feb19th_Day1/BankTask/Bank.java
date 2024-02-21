package com.training.Feb19th_Day1.BankTask;

abstract class Bank {
    protected final int amount;
    protected final int years;

    public Bank(int amount, int years) {
        this.amount= amount;
        this.years =years;
    }

     abstract String getMaturity();
}
