package org.vionov.exam.e_1z0_808.q23;

public class App00 {
}

class A{
    public A(){
        System.out.println("A ");
    }
}

class B extends A{
    public B(){
        System.out.println("B ");
    }
}

class C extends B{
    public C(){
        System.out.println("C ");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}