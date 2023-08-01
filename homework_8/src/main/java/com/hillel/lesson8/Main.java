package com.hillel.lesson8;

public class Main {
    public static void main(String[] args) {
        Materials materials = new Materials("ebony", "birch");
        Broomstick broomstick = new Broomstick("Firebolt", 1993, 150, materials);
        Broomstick broomstick1 = new Broomstick("Firebolt", 1993, 150);
        broomstick.printBroomstickCharacteristic();
        broomstick.printBroomstick1Characteristic();

        System.out.println("____________");
        System.out.println(broomstick.materials);
        System.out.println(broomstick1);
    }
}