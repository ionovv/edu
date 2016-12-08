package org.vionov.exam.e_1z0_808.q16;

/**
 * Created by user on 02.12.2016.
 */
public class App00 {
    public static void main(String[] args) {
        int x = 5;
        while (isAvaliable(x)){
            System.out.print(x);
        }
    }

    public static boolean isAvaliable(int x){
        return x-- > 0;
    }
}
