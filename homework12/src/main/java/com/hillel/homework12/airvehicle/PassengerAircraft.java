package com.hillel.homework12.airvehicle;

import com.hillel.homework12.abstractions.Vechicle;
import com.hillel.homework12.enums.Fuel;

public class PassengerAircraft extends Vechicle {
    private int passengerCapacity;

    public PassengerAircraft(String name, String brand, String model, Fuel fuel, int fuelConsumption, int passengerCapacity) {
        super(name, brand, model, fuel, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public float calculateTheCostOfTheTrip(int distance) {
        float costTrip = distance * getFuelConsumption()/100 * getFuel().getFuelPrice();
        System.out.println("Поездка расстоянием в " + distance + " км на " +getName() + " обойдется в " + costTrip + " грн");
        return costTrip;
    }

    @Override
    public String toString() {
        return "PassengerAircraft{" +
                "name = '" + getName() + '\'' +
                ", brand = '" + getBrand() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", fuel = " + getFuel() +
                ", fuel consumption = " + getFuelConsumption() +
                ", passenger capacity = " + passengerCapacity +
                '}';
    }
}