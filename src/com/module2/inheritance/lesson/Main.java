package com.module2.inheritance.lesson;

import com.module2.inheritance.lesson.product.Pants;
import com.module2.inheritance.lesson.product.Product;
import com.module2.inheritance.lesson.product.Shirt;
import com.module2.inheritance.lesson.product.Shirt.Size;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(49.99, "BLUE", "NIKE", Size.MEDIUM);
//        shirt.getSize(Size.MEDIUM);  --> removed cos the Shirt class constructor was set

//        shirt.setBrand("NIKE");
//        shirt.setPrice(49.99);       --> These were removed cos the Product class was set
//        shirt.setColor("BLUE");           notice that the parameters of Product constructor must be added to the child classes constructor.

        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants(79.99, "BLACK", "LEVI'S",32, 32);
//        pants.setWaist(32);
//        pants.setLength(32);   -->  same as above ex.

//        pants.setColor("BLACK");
//        pants.setPrice(79.99);    -->  same as above ex.
//        pants.setBrand("LEVI'S");

        pants.fold();
        productStore(pants);
    }

//    public static void pantStore(Pants pants) {
//        System.out.println("Thank you for purchasing " + pants.getBrand() + " pants. Your total comes to " + pants.getPrice());
//    }
//
//    public static void shirtStore(Shirt shirt) {
//        System.out.println("Thank you for purchasing " + shirt.getBrand() + " shirt. Your total comes to " + shirt.getPrice());
//    }

    Product prod = new Shirt(49.99, "BLUE", "NIKE", Size.SMALL);
    Product prod2 = new Pants(79.99, "BLACK", "LEVI'S", 28, 32);
    // Shirt shirt = new Product();     --> Only objects of the child class can be created by referring to the parent class, Shirt and Pants extends Product


    // this method is a good simplification of the 2 above by using Polymorphism
    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". Your total comes to " + product.getPrice());
    }

}