package com.train.usecase;

import com.train.util.SortUtil;

import java.util.Arrays;

public class UC17ArraysSort {

    public void execute() {

        String[] bogies = {

                "Sleeper",
                "AC",
                "ChairCar",
                "General"
        };

        SortUtil.sortNames(bogies);

        System.out.println(
                Arrays.toString(bogies));
    }
}