package org.vionov.exam.e_1z0_808.q20;

public class App00 {
    public static void main(String[] args) {

        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
                i++;
            }

        }
        for (String[] ca : chs) {
            int t = ca.length;
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
