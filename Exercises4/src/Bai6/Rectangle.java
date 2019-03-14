package Bai6;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){}
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public void input(){
        System.out.print("chiều dài: ");
        this.length=new Scanner(System.in).nextDouble();
        System.out.print("chiều rộng: ");
        this.width=new Scanner(System.in).nextDouble();
    }
    public double circumference(){
        return length+width;
    }
    public double circumference(double length,double width){
        return length+width;
    }

    public double area(){
        return length*width;
    }
    public double area(double length, double width){
        return length*width;
    }

}
