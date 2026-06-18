package com.train.service;

import com.train.model.Bogie;

import java.util.ArrayList;
import java.util.List;

public class TrainService {

    private final List<Bogie> bogies = new ArrayList<>();

    public void addBogie(Bogie bogie) {
        bogies.add(bogie);
    }

    public List<Bogie> getBogies() {
        return bogies;
    }

    public void displayBogies() {

        bogies.forEach(System.out::println);
    }
}