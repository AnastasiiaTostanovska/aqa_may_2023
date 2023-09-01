package com.hillel.homework11.AirVehicle;

import com.hillel.homework11.abstractions.Vehicle;

public class PassengerAircraft extends Vehicle {
    private int passengerCapacity;


    public PassengerAircraft(String name, String brand, String model, int passengerCapacity) {
        super(name, brand, model);
        this.passengerCapacity = passengerCapacity;

    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void printPassengerAircraft() {
        System.out.println("Name: " + getName() + "; Brand: " + getBrand() + "; Model: " + getModel() + "; Passenger capacity is " + passengerCapacity);

    }

}
