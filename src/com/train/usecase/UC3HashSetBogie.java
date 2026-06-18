package com.train.usecase;

import java.util.HashSet;
import java.util.Set;

public class UC3HashSetBogie {

    public void execute() {

        Set<String> bogieIds =
                new HashSet<>();

        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B101");

        System.out.println(bogieIds);
    }
}