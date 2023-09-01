package com.hillel.homework10;

public class Refrigerator extends Truck {
    String refrigerant;
    int temperature;

    public Refrigerator(String name, String brand, String model, int loadСapacity, String refrigerant, int temperature) {
        super(name, brand, model, loadСapacity);
        this.refrigerant = refrigerant;
        this.temperature = temperature;

    }
    public Refrigerator(){

    }
}
