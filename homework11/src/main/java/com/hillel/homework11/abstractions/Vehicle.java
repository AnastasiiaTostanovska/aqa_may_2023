package com.hillel.homework11.abstractions;

public abstract class Vehicle {

    private String name;
    private String brand;
    private String model;


    public Vehicle(String name, String brand, String model) {
        this.name = name;
        this.brand = brand;
        this.model = model;
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
}