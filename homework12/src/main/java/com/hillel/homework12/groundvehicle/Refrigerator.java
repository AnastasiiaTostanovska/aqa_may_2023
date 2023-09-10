package com.hillel.homework12.groundvehicle;

import com.hillel.homework12.enums.Fuel;

public class Refrigerator extends Truck{
    private int temperature;

    public Refrigerator(String name, String brand, String model, Fuel fuel, int fuelConsumption, int loadСapacity, int temperature) {
        super(name, brand, model, fuel, fuelConsumption, loadСapacity);
        this.temperature = temperature;
    }

    @Override
    public float calculateTheCostOfTheTrip(int distance) {
        float costTrip = distance * getFuelConsumption()/100 * getFuel().getFuelPrice();
        System.out.println("Поездка расстоянием в " + distance + " км на " +getName() + " обойдется в " + costTrip + " грн");
        return costTrip;
    }
    @Override
    public String toString() {
        return "Refrigerator{" +
                "name='" + getName() + '\'' +
                ", brand = '" + getBrand() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", fuel = " + getFuel() +
                ", fuel consumption = " + getFuelConsumption()+
                ", load capacity = " + getLoadСapacity() +
                "temperature=" + temperature +
                '}';
    }
}
