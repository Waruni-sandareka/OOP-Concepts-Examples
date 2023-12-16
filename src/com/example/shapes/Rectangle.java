package com.example.shapes;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
    }

    @Override
    public double calculateArea() {
        System.out.println("Calculating area of a rectangle");
        return length * width;
    }
}
