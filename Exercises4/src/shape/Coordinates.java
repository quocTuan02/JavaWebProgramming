package shape;

import java.util.Scanner;

public class Coordinates {
    // tọa độ
    protected int x;
    protected int y;
    // đường kính
    protected double diameter;


    public Coordinates() {
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates(int x, int y, double diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void input() {
        System.out.print("Tọa độ x: ");
        int x = new Scanner(System.in).nextInt();
//         setX(a);
        System.out.print("Tọa đọ y: ");
        int y = new Scanner(System.in).nextInt();
//         setY(b);
    }

    public void input(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + this.x + ";" + this.y + ")");
    }

    @Override
    public String toString() {
        return "(" + this.x + ";" + this.y + ")";
    }

    public Coordinates vector(Coordinates a, Coordinates b ){
        Coordinates c=new Coordinates();
        c.x=b.x - a.x;
        c.y=b.y- a.y;
        return c;
    }

    public double length(Coordinates a){
        double length = Math.sqrt(a.x*a.x +a.y*a.y);
        return length;
    }

}



