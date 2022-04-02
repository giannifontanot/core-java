package com.UD_LambdasExample;


import java.util.function.BinaryOperator;

/*
The Lambda is assigned to a variable (add), which
is the type BooleanOperator (an interface).

Just like a number is assigned to a variable of type Integer
 */
public class Main4 {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.print(add.apply(2,2));
    }
}
