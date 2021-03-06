package ru.job4j.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtrAndDivision(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + subtraction(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}