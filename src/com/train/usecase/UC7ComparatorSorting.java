package com.train.usecase;

import com.train.model.PassengerBogie;
import com.train.service.PassengerService;

import java.util.Comparator;
import java.util.List;

public class UC7ComparatorSorting {

    public void execute() {

        List<PassengerBogie> bogies =
                new PassengerService()
                        .getPassengerBogies();

        bogies.sort(
                Comparator.comparingInt(
                        PassengerBogie::getCapacity));

        bogies.forEach(System.out::println);
    }
}