package com.train.usecase;

import com.train.model.GoodsBogie;
import com.train.service.SafetyService;

import java.util.List;

public class UC12SafetyCompliance {

    public void execute() {

        List<GoodsBogie> bogies =
                List.of(

                        new GoodsBogie(
                                "G101",
                                "Tank1",
                                "Cylindrical",
                                "Petroleum"),

                        new GoodsBogie(
                                "G102",
                                "Coal1",
                                "Rectangular",
                                "Coal")
                );

        boolean safe =
                new SafetyService()
                        .isSafe(bogies);

        System.out.println(
                "Safety Compliance = "
                        + safe);
    }
}