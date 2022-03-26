package com.UD_LambdasExample;


import java.util.List;
import java.util.function.Predicate;

public final class LambdasPredicate {
    /**
     *
     * @param input
     * @param condition
     * @return
     */


    private static long countMatchingStrings(List<String> input, Predicate<String> condition) {

        return input.stream().filter(condition).count();


    }

    public static void main(String[] args) {

        List<String> input = List.of("hello", "\t", "", "  ", "goodbye", "      ");


        long numOfWhitespaceStrings = countMatchingStrings( input, s ->  s.trim().isEmpty());

        System.out.println("numOfWhitespaceStrings: " + numOfWhitespaceStrings);
    }

}
