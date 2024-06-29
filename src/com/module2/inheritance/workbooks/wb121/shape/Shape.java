package com.module2.inheritance.workbooks.wb121.shape;

public abstract class Shape {

    private double radius;

    public Shape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract double getArea();

    public abstract double getVolume();

}
