package com.hillel.homework12.abstractions;

import com.hillel.homework12.enums.Fuel;

public abstract class Vechicle {
    private String name;
    private String brand;
    private String model;
    private Fuel fuel;
    private int fuelConsumption;

    public Vechicle(String name, String brand, String model, Fuel fuel, int fuelConsumption) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public Fuel getFuel() {
        return fuel;
    }
    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }
    protected abstract float calculateTheCostOfTheTrip(int distance);
}