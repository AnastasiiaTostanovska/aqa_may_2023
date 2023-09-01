package com.hillel.homework11.Main;

import com.hillel.homework11.AirVehicle.PassengerAircraft;
import com.hillel.homework11.GroundVehicle.Refrigerator;

public class Demo {
    public static void main(String[] args) {

        Refrigerator mersedes = new Refrigerator("Truck Refrigerator","Mercedes-Benz","Sprinter 313CDI",900, "freon R-134a", -20 );
        mersedes.setTemperature(-1);
        System.out.println(mersedes.getTemperature());
        mersedes.printRefrigerator();

        PassengerAircraft boeing = new PassengerAircraft("Passenger Aircraft","Boeing","767 400ER",375);
        boeing.getPassengerCapacity();
        boeing.printPassengerAircraft();

    }
}
