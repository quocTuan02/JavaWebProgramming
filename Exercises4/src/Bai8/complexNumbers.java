package Bai8;



import java.util.Scanner;

public class complexNumbers {
    private double real,imag;

    public complexNumbers(){}
    public complexNumbers(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real=real;
    }
    public double getImag(){
        return imag;
    }
    public void setImag(double imag){
        this.imag= imag;
    }


   public void input(){
       System.out.print("nhập lần lượt phần thực và ảo: ");
       real=new Scanner(System.in).nextDouble();
       imag=new Scanner(System.in).nextDouble();

   }
   public void print(){
       System.out.print("("+real+" ");
       if (imag>=0) {
           System.out.print("+ "+imag+"i)");
       }else System.out.print(+imag+"i)");
   }

   public void add(complexNumbers a,complexNumbers b){
        this.real=a.real+b.real;
        this.imag=a.imag+b.imag;
   }
   public void sub(complexNumbers a,complexNumbers b){
        this.real=a.real-b.real;
        this.imag=a.imag-b.imag;
   }
   public void mul(complexNumbers a,complexNumbers b){
        this.real=a.real*b.real -a.imag*b.imag;
        this.imag= a.real*b.imag+a.imag*b.real;
   }
   public void div(complexNumbers a,complexNumbers b){
        this.real=(a.real*b.real+a.imag*b.imag)/(b.real*b.real+b.imag*b.imag);
        this.imag=(a.imag*b.real-a.real*b.imag)/(b.real*b.real+b.imag*b.imag);
   }

}
