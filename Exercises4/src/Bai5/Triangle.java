package Bai5;

import java.util.Scanner;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle(){}
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public void input(double a,double b,double c){ }

    public void input(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Cạnh a: ");
        this.a=scanner.nextDouble();
        System.out.print("Cạnh b: ");
        this.b=scanner.nextDouble();
        System.out.print("Cạnh c: ");
        this.c=scanner.nextDouble();
    }
    public void checkTriangle(){
        if((a+b)>c && (a+c)>b && (c+b)>a) {
            if(a==b && b==c){
                System.out.println("Tam giác đều");
            }else if(a==b || a==c ||c==b ) {
                if(a*a == (b*b+c*c) || (a*a+b*b)==c*c||(a*a+ c*c)==b*b){
                    System.out.println("Tam giác vuộng cân");
                }
                else System.out.println("Tam giác cân");
            }else if(a*a == (b*b+c*c) || (a*a+b*b)==c*c||(a*a+ c*c)==b*b) {
                System.out.println("Tam giác vuông");
            }else System.out.println("Tam giác thường");

        } else System.out.println("Không tạo thành tam giác");
    }
    public void checkTriangle(double a, double b,double c){
        if((a+b)>c && (a+c)>b && (c+b)>a) {
            if(a==b && b==c){
                System.out.println("Tam giác đều");
            }else if(a==b || a==c ||c==b ) {
                if(a*a == (b*b+c*c) || (a*a+b*b)==c*c||(a*a+ c*c)==b*b){
                    System.out.println("Tam giác vuộng cân");
                }
                else System.out.println("Tam giác cân");
            }else if(a*a == (b*b+c*c) || (a*a+b*b)==c*c||(a*a+ c*c)==b*b) {
                System.out.println("Tam giác vuông");
            }else System.out.println("Tam giác thường");

        } else System.out.println("Không tạo thành tam giác");
    }
    public double circumference(){
        if((a+b)>c && (a+c)>b && (c+b)>a) {
            double circumference= a+b+c;
            return circumference;
        }
        return 0;
    }
    public double circumference(double a, double b,double c){
        if((a+b)>c && (a+c)>b && (c+b)>a) {
            double circumference= a+b+c;
            return circumference;
        }
        return 0;
    }
    public double area(){
        if((a+b)>c && (a+c)>b && (c+b)>a) {
            double temp = a+b+c;
            double area=Math.sqrt(temp*(b+c-a)*(a+c-b)*(a+b-c))/4;
            return area;
        }
        return 0;
    }
    public double area(double a, double b,double c){
        if((a+b)>c && (a+c)>b && (c+b)>a) {
            double temp = a+b+c;
            double area=Math.sqrt(temp*(b+c-a)*(a+c-b)*(a+b-c))/4;
            return area;
        }
        return 0;
    }
}
