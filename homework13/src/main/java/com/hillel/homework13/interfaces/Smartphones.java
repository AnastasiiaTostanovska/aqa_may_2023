package com.hillel.homework13.interfaces;


public interface Smartphones  {
    void call(String phoneNumber, int minutes);
    void sendSMS(String phoneNumber, int numberOfMessages);
    void useInternet(int dataUsageInMB);
    double getBalance();

}