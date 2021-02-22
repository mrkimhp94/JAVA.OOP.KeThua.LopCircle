package com.company;

public class Cylinder extends Circle{
    private int height =5;
    public Cylinder(){};
    public Cylinder(int radius,int height){
        super(radius);
        this.height = height;
    }
    @Override
    public double getArea(){
        return super.getArea()*2+super.getPerimeter()*this.height;
    }
    public double getPerimeter(){
        return super.getArea()*this.height;
    }
}
