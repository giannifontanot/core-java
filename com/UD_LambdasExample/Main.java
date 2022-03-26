package com.UD_LambdasExample;


/*
The Lambda is assigned to a variable (add), which
is the type BooleanOperator (an interface).

Just like a number is assigned to a variable of type Interger
 */
public class Main {
    public static void main(String[] args) {
        BinaryOperation add = (a,b) -> a + b;
        System.out.print(add.apply(2,2));
    }
}

@FunctionalInterface
interface BinaryOperation {
    public int apply(int a, int b);
}