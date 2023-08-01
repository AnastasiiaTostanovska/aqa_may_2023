package com.hillel.lesson8;

public class Broomstick {

    String model;
    int made;
    int speed;
    Materials materials;

    public Broomstick(String model, int made, int speed, Materials materials) {
        this.model = model;
        this.made = made;
        this.speed = speed;
        this.materials = materials;
    }

    public Broomstick(String model, int made, int speed) {
        this.model = model;
        this.made = made;
        this.speed = speed;
    }
    public void printBroomstickCharacteristic() {
        System.out.println("model: " + model + ", made: " + made + ", speed: " + speed + ", materials: " + materials.printMaterials());
    }
    public void printBroomstick1Characteristic() {
        System.out.println("model: " + model + ", made: " + made + ", speed: " + speed);
    }
}