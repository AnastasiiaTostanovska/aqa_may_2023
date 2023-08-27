package com.hillel.lesson8;

public class Materials {
    String handle;
    String twigs;

    public Materials(String handle, String twigs) {
        this.handle = handle;
        this.twigs = twigs;
    }

    public String printMaterials() {
        return "handle: " + handle + ", twigs: " + twigs;
    }

}