package org.vionov.exam.e_1z0_808.q13;

public class App00 {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int) (Math.random() * 1000));
        acct.changeAmount(acct.getAmount());
        System.out.println(acct.getAmount());
    }
}

