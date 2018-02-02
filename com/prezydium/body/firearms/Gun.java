package com.prezydium.body.firearms;

public abstract class Gun<T> implements FirearmService {
    private Ammo ammo;
    private int ammoCount;
    private boolean isAutomatic;
    protected T weigth;

    public Gun(Ammo ammo, int ammoCount, boolean isAutomatic, T weight) {
        this.ammo = ammo;
        this.ammoCount = ammoCount;
        this.isAutomatic = isAutomatic;
        this.weigth = weight;
    }

    public abstract int clipSize();

    public abstract T getWeigth();

    public Ammo getAmmo() {
        return ammo;
    }

    public int getAmmoCount() {
        return ammoCount;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

}
