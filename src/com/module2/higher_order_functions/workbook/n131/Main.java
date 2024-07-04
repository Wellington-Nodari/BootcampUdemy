package com.module2.higher_order_functions.workbook.n131;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Payment> payments = Arrays.asList(
                new Payment(LocalDate.of(2020, 1, 1), 100.00),
                new Payment(LocalDate.of(2020, 2, 15), 200.00),
                new Payment(LocalDate.of(2020, 3, 30), 300.00),
                new Payment(LocalDate.of(2020, 4, 1), 50.00),
                new Payment(LocalDate.of(2020, 5, 15), 75.00),
                new Payment(LocalDate.of(2020, 6, 30), 100.00)
        );

        payments.forEach(payment -> System.out.println("Date: " + payment.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nAmount: " + payment.getAmount() + "\n---"));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 1, 9, 3, 7));

        numbers.sort((a, b) -> a.compareTo(b));
//        for (int i = 0; i < numbers.size() - 1; i++) {
//            for (int j = 0; j < numbers.size() - i - 1; j++) {
//                if (numbers.get(j) > numbers.get(j + 1)) {
//                    // Swap numbers.get(j) and numbers.get(j+1)
//                    int temp = numbers.get(j);
//                    numbers.set(j, numbers.get(j + 1));
//                    numbers.set(j + 1, temp);
//                }
//            }
//        }

        System.out.println(numbers);
    }


}
