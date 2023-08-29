package com.hillel.homework10;

public class Truck extends Vehicle {

    int loadСapacity;

    public Truck(String name, String brand, String model, int loadСapacity) {
        super(name, brand, model);
        this.loadСapacity = loadСapacity;
    }

    public Truck() {
    }
}

