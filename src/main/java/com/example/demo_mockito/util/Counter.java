package com.example.demo_mockito.util;

public class Counter {

    private int total = 0;

    public void reset() {
        total = 0;
    }

    public void add(int getal) {
        total += getal;
    }

    public int getTotal() {
        return total;
    }
}
