package com.train.usecase;

import com.train.exception.CargoSafetyException;
import com.train.model.GoodsBogie;
import com.train.service.CargoService;

public class UC15TryCatchFinally {

    public void execute() {

        try {

            GoodsBogie bogie =
                    new GoodsBogie(
                            "G100",
                            "Goods",
                            "Rectangular",
                            "Petroleum");

            new CargoService()
                    .assignCargo(bogie);

        } catch (
                CargoSafetyException ex) {

            System.out.println(
                    ex.getMessage());

        } finally {

            System.out.println(
                    "Audit Log Completed");
        }
    }
}