package com.module2.exception_handling.unchecked_exceptions.common_exceptions;

import java.util.Scanner;

public class CommonExceptions {
    public static void main(String[] args) {

        //**************ArrayIndexOutOfBounds**************//
        int[] grades = new int[] {96, 65, 56, 86};
        System.out.println(grades[3]);   // if it's requested from the array an index not exiting eg. grades[4] it will throw the "ArrayIndexOutOfBounds" exception

       //**************NullPointerException**************//
        String[] names = new String[7]; 
        names[0] = "John";
        names[1] = "Jim";
        names[2] = "Joe";

        for (String name : names) {  // the array has 7 elements, but only 3 was created with Strings content the other ones are null,
            if (name != null) {      // THIS IF STATEMENT will prevent the "NullPointerException" exception
                System.out.println(name.toUpperCase());
            }
        }

        //**************InputMismatchException**************//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random integer");
        if (scanner.hasNextInt()) {  // THIS IF STATEMENT will prevent the "InputMismatchException" exception by assuring that an int is entered otherwise it continues and
            scanner.nextInt();
        } else  {
            System.out.println("Not integer value was entered, closing the program...");
            scanner.next();
        }
        scanner.close();

    }
}