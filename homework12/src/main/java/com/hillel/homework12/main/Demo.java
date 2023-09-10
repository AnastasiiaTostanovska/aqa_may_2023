package com.hillel.homework12.main;

import com.hillel.homework12.airvehicle.PassengerAircraft;
import com.hillel.homework12.enums.Fuel;
import com.hillel.homework12.groundvehicle.Refrigerator;

public class Demo {
    public static void main(String[] args) {
        PassengerAircraft boeing = new PassengerAircraft("Passenger Aircraft","Boeing","767 400ER",
                Fuel.KEROSENE, 20, 189);
        Refrigerator mersedes = new Refrigerator("Truck Refrigerator","Mercedes-Benz","Sprinter 313CDI",
               Fuel.PETROL, 6,900,-20);

        System.out.println(boeing);
        System.out.println(boeing.calculateTheCostOfTheTrip(3500));
        System.out.println(mersedes);
        System.out.println(mersedes.calculateTheCostOfTheTrip(1000));
    }
}