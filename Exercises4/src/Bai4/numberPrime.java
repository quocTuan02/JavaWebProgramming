package Bai4;

import java.util.Scanner;

public class numberPrime {
    private int a;
    public int getA() {
        return a;
    }

    public void setA() {
        System.out.print("x: ");
        int x= new Scanner(System.in).nextInt();
        if(checkPrime(x)) {
            this.a = x;
        }else {
            System.out.println("x không phải là số nguyên tố, không lưu trữ.");
//            System.out.println("không set.");
        }
    }

    public boolean checkPrime(int x){
        if (x<2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int primeNext(){
        int numberNext=this.a;
        while (checkPrime(this.a)) {
            numberNext++;
            if (checkPrime(numberNext)){
                System.out.println("Số nguyên tố tiếp theo: "+numberNext);
                break;
            }

        }
        return numberNext;
    }



}
