package com.hillel.homework10;

import java.util.Arrays;
public class Demo {
    public static void main(String[] args) {

        Refrigerator Mersedes = new Refrigerator("Truck Refrigerator","Mercedes-Benz","Sprinter 313CDI",900, "freon  R-134a", -20 );
        System.out.println(Mersedes.name);
        System.out.println(Mersedes.brand);
        System.out.println(Mersedes.model);
        System.out.println(Mersedes.loadСapacity);
        System.out.println(Mersedes.refrigerant);
        System.out.println(Mersedes.temperature);

        String[] engine = {"General Electric CF6-80A"};
        PassengerAircraft Boeing = new PassengerAircraft("Passenger Aircraft","Boeing","767 400ER",375, engine);
        System.out.println("________________");
        System.out.println(Boeing.name);
        System.out.println(Boeing.brand);
        System.out.println(Boeing.model);
        System.out.println(Boeing.passengerCapacity);
        System.out.println(Arrays.asList(engine));


    }
}