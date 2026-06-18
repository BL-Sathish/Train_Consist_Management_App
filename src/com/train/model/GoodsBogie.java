package com.train.model;

public class GoodsBogie extends Bogie {

    private String shape;

    private String cargo;

    public GoodsBogie(
            String bogieId,
            String bogieName,
            String shape,
            String cargo) {

        super(bogieId, bogieName);

        this.shape = shape;
        this.cargo = cargo;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }
}