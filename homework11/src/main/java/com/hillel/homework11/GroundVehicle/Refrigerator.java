package com.hillel.homework11.GroundVehicle;

public final class Refrigerator extends Truck {
    private String refrigerant;
    private int temperature;

    public Refrigerator(String name, String brand, String model, int loadСapacity, String refrigerant, int temperature) {
        super(name, brand, model, loadСapacity);
        this.refrigerant = refrigerant;
        this.temperature = temperature;

    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature < -4 || temperature >= 0) {
            this.temperature = temperature;
        } else {
            System.out.println("ice cream melted with temperature " + temperature);
        }
    }

    public String getRefrigerant() {
        return refrigerant;
   }

    public void printRefrigerator() {
        System.out.println("Name: " + getName() + "; Brand: " + getBrand() + "; Model: " + getModel() + "; Load capacity is " + getLoadСapacity() + "; Refrigerant: " + refrigerant);
    }
}


