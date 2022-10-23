package ru.netology.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinOpsTest {
    BinOps bins = new BinOps();
    @Test
    void sum() {
        Assertions.assertEquals("10100100", bins.sum("0111010","1101010"));
    }

    @Test
    void mult() {
        Assertions.assertEquals("10010", bins.mult("11", "110"));
    }
}