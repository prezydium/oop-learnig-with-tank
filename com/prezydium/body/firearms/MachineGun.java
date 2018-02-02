package com.prezydium.body.firearms;

public class MachineGun extends Gun {

    private static final Ammo AMMO = Ammo.BROWNING;
    private static final boolean IS_AUTOMATIC = true;
    private static final double WEIGTH = 25;
    private static final int CLIP_SIZE = 100;

    public MachineGun( int ammoCount) {
        super(AMMO, ammoCount, IS_AUTOMATIC, WEIGTH);
    }

    public int clipSize() {
        return CLIP_SIZE;
    }

    public Double getWeigth() {
        return WEIGTH;
    }

    @Override
    public void shoot() {

    }

    @Override
    public void target() {

    }
}
