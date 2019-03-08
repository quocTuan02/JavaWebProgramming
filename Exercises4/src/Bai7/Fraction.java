package Bai7;

import java.util.Scanner;

public class Fraction {
    private int numerator;//tu so
    private int denominator;//mau so

    public int getNumerator(){
        return numerator;
    }
    public void setNumerator(int numerator){
        this.numerator=numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setDenominator(int denominator){
        this.denominator=denominator;
    }

    public Fraction(){}
    public Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public void input(){
        System.out.print("nhập lần lượt tử số và mẫu số: ");
        this.numerator=new Scanner(System.in).nextInt();
        this.denominator=new Scanner(System.in).nextInt();
    }
    public void print(){
        if (denominator!=1 && numerator!=0){
            System.out.print(numerator+"/"+denominator);
        }else System.out.print(numerator);
    }


    public void printInverse(Fraction a){
        //phan so nghich dao
        System.out.println(a.denominator+"/"+a.numerator);
    }

    public void compact(){
        // rut gon phan so
       if (numerator!=0){
           int temp = gcd(numerator,denominator);
           numerator/=temp;
           denominator/=temp;
       }
    }

    public int gcd(int x,int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        while (x != y) {
            if (x > y) {
                x -= y;
            } else y -= x;
        }
        return x;// ước chung lớn nhất
    }

    public int gcd(Fraction a){
        // tìm ước chung lớn nhất
        a.numerator=Math.abs(a.numerator);
        a.denominator=Math.abs(a.denominator);
        while (a.numerator!=a.denominator){
            if (a.numerator>a.denominator){
                a.numerator=a.numerator-a.denominator;
            } else a.denominator=a.denominator-a.numerator;
        }
        return a.numerator;// ước chung lớn nhất
    }


    public int lcm(int a,int b){
        return (a*b)/gcd(a,b);// boi chung nho nhat
    }

    public int lcm(Fraction a){
        //tìm boi chung nho nhat
        return (a.numerator*a.denominator)/gcd(a);// boi chung nho nhat
    }


    public void add(Fraction a,Fraction b){
        numerator=a.numerator*lcm(a.denominator,b.denominator)/a.denominator
                +b.numerator*lcm(a.denominator,b.denominator)/b.denominator;
        denominator= lcm(a.denominator,b.denominator);
        compact();
    }

    public  void sub(Fraction a,Fraction b){
        numerator=a.numerator*lcm(a.denominator,b.denominator)/a.denominator
                -b.numerator*lcm(a.denominator,b.denominator)/b.denominator;
        denominator= lcm(a.denominator,b.denominator);
        compact();
    }

    public void mul(Fraction a,Fraction b){
        numerator = a.numerator*b.numerator;
        denominator =a.denominator*b.denominator;
        compact();
    }

    public void div(Fraction a,Fraction b){
        numerator = a.numerator*b.denominator;
        denominator = a.denominator*b.numerator;
        compact();
    }


}
