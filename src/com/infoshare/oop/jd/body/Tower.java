package com.infoshare.oop.jd.body;

public class Tower {

    private double weight;

    private String model;

    private int serialNumber;

    private char metalType;


    public Tower() {
        this(2.5, "light", 1, 'A');
    }

    public Tower(double weight) {
        this(weight, "light", 1, 'A');
    }

    public Tower(String model) {
        this(2.5, model, 1, 'A');
    }

    public Tower(int serialNumber) {
        this(2.5, "light", serialNumber, 'A');
    }

    public Tower(char metalType) {
        this(2.5, "light", 1, metalType);
    }


    public Tower(double weight, String model, int serialNumber, char metalType) {
        this.weight = weight;
        this.model = model;
        this.serialNumber = serialNumber;
        this.metalType = metalType;
    }

    public void showInfo() {
        System.out.println("Weight: " + weight + " model: " + model + " Serial Number: " + serialNumber + " metal type: " + metalType);
    }
}
