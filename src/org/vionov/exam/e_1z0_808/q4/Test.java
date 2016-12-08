package org.vionov.exam.e_1z0_808.q4;

import java.io.IOException;

class X {
    public void printFileContent() throws IOException {
        throw new IOException();
    }
}

public class Test {
    public static void main(String[] args) throws IOException {
        X xobj = new X();
        xobj.printFileContent();
    }
}
