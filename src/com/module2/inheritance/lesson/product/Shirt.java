package com.module2.inheritance.lesson.product;

public class Shirt extends Product{

    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    public Shirt(double price, String color, String brand, Size size) {
        super(price, color, brand);
        this.size = size;
    }

    public Size getSize(Size small) {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override  // this keyword ensures that you're actually overriding a method from a parent class
    public void fold() {
        System.out.println("Folding a shirt.");
        super.fold();  // super.<something> will access members of the parent class/ super class
    }

    @Override
    public void wear() {
        System.out.println("The shirt looks great on you!");
    }

    @Override
    public String toString() {
        return "SHIRT: " + this.size + " " + super.getBrand() + " " + super.getColor() + " " + super.getPrice();
    }
}
