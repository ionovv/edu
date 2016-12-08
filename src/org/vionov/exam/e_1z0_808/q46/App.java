package org.vionov.exam.e_1z0_808.q46;

public class App {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
//        A)
//        String str3 = str2;
//        if (str1 == str3)

//        B)
        if (str1.equalsIgnoreCase(str2))

//        C)
//        String str3 = str2;
//        if(str1.equals(str3))

//        D)
//        if (str1.toLowerCase() == str2.toLowerCase())
        {
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
