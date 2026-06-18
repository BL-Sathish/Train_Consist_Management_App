package com.train.usecase;

import com.train.exception.InvalidCapacityException;
import com.train.model.PassengerBogie;

public class UC14CustomException {

    public void execute() {

        try {

            PassengerBogie bogie =
                    new PassengerBogie(
                            "P999",
                            "Invalid",
                            "Sleeper",
                            -10);

            System.out.println(bogie);

        } catch (
                InvalidCapacityException e) {

            System.out.println(
                    e.getMessage());
        }
    }
}