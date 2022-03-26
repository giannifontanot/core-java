package com.UD_LambdasExample;


import java.util.List;
import java.util.function.Predicate;

/*
The Lambda is assigned to a variable (add), which
is the type BooleanOperator (an interface).

Just like a number is assigned to a variable of type Interger
 */
public class Main3 {

    public static long countMatchingStrings(List<String> input, Predicate<String> condition) {
        return input.stream().filter(condition).count();
    }

    public static void main(String[] args) {

        List<String> input = List.of("hello", "\t   ", "world", "", "\t", " ", "goodbye", "  ");

        long numberOfWhitespaceStrings =
                countMatchingStrings(
                        input,
                        new Predicate<String>(){
                            @Override
                            public boolean test(String s){return s.trim().isEmpty();}
                        });

        System.out.println(numberOfWhitespaceStrings + " whitespace strings");
    }
}
