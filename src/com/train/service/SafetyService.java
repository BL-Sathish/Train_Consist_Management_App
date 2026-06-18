package com.train.service;

import com.train.model.GoodsBogie;

import java.util.List;

public class SafetyService {

    public boolean isSafe(
            List<GoodsBogie> bogies) {

        return bogies.stream()
                .allMatch(bogie ->

                        !"Cylindrical".equals(
                                bogie.getShape())

                                ||

                                "Petroleum".equals(
                                        bogie.getCargo()));
    }
}