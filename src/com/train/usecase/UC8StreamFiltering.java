package com.train.usecase;

import com.train.model.PassengerBogie;
import com.train.service.PassengerService;

public class UC8StreamFiltering {

    public void execute() {

        new PassengerService()
                .getPassengerBogies()
                .stream()
                .filter(
                        bogie ->
                                bogie.getCapacity() > 60)
                .forEach(System.out::println);
    }
}