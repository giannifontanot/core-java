package com.UD_Streams;

import java.util.stream.Stream;

public class SquaredMax {
    public static void main(String[] args) {
        System.out.println(squared(5));
    }

    public static int squared(int maxNumber) {
        return Stream.iterate(4, returnNumber -> returnNumber + 4)
                .limit(maxNumber)
                .map(result -> result * result)
                .filter(resultSquared->resultSquared%10==0)
                .reduce(0, Integer::sum);
    }
}
