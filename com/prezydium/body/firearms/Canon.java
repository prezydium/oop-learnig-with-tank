package com.prezydium.body.firearms;

public  class Canon<T> extends Gun<Double> {


        private static final Ammo AMMO = Ammo.FLAK_GUN;
        private static final boolean IS_AUTOMATIC = false;
        private static final double WEIGTH = 120;
        private final int CLIP_SIZE = 1;

        public Canon(int ammoCount) {
            super(AMMO, ammoCount, IS_AUTOMATIC, WEIGTH);
        }

        public int clipSize() {
            return CLIP_SIZE;
        }

    @Override
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
