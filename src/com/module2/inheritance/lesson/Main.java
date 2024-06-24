package com.module2.inheritance.lesson;

import com.module2.inheritance.lesson.product.Pants;
import com.module2.inheritance.lesson.product.Shirt;
import com.module2.inheritance.lesson.product.Shirt.Size;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt();
        shirt.getSize(Size.SMALL);
        shirt.setBrand("NIKE");
        shirt.setPrice(49.99);
        shirt.setColor("BLUE");
        shirt.fold();

        Pants pants = new Pants();
        pants.setWaist(32);
        pants.setLength(32);
        pants.setColor("BLACK");
        pants.setPrice(79.99);
        pants.setBrand("LEVI'S");
        pants.fold();
    }

}