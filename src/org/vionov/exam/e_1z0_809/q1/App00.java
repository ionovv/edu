package org.vionov.exam.e_1z0_809.q1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.file.Files.readAllLines;

public class App00 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("courses.txt");

//        A)
//        List<String> fc = Files.list(file);
//        fc.stream().forEach(s -> System.out.println(s));

//        B)
//        Stream<String> fc = Files.readAllLines(file);
//        fc.forEach(s -> System.out.println(s));

//        C)
//        List<String> fc = readAllLines(file);
//        fc.stream().forEach(s -> System.out.println(s));

//        D)
        Stream<String> fc = Files.lines(file);
        fc.forEach(s -> System.out.println(s));
    }
}
