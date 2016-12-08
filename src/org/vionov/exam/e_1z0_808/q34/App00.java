package org.vionov.exam.e_1z0_808.q34;

public class App00 {
    public static void main(String[] args) {
        double discount = 0;
//        int qty = Integer.parseInt(args[0]);
        int qty = 90;

//        1.
        if (qty >= 90) {
            discount = 0.5;
        }
        if (qty > 80 && qty < 90) {
            discount = 0.2;
        }

//        2.
//        discount = (qty >= 90) ? 0.5 : 0;
//        discount = (qty > 80) ? 0.2 : 0;

//        3.
        discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;

//        4.
//        if (qty > 80 && qty < 90) {
//            discount = 0.2;
//        } else {
//            discount = 0;
//        }
//
//        if (qty >= 90) {
//            discount = 0.5;
//        } else {
//            discount = 0;
//        }

//        5.
//        discount = (qty > 80) ? 0.2 : (qty >= 90) ? 0.5 : 0;

        System.out.println(discount);
    }
}
