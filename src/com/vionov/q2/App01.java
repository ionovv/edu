package com.vionov.q2;

public class App01 {
    public static void main(String[] args) {
        int aVar = 9;
        if (aVar++ < 10) {
            System.out.println(aVar + " Hello World!");
        } else {
            System.out.println(aVar + " Hello Universe!");
        }
    }
}
