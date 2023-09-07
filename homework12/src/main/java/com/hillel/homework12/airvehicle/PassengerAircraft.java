package com.hillel.homework12.airvehicle;

import com.hillel.homework12.abstractions.Vechicle;

public class PassengerAircraft extends Vechicle {
    private int passengerCapacity;

    public PassengerAircraft(String name, String brand, String model, int fuelConsumption, int passengerCapacity) {
        super(name, brand, model, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public float calculateTheCostOfTheTrip(int distance, int fuelPrice) {
        float costTrip = distance * getFuelConsumption()/100 * fuelPrice;
        System.out.println("Поездка расстоянием в " + distance + " км на " +getName() + " обойдется в " + costTrip + " грн");
        return costTrip;
    }

    @Override
    public String toString() {
        return "PassengerAircraft{" +
                "name = '" + getName() + '\'' +
                ", brand = '" + getBrand() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", fuel consumption = " + getFuelConsumption() +
                ", passenger capacity = " + passengerCapacity +
                '}';
    }
}