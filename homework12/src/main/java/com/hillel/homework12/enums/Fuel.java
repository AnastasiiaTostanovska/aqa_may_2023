package com.hillel.homework12.enums;

public enum Fuel {
    PETROL(58),
    GAS(26),
    DIESEL(56),
    KEROSENE(112);

    private int fuelPrice;

    Fuel(int fuelPrice){
        this.fuelPrice = fuelPrice;
    }
    public int getFuelPrice(){
        return fuelPrice;

    }
}
