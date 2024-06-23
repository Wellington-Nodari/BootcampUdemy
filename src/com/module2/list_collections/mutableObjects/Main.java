package com.module2.list_collections.mutableObjects;

public class Main {
    public static void main(String[] args) {

        // **************** Immutable Object ****************
        Integer applesWrapper = 5;

        Integer applesWrapper2 = applesWrapper;     // SAFE
        applesWrapper2 = 10;

        System.out.println(applesWrapper);
        System.out.println(applesWrapper2);

        // **************** Mutable Object ****************
        
        City city = new City("Paris", 2161000);
        City secondCity = city;            // DANGEROUS
        City thirdCity = new City(city);   // SAFE

        city.setPopulation(2261000);
        secondCity.setPopulation(2263400);
        thirdCity.setPopulation(2263401);
        city.setPopulation(2163400);
        secondCity.setPopulation(2443400);
        thirdCity.setPopulation(2443401);

        String a = "hi";
        String b = a;

        b = "hello";

        System.out.println(a + b);

    }
}