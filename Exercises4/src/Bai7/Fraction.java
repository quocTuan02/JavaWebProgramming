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
        int a= Math.abs(numerator);
        int b= Math.abs(denominator);
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
        return a;// ước chung lớn nhất
    }
    public int lcm(int a,int b){
        return (a*b)/gcd(a,b);// boi chung nho nhat
    }
    public void compact(){
        // rut gon phan so
        int a= numerator/gcd();
        int b= denominator/gcd();

        if (b!=1){
            System.out.println(a+"/"+b);
        } else System.out.println(a);
    }
    public void inverse(){
        //phan so nghich dao
        System.out.println(denominator+"/"+numerator);
    }
    public void add(){
        System.out.println("phép cộng 2 phân số");
        int tuSo1,tuSo2,mauSo1,mauSo2;
        Scanner scanner= new Scanner(System.in);
        System.out.print("tuSo1: ");
        tuSo1=scanner.nextInt();
        System.out.print("mauSo1: ");
        mauSo1=scanner.nextInt();

        System.out.print("tuSo2: ");
        tuSo2=scanner.nextInt();
        System.out.print("mauSo2: ");
        mauSo2=scanner.nextInt();

        numerator=tuSo1*lcm(mauSo1,mauSo2)/mauSo1+tuSo2*lcm(mauSo1,mauSo2)/mauSo2;
        denominator= lcm(mauSo1,mauSo2);
        System.out.print(tuSo1+"/" +mauSo1 +" + "+tuSo2+"/"+mauSo2 +" = ");
        compact();

    }
    public  void sub(){
        System.out.println("phép trừ 2 phân số");
        int tuSo1,tuSo2,mauSo1,mauSo2;
        Scanner scanner= new Scanner(System.in);
        System.out.print("tuSo1: ");
        tuSo1=scanner.nextInt();
        System.out.print("mauSo1: ");
        mauSo1=scanner.nextInt();

        System.out.print("tuSo2: ");
        tuSo2=scanner.nextInt();
        System.out.print("mauSo2: ");
        mauSo2=scanner.nextInt();

        numerator=tuSo1*lcm(mauSo1,mauSo2)/mauSo1 - tuSo2*lcm(mauSo1,mauSo2)/mauSo2;
        denominator= lcm(mauSo1,mauSo2);
        System.out.print(tuSo1+"/" +mauSo1 +" - "+tuSo2+"/"+mauSo2 +" = ");
        compact();
    }
    public void mul(){
        System.out.println("phép nhân 2 phân số");
        int tuSo1,tuSo2,mauSo1,mauSo2;
        Scanner scanner= new Scanner(System.in);
        System.out.print("tuSo1: ");
        tuSo1=scanner.nextInt();
        System.out.print("mauSo1: ");
        mauSo1=scanner.nextInt();

        System.out.print("tuSo2: ");
        tuSo2=scanner.nextInt();
        System.out.print("mauSo2: ");
        mauSo2=scanner.nextInt();

        numerator = tuSo1*tuSo2;
        denominator = mauSo1*mauSo2;
        System.out.print(tuSo1+"/" +mauSo1 +" * "+tuSo2+"/"+mauSo2 +" = ");
        compact();
    }
    public void div(){
        System.out.println("phép chia 2 phân số");
        int tuSo1,tuSo2,mauSo1,mauSo2;
        Scanner scanner= new Scanner(System.in);
        System.out.print("tuSo1: ");
        tuSo1=scanner.nextInt();
        System.out.print("mauSo1: ");
        mauSo1=scanner.nextInt();

        System.out.print("tuSo2: ");
        tuSo2=scanner.nextInt();
        System.out.print("mauSo2: ");
        mauSo2=scanner.nextInt();

        numerator = tuSo1*mauSo2;
        denominator = mauSo1*tuSo2;
        System.out.print(tuSo1+"/" +mauSo1 +" % "+tuSo2+"/"+mauSo2 +" = ");
        compact();
    }

}
