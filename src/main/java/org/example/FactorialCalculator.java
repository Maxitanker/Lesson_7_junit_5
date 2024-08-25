package org.example;

public class FactorialCalculator {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным.");
        }
        int factorialResult = 1;
        for (int i = 2; i <= n; i++) {
            factorialResult *= i;
        }
        return factorialResult;
    }
}
