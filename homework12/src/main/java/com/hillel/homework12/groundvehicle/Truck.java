package com.hillel.homework12.groundvehicle;

import com.hillel.homework12.abstractions.Vechicle;
import com.hillel.homework12.enums.Fuel;

public class Truck extends Vechicle {
    private int loadСapacity;

    public Truck(String name, String brand, String model, Fuel fuel, int fuelConsumption, int loadСapacity) {
        super(name, brand, model, fuel, fuelConsumption);
        this.loadСapacity = loadСapacity;
    }

    public int getLoadСapacity() {
        return loadСapacity;
    }

    @Override
    public float calculateTheCostOfTheTrip(int distance) {
        float costTrip = distance * getFuelConsumption()/100 * getFuel().getFuelPrice();
        System.out.println("Поездка расстоянием в " + distance + " км на " +getName() + " обойдется в " + costTrip + " грн");
        return costTrip;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + getName() + '\'' +
                ", brand = '" + getBrand() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", fuel = " + getFuel() +
                ", fuel consumption = " + getFuelConsumption()+
                ", load capacity = " + loadСapacity +
                '}';
    }
}
