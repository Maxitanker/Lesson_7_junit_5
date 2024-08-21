package org.example;

public class Main {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();

        int number = 5;
        int result = calculator.calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен " + result);
    }
}
