package com.example.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a circle");

    }

    @Override
    public double calculateArea() {
        System.out.println("Calculating area of a circle");
        return Math.PI * radius * radius;
    }
}
