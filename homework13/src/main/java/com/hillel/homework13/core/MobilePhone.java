package com.hillel.homework13.core;

import com.hillel.homework13.interfaces.Smartphones;
import java.util.regex.Pattern;

public abstract class MobilePhone implements Smartphones {
    protected double smsCost;
    protected double callCost;
    protected double internetCost;
    private double balance;
    private Expenses expenses;

    public MobilePhone(double balance, Expenses expenses) {
        this.balance = balance;
        this.expenses = expenses;
    }
    @Override
    public void call(String phoneNumber, int minutes) {
        if (isValidPhoneNumber(phoneNumber)) {
            double maxMinutes = balance / expenses.getCallRate();

            if (minutes <= maxMinutes) {
                callCost = minutes * expenses.getCallRate();
                reduceBalance(callCost);
            } else {
                callCost = maxMinutes * expenses.getCallRate();
                reduceBalance(callCost);
                double remainingMinutes = minutes - maxMinutes;
                System.out.println("You can`t use all" + minutes + "minutes "
                        + ". Call cost for " + maxMinutes + " minutes deducted. "
                        + "You can make calls for " + remainingMinutes + " more minutes. "
                        + "Please top up your balance.");
            }
        } else{
            System.out.println("Invalid phone number: " + phoneNumber);
        }
    }
    @Override
    public void sendSMS(String phoneNumber, int numberOfMessages) {
        if (isValidPhoneNumber(phoneNumber)) {
            double maxMessages = balance / expenses.getSmsRate();

            if (numberOfMessages <= maxMessages) {
                smsCost = numberOfMessages * expenses.getSmsRate();
                reduceBalance(smsCost);
            } else {

                smsCost = maxMessages * expenses.getSmsRate();
                reduceBalance(smsCost);

                int remainingMessages = numberOfMessages - (int) maxMessages;
                System.out.println("You can`t send all " + numberOfMessages +  "messages "
                        + ". SMS cost for " + (int) maxMessages + " messages deducted. "
                        + "You can send " + remainingMessages + " more messages. "
                        + "Please top up your balance.");
            }
        } else {
            System.out.println("Invalid phone number: " + phoneNumber);
        }
    }
    @Override
    public void useInternet(int dataUsageInMB) {
        double maxDataUsage = balance / expenses.getInternetRate();
        if (dataUsageInMB <= maxDataUsage) {
            internetCost = dataUsageInMB * expenses.getInternetRate();
            reduceBalance(internetCost);
        } else {
            internetCost = maxDataUsage * expenses.getInternetRate();
            reduceBalance(internetCost);

            double remainingDataUsage = dataUsageInMB - maxDataUsage;
            System.out.println("You can`t use all " + dataUsageInMB + " MB"
                    + ". Internet cost for " + maxDataUsage + " MB deducted. "
                    + "You can use " + remainingDataUsage + " more MB of data. "
                    + "Please top up your balance.");
        }
    }
    public void reduceBalance(double cost) {
        if (balance >= cost) {
           balance -= cost;
        } else {
          System.out.println("Insufficient balance.");
        }
   }
    @Override
    public double getBalance() {
        return balance;
    }
    private boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.matches("\\d{10}", phoneNumber);
    }
}