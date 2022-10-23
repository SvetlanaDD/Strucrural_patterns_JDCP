package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.adapter.Ints;
import ru.netology.adapter.IntsCalculator;

class IntsCalculatorTest {
    Ints intsCalc = new IntsCalculator();

    @Test
    void sum() {
        Assertions.assertEquals(5, intsCalc.sum(2, 3));
    }

    @Test
    void mult() {
        Assertions.assertEquals(220, intsCalc.mult(10, 22));
    }

    @Test
    void pow() {
        Assertions.assertEquals(1024, intsCalc.pow(2, 10));
    }
}