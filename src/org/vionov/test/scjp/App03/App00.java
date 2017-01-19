package org.vionov.test.scjp.App03;

public class App00 {

    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd' };

        String newStr = "";
        for(char ch : myCharArr){
            newStr = newStr + ch;
        }

        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));

    }
}