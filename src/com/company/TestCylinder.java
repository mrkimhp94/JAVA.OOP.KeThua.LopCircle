package com.company;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getPerimeter());

        cylinder = new Cylinder(12,12);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getPerimeter());
    }
}
