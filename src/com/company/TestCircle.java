package com.company;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        circle = new Circle(12);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
