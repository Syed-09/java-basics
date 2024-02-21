package com.training.Feb19th_Day1.BankTask;

class UBI extends Bank{

    public UBI(int amount, int years) {
        super(amount, years);
    }

    private final int intrestRate = 7;
    int maturityAmount = amount + (amount*years* intrestRate)/100;

    @Override
    String getMaturity() {
        String bankName = "UBI";
        return "Maturity Amount in " + bankName + ":" +maturityAmount;
    }


}
