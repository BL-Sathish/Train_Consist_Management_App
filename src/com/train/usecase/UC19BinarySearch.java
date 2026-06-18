package com.train.usecase;

import com.train.util.SearchUtil;

public class UC19BinarySearch {

    public void execute() {

        String[] ids = {

                "B101",
                "B102",
                "B103",
                "B104",
                "B105",
                "B106"
        };

        boolean found =
                SearchUtil.binarySearch(
                        ids,
                        "B105");

        System.out.println(
                "Found = " + found);
    }
}