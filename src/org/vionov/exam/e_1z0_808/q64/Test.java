package org.vionov.exam.e_1z0_808.q64;

public class Test {
    public static void main(String[] args) {
//        A)
//        Byte x=1;
//        B)
//        short x=1;
//        C)
//        String x = 1;
//        D)
//        Long x =1;
//        E)
//        Double x = 1;
//        F)
        Integer x = new Integer("1");
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}
