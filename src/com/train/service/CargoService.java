package com.train.service;

import com.train.exception.CargoSafetyException;
import com.train.model.GoodsBogie;

public class CargoService {

    public void assignCargo(
            GoodsBogie bogie) {

        if ("Rectangular".equals(
                bogie.getShape())

                &&

                "Petroleum".equals(
                        bogie.getCargo())) {

            throw new CargoSafetyException(
                    "Unsafe cargo assignment");
        }

        System.out.println(
                "Cargo Assigned");
    }
}