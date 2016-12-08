package org.vionov.exam.e_1z0_808.q51;
public class App00 {
    public static void main(String[] args) {
        int iVar = 100;
        float fVar = 100.100f;
        double dVar = 123;
        iVar = (int) fVar;
        fVar = iVar;
        dVar = fVar;
        fVar = (float) dVar;
        dVar = iVar;
        iVar = (int) dVar;
    }
}
