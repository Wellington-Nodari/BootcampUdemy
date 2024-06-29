package com.module2.inheritance.workbooks.wb121;

import com.module2.inheritance.workbooks.wb121.shape.Cylinder;
import com.module2.inheritance.workbooks.wb121.shape.Shape;
import com.module2.inheritance.workbooks.wb121.shape.Sphere;

public class Main {

    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(1.0, 2.0);
//        cylinder.setHeight(2.0);
//        cylinder.setRadius(1.0);

        Sphere sphere = new Sphere(1.0);
//        sphere.setRadius(1.0);

        printMeasures(cylinder);
        printMeasures(sphere);

    }

    public static void printMeasures(Shape shape) {
        System.out.println("\n" + shape.getClass().getSimpleName());

        double area = shape.getArea();
        double volume = shape.getVolume();

        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }



}
