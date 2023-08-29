package com.hillel.homework10;

public class PassengerAircraft extends Vehicle {
    int passengerCapacity;
    String[] engine;

    public PassengerAircraft(String name, String brand, String model, int passengerCapacity, String[] engine) {
        super(name, brand, model);
        this.passengerCapacity = passengerCapacity;
        this.engine = engine;
    }
        public PassengerAircraft(){
    }

}

