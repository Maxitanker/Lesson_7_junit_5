package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculateFactorial {

    @DisplayName("Проверка нуля и положительных чисел")
    @ParameterizedTest
    @CsvSource({"0, 1", "1, 1", "7, 5040", "13, 1932053504"})
    public void testFactorialPositive(int n, int expected) {
        assertEquals(expected, FactorialCalculator.factorial(n));
    }

    @DisplayName("Проверка на отрицательные числа")
    @ParameterizedTest
    @ValueSource(ints = {-1, -10, -42})
    public void testFactorialNegative(int n) {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(n)
        );
     }
 }
