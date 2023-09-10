package com.hillel.homework13.demo;

import com.hillel.homework13.mobilephones.Android;
import com.hillel.homework13.core.Expenses;
import com.hillel.homework13.mobilephones.iPhone;

public class Demo {
    public static void main(String[] args) {
        Expenses iphoneExpenses = new Expenses(0.05, 0.02, 0.1);
        Expenses androidExpenses = new Expenses(0.03, 0.01, 0.05);

        iPhone myiPhone = new iPhone(100.0, iphoneExpenses);
        Android myAndroid = new Android(100.0, androidExpenses);

        myiPhone.call("0634278293", 20);
        myAndroid.call("12",50);
        myAndroid.call("0634278293",3000);
        myAndroid.sendSMS("0634278293", 20);
        myAndroid.useInternet(500);
        System.out.println(myiPhone);
        System.out.println(myAndroid);

    }
}
