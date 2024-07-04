package com.module2.bigDecimal;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal z = new BigDecimal("0.9");
        BigDecimal v = new BigDecimal("0.7");

        double x = 0.7;
        double y = 0.9;

        System.out.println(x * y);

        System.out.println("Big Decimal: " + v.multiply(z));

        double piLong = Math.PI;
        String pi = String.valueOf(Math.PI);
        System.out.println(pi);
        System.out.println("\n");
        System.out.println(piLong);
    }
}
