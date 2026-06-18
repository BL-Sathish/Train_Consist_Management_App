package com.train.usecase;

import com.train.util.SearchUtil;

public class UC18LinearSearch {

    public void execute() {

        String[] ids = {

                "B101",
                "B102",
                "B103",
                "B104"
        };

        boolean found =
                SearchUtil.linearSearch(
                        ids,
                        "B103");

        System.out.println(
                "Found = " + found);
    }
}