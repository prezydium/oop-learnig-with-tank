package com.prezydium;

import com.prezydium.body.Hull;
import com.prezydium.body.Riding;
import com.prezydium.body.Tower;
import com.prezydium.body.firearms.Canon;
import com.prezydium.body.firearms.MachineGun;

public class Tank implements Riding {
    private Hull hull;
    private Tower tower;
    private Canon cannon;
    private MachineGun machineGun;

    public Tank(Hull hull, Tower tower, Canon cannon, MachineGun machineGun, int fuelLevel, int xPosition, int yPosition) {
        this.hull = hull;
        this.tower = tower;
        this.cannon = cannon;
        this.machineGun = machineGun;
        this.fuelLevel = fuelLevel;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    private int fuelLevel;
    private int xPosition;
    private int yPosition;

    @Override
    public void goTo(int x, int y) {
        xPosition =+ x;
        yPosition =+ y;
        fuelLevel =- Math.abs(x) + Math.abs(y);
    }

    @Override
    public int[] getPostition() {
        System.out.println("Reporting at" + xPosition + " " + yPosition);
        return new int[]{xPosition, yPosition};
    }

    @Override
    public void resetPosition() {
        xPosition = 0;
        yPosition = 0;
    }

    @Override
    public void checkFuelLevel() {

    }
}
