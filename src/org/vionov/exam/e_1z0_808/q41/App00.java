package org.vionov.exam.e_1z0_808.q41;

import java.util.ArrayList;

public class App00 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try{
            while(true){
                myList.add("My String");
            }
        }catch (RuntimeException re){
            System.out.println("Caught a RuntimeException");
        }catch (Exception e){
            System.out.println("Caught a Exception");
        }
        System.out.println("Ready to use");
    }
}
