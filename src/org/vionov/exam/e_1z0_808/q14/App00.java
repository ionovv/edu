package org.vionov.exam.e_1z0_808.q14;

/**
 * Created by user on 02.12.2016.
 */
public class App00 {
    public static void main(String[] args) {
        String shirts [][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blued";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        for (int index = 1; index<2;index++){
            for (int idx=1;idx<2;idx++){
                System.out.print(shirts[index][idx] + ":");
            }
        }
        System.out.println();
        for (int index = 1; index<2;index++){
            for (int idx=1;idx<index;++idx){
                System.out.print(shirts[index][idx] + ":");
            }
        }

//        for (int index = 1; index<2;index++){
//            for (int idx=1;idx<2;idx++){
//                System.out.print(shirts[index][idx] + ":");
//            }
//        }
        System.out.println();
        for (int index = 0; index<2;index++){
            for (int idx=0;idx<2;idx++){
                System.out.print(shirts[index][idx] + ":");
//                idx++;
            }
//            index++;
        }
    }
}
