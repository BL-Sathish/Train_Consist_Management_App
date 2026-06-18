package com.train.usecase;

import java.util.LinkedList;

public class UC4LinkedListBogie {

    public void execute() {

        LinkedList<String> consist =
                new LinkedList<>();

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC Chair");

        System.out.println(consist);
    }
}