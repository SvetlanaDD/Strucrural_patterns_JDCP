package ru.netology.facade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("111010 + 1101010 = " + bins.sum("0111010", "1101010"));
        System.out.println("11 * 110 = " + bins.mult("11", "110"));
    }
}
