package com.module2.higher_order_functions.workbook.n137;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/com/module2/higher_order_functions/workbook/n137/emails.txt");

        Files.lines(path)
                .filter(email -> !email.startsWith("Spam"))
                .forEach(System.out::println);

    }
}
