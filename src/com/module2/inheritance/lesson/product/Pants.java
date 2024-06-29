package com.module2.inheritance.lesson.product;


public class Pants extends Product{

    private int waist;
    private int length;

    public Pants(double price, String color, String brand, int waist, int length) {
        super(price, color, brand);
        this.waist = waist;
        this.length = length;
    }

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void fold() {
        System.out.println("Folding a pants.");
        super.fold();
    }

    @Override
    public void wear() {
        System.out.println("The pants fits well on you!");
    }

//    @Override
//    public String toString() {
//        return "Pants{" +
//                "waist=" + waist +
//                ", length=" + length +
//                '}';
//    }
}