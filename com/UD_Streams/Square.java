package com.UD_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Square {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(3, 6, 8, 15);

        List<Integer> square = numList.stream()
                .map((x) -> (x * x))
                .collect(Collectors.toList());
        System.out.println(square);

        numList.stream()
                .map((x) -> (x * x))
                .forEach(System.out::println);
    }

}

