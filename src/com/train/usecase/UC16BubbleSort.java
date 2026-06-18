package com.train.usecase;

import com.train.util.SortUtil;

import java.util.Arrays;

public class UC16BubbleSort {

    public void execute() {

        int[] capacities =
                {72, 40, 60, 80, 55};

        SortUtil.bubbleSort(capacities);

        System.out.println(
                Arrays.toString(capacities));
    }
}