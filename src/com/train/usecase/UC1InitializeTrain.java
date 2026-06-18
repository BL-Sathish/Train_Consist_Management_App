package com.train.usecase;

import com.train.model.Bogie;

public class UC1InitializeTrain {

    public void execute() {

        System.out.println("UC1");

        Bogie bogie =
                new Bogie(
                        "B101",
                        "General");

        System.out.println(bogie);
    }
}