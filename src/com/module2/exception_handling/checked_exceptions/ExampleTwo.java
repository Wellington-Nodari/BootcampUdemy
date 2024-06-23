package com.module2.exception_handling.checked_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        try{
            readFile("greetings.txt");
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Process Complete!");
        }

    }
    
    public static void readFile(String fileName) throws FileNotFoundException {
         FileInputStream fis = new FileInputStream("src/com/module2/exception_handling/checked_exceptions/greetings.txt");
         Scanner scanner = new Scanner(fis);
         System.out.println(scanner.nextLine());
         scanner.close();
    }
}