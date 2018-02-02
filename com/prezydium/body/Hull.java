package com.prezydium.body;

public class Hull  {

    private int fuelCapacity;
    private int enginePower;

    public Hull(int fuelCapacity, int enginePower) {
        this.fuelCapacity = fuelCapacity;
        this.enginePower = enginePower;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }
}
