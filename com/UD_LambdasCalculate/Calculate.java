package com.UD_LambdasCalculate;

import java.util.function.BinaryOperator;

public class Calculate {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Calculate [int] [operator] [int]");
            return;
        }

        Calculator calculator = new Calculator();
        // TODO: Register the four "basic" binary operators: +, -, *, /
        calculator.registerOperation("+", (a, b) -> a + b);
        calculator.registerOperation("-", (a, b) -> a - b);
        calculator.registerOperation("*", (a, b) -> a * b);
        calculator.registerOperation("/", (a, b) -> a / b);

        int a = Integer.parseInt(args[0]);
        String operator = args[1];
        int b = Integer.parseInt(args[2]);

        System.out.println(calculator.calculate(a, operator, b));
    }
}

final class Calculator {

    BinaryOperator<Integer> add;
    BinaryOperator<Integer> subtract;
    BinaryOperator<Integer> multiply;
    BinaryOperator<Integer> divide;

    void registerOperation(String symbol, BinaryOperator<Integer> lambda) {
        switch (symbol) {
            case "+" -> add = lambda;
            case "-" -> subtract = lambda;
            case "*" -> multiply = lambda;
            case "/" -> divide = lambda;
        }
    }

    Integer calculate(int operand1, String operator, int operand2) {
        Integer answer = null;
        switch (operator) {
            case "+" -> answer = add.apply(operand1, operand2);
            case "-" -> answer = subtract.apply(operand1, operand2);
            case "*" -> answer = multiply.apply(operand1, operand2);
            case "/" -> answer = divide.apply(operand1, operand2);
        }
        return answer;
    }

}
