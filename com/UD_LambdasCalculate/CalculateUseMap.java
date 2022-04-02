package com.UD_LambdasCalculate;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class CalculateUseMap {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Calculate [int] [operator] [int]");
            return;
        }

        CalculatorMap calculator = new CalculatorMap();
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

final class CalculatorMap {

    BinaryOperator<Integer> add;
    BinaryOperator<Integer> subtract;
    BinaryOperator<Integer> multiply;
    BinaryOperator<Integer> divide;

    Map<String, BinaryOperator<Integer>> operatorsMap = new HashMap<>();

    void registerOperation(String symbol, BinaryOperator<Integer> operatorObject) {
        operatorsMap.put(symbol, operatorObject);
    }

    Integer calculate(int operand1, String operator, int operand2) {
        return operatorsMap.get(operator).apply(operand1,operand2);
    }

}
