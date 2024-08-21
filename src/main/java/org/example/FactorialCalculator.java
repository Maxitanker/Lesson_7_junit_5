package org.example;

public class FactorialCalculator {
    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным.");
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
