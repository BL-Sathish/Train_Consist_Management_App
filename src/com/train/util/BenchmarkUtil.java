package com.train.util;

public class BenchmarkUtil {

    public static long measure(
            Runnable runnable) {

        long start =
                System.nanoTime();

        runnable.run();

        long end =
                System.nanoTime();

        return end - start;
    }
}