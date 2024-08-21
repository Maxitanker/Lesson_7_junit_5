package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculateFactorial {

    @Test
    public void testCalculateFactorialForPositive() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(5);
        assertEquals(120, result, "Факториал 5 должен быть равен 120");
    }

    @Test
    public void testCalculateFactorialForZero() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(0);
        assertEquals(1, result, "Факториал 0 должен быть равен 1");
    }

    @Test
    public void testCalculateFactorialForOne() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculateFactorial(1);
        assertEquals(1, result, "Факториал 1 должен быть равен 1");
    }

    @Test
    public void testCalculateFactorialForNegativeNumber() {
        FactorialCalculator calculator = new FactorialCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateFactorial(-5),
                "Метод должен выбрасывать исключение для отрицательных чисел");
    }
}
