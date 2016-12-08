package org.vionov.exam.e_1z0_808.q19;

/**
 * Created by user on 03.12.2016.
 */
public class App00 {
    public static void main(String[] args) {
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a<b) ? ((a<c) ? a : ((b<c) ? b : c)):a;
        System.out.println(d);
    }
}
