package com.hillel.homework12.groundvehicle;

public class Refrigerator extends Truck{
    private int temperature;

    public Refrigerator(String name, String brand, String model, int fuelConsumption, int loadСapacity, int temperature) {
        super(name, brand, model, fuelConsumption, loadСapacity);
        this.temperature = temperature;
    }

    @Override
    public float calculateTheCostOfTheTrip(int distance, int fuelPrice) {
        float costTrip = distance * getFuelConsumption()/100 * fuelPrice;
        System.out.println("Поездка расстоянием в " + distance + " км на " +getName() + " обойдется в " + costTrip + " грн");
        return costTrip;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "name='" + getName() + '\'' +
                ", brand = '" + getBrand() + '\'' +
                ", model = '" + getModel() + '\'' +
                ", fuel consumption = " + getFuelConsumption()+
                ", load capacity = " + getLoadСapacity() +
                "temperature=" + temperature +
                '}';
    }
}
