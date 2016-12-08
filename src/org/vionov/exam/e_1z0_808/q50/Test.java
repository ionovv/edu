package org.vionov.exam.e_1z0_808.q50;

class MyString {
    String msg;

    public MyString(String msg) {
        this.msg = msg;
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8"));
    }
}
