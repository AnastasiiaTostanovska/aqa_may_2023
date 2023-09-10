package com.hillel.homework13.mobilephones;

import com.hillel.homework13.core.Expenses;
import com.hillel.homework13.core.MobilePhone;

public class iPhone extends MobilePhone {
    public iPhone(double initialBalance, Expenses expenses) {
        super(initialBalance, expenses);
    }
    @Override
    public String toString() {
        return "iPhone{" +
                "Remaining balance: $" + getBalance() + "\n" +
                "Expenses: " + "\n" +
                "call expenses: $" + callCost + "\n" +
                "sms expenses: $" + smsCost + "\n" +
                "internet: $" + internetCost + "\n" +
                "}";
    }
}
