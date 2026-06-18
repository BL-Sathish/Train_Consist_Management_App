package com.train.model;

public class GoodsBogie extends Bogie {

    private String cargoType;

    public GoodsBogie(
            String bogieId,
            String bogieName,
            String cargoType) {

        super(bogieId, bogieName);
        this.cargoType = cargoType;
    }

    public String getCargoType() {
        return cargoType;
    }

    @Override
    public String toString() {
        return getBogieId()
                + " "
                + getBogieName()
                + " Cargo="
                + cargoType;
    }
}