package com.train.usecase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UC13PerformanceBenchmark {

    public void execute() {

        List<Integer> list =
                new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {

            list.add(i);
        }

        long loopStart =
                System.nanoTime();

        List<Integer> loopResult =
                new ArrayList<>();

        for (Integer value : list) {

            if (value % 2 == 0) {

                loopResult.add(value);
            }
        }

        long loopEnd =
                System.nanoTime();

        long streamStart =
                System.nanoTime();

        List<Integer> streamResult =
                list.stream()
                        .filter(
                                x -> x % 2 == 0)
                        .collect(
                                Collectors.toList());

        long streamEnd =
                System.nanoTime();

        System.out.println(
                "Loop Time = "
                        + (loopEnd - loopStart));

        System.out.println(
                "Stream Time = "
                        + (streamEnd - streamStart));
    }
}