package ru.netology.adapter;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println("2 + 3 = " + intsCalc.sum(2, 3));
        System.out.println("10 * 22 = " + intsCalc.mult(10, 22));
        System.out.println("2  pow  10 = " + intsCalc.pow(2, 10));
    }
}
