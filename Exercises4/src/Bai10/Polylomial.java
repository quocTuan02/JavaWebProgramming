package Bai10;

import java.util.Scanner;

public class Polylomial {
    private int rank;// bậc
    private int[] factor=new int[99999999];;//hệ số

   public void input(){
       Scanner scanner=new Scanner(System.in);
       System.out.print("Nhập bậc của đa thức: ");
       rank=new Scanner(System.in).nextInt();
       for(int i = rank; i>= 0; i--){
           System.out.printf("Nhập hệ số của x^%d: ",i);
          factor[i] = scanner.nextInt();
       }
   }

   public void print(){
       for(int i = rank; i>= 0; i--){
           System.out.printf("%dx^%d ", factor[i], i);
           if(i> 0 && factor[i-1] > 0)
               System.out.printf(" + ");
       }
   }

   public void add(Polylomial a,Polylomial b){
           if(a.rank>= b.rank) {
               rank = a.rank; // lay bac max trong hai bac cua da thuc p, q
           } else rank= b.rank;

           for(int i = 0; i<= rank; i++){
               if(i<= a.rank && i<= a.rank) {
                   factor[i] = a.factor[i] + b.factor[i];
               } else if(i<= a.rank && i> b.rank) {
                   factor[i] = a.factor[i];
               } else factor[i] = b.factor[i];
           }
   }
    public void sub(Polylomial a,Polylomial b){
        if(a.rank>= b.rank) {
            rank = a.rank; // lay bac max trong hai bac cua da thuc p, q
        } else rank= b.rank;

        for(int i = 0; i<= rank; i++){
            if(i<= a.rank && i<= a.rank) {
                factor[i] = a.factor[i] - b.factor[i];
            } else if(i<= a.rank && i> b.rank) {
                factor[i] = a.factor[i];
            } else factor[i] = b.factor[i];
        }
    }
}


