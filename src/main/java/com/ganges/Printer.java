package com.ganges;

public class Printer {

    private double amountInk;

    public Printer(double amountInk){
        this.amountInk = amountInk;
    }

    public void addInk (double additionalAmount){
        this.amountInk += additionalAmount;
    }

    public double getAmountInk(){
        return amountInk;
    }
}
