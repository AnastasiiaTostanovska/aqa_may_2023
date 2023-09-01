package com.hillel.homework11.GroundVehicle;


import com.hillel.homework11.abstractions.Vehicle;

public class Truck extends Vehicle {

    private int loadСapacity;

    public Truck(String name, String brand, String model, int loadСapacity) {
        super(name, brand, model);
        this.loadСapacity = loadСapacity;
    }

    public int getLoadСapacity() {
        return loadСapacity;
    }

}