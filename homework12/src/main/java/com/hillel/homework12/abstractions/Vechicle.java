package com.hillel.homework12.abstractions;

public abstract class Vechicle {
    private String name;
    private String brand;
    private String model;
    private int fuelConsumption;

    public Vechicle(String name, String brand, String model, int fuelConsumption) {
        this.name = name;
        this.brand = brand;
        this.model = model;
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

    public int getFuelConsumption() {
        return fuelConsumption;
    }
    protected abstract float calculateTheCostOfTheTrip(int distance, int fuelPrice);
}