package org.vionov.exam.e_1z0_808.q22;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 04.12.2016.
 */
public class App00 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")) {
            names.remove("Jon");
        }
        System.out.println(names);
    }
}
