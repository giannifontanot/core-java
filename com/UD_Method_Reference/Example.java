package com.UD_Method_Reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        ArrayList<String> listString = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

        listString.forEach(s -> System.out.println(s));
        listString.forEach(System.out::println);
    }
}
