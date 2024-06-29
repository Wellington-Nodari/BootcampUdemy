package com.module2.inheritance.lesson.product;

public abstract class Product {   // abstract classes cannot be instantiated (you can't create objects of this class)
                                    // it mainly serves to the purpose to support the child classes

    private double price;
    private String color;
    private String brand;

    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void fold() {
        System.out.println("Folding my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }

    public abstract void wear();  // abstract methods don't have body, and it only serves to expose a method that the child classes MUST override
}
