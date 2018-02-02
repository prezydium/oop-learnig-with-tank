package com.prezydium.body.firearms;

public enum Ammo {
    BROWNING(".50cal"),
    FLAK_GUN("8mm");

    String ammoType;

    Ammo(String ammoType) {
        this.ammoType = ammoType;
    }

    public String getAmmoType() {
        return ammoType;
    }

}