package com.train.usecase;

import java.util.LinkedHashSet;

public class UC5LinkedHashSetBogie {

    public void execute() {

        LinkedHashSet<String> consist =
                new LinkedHashSet<>();

        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Sleeper");

        System.out.println(consist);
    }
}