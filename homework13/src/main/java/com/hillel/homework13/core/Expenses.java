package com.hillel.homework13.core;

public class Expenses {
    public double callRate;
    public double smsRate;
    public double internetRate;

    public Expenses(double callRate, double smsRate, double internetRate) {
        this.callRate = callRate;
        this.smsRate = smsRate;
        this.internetRate = internetRate;
    }
    public double getCallRate() {
        return callRate;
    }
    public double getSmsRate() {
        return smsRate;
    }
    public double getInternetRate() {
        return internetRate;
    }

}
