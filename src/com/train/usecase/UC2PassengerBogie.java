package com.train.usecase;

import com.train.model.PassengerBogie;

import java.util.ArrayList;
import java.util.List;

public class UC2PassengerBogie {

    public void execute() {

        List<PassengerBogie> list =
                new ArrayList<>();

      /*  list.add(
                new PassengerBogie(
                        "P101",
                        "Sleeper",
                        72));

        list.add(
                new PassengerBogie(
                        "P102",
                        "AC Chair",
                        60));*/

        list.forEach(System.out::println);
    }
}