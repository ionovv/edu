package org.vionov.exam.e_1z0_808.q15;

/**
 * Created by user on 02.12.2016.
 */
public class Test {

    void readCard(int cardNo) throws Exception{
        System.out.println("read");
    }

    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("check");
    }

    public static void main(String[] args) throws Exception {
        Test ex = new Test();
        int cardNo = 12344;
        ex.checkCard(cardNo);
        ex.readCard(cardNo);
    }
}
