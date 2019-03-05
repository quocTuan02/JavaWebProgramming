package Bai7;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

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

    public void input(){
        System.out.print("tử số: ");
        this.numerator=new Scanner(System.in).nextInt();
        System.out.print("mẫu số: ");
        this.denominator=new Scanner(System.in).nextInt();
    }
    public void print(){
        System.out.println(numerator+"/"+denominator);
    }

    public int gcd(){
        int a= numerator;
        int b= denominator;
        while (a!=b){
            if (a>b){
                a=a-b;
            } else b=b-a;
        }
        return a;
    }
    public int gcd(int a,int b){
        while (a!=b){
            if (a>b){
                a=a-b;
            } else b=b-a;
        }
        return a;
    }
    public void compact(){
        int a= numerator/gcd();
        int b= denominator/gcd();
        System.out.println(a+"/"+b);
    }
    public void inverse(){
        System.out.println(denominator+"/"+numerator);
    }
    public void add(){
        
    }

}
