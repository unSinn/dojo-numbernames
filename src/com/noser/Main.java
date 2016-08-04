package com.noser;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        NumberNamer numberNamer = new NumberNamer();

        IntStream.rangeClosed(0, 200)
                .forEach(i -> System.out.println(i + " "
                        + numberNamer.printNumberName(i)));

    }
}
