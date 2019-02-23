import java.util.Random;

public class Bai4 {


    public static void main (String[] args){
        /*
        Sử dụng lớp Random đẻ tạo ra mảng số nguyên ngẩu nhiên 15 phần tử. In ra mảng vừ tạo và
        - Sắp xếp mảng vừa tạo theo thứ tự tăng dần
        - Sắp xếp mảng vừa tạo theo thứ tự giảm dần
        - Đêm xem trong mảng có bao nhiêu số chẳn
        - Đếm xem trong mảng có bao nhiêu số lẻ.
         */

        Random random= new Random();
        int[] number = new int[15];
        for (int i=0;i<number.length;i++){
            number[i]=random.nextInt(10000);
        }
        // In ra mảng
        for (int i=0;i<number.length;i++){
            System.out.print("\t"+number[i]);
        }

        // Sắp xếp mảng vừa tạo theo thứ tự tăng dần
        int temp;
        for (int i=0;i<number.length-1;i++){
            for (int j=i+1;j<number.length;j++){
                if (number[i]>number[j]) {
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.println("\nSắp xếp mảng vừa tạo theo thứ tự tăng dần: ");
        for (int i=0;i<number.length;i++){
            System.out.print("\t"+number[i]);
        }
        // Sắp xếp mảng vừa tạo theo thứ tự giảm dần
        System.out.println("\nSắp xếp mảng vừa tạo theo thứ tự giảm dần:");
        for (int i=number.length-1;i>=0;i--){
            System.out.print("\t"+number[i]);
        }



        // Đêm xem trong mảng có bao nhiêu số chẳn
        //Đếm xem trong mảng có bao nhiêu số lẻ.
        int soChan=0;
        int soLe=0;
        for (int i=0;i<number.length;i++){
            if(number[i]%2==0) soChan++;
            else soLe++;
        }
        System.out.printf("\nCó %d số chẳn",soChan);
        System.out.printf("\nCó %d số lẻ",soLe);

    }
}





