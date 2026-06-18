package com.train.service;

import com.train.model.PassengerBogie;

import java.util.ArrayList;
import java.util.List;

public class PassengerService {

    public List<PassengerBogie> getPassengerBogies() {

        List<PassengerBogie> list =
                new ArrayList<>();

        list.add(
                new PassengerBogie(
                        "P101",
                        "Coach-A",
                        "Sleeper",
                        72));

        list.add(
                new PassengerBogie(
                        "P102",
                        "Coach-B",
                        "Sleeper",
                        80));

        list.add(
                new PassengerBogie(
                        "P103",
                        "Coach-C",
                        "AC",
                        60));

        list.add(
                new PassengerBogie(
                        "P104",
                        "Coach-D",
                        "ChairCar",
                        45));

        return list;
    }
}