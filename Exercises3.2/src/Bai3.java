import java.util.Random;

public class Bai3 {
    public static void main (String[] args) {

        Random random= new Random();
        int[][] number = new  int[3][3];
        for (int i=0; i<number.length;i++){
            for (int j=0;j<number[0].length;j++){
                number[i][j]= random.nextInt(10);
            }

        }

        for (int i=0; i<number.length;i++){
            for (int j=0;j<number[0].length;j++){
                System.out.print("\t"+number[i][j]);
            }
            System.out.println("");
        }
        // kiểm tra ma trận đơn vị
        boolean flag =true;
        for (int i=0; i<number.length;i++){
            for (int j=0;j<number[0].length;j++){
              if (number[i][j]==1){}
              else {
                  flag = false;
                  break;
              }
            }
        }
        if(flag==true)System.out.println("ma trận trên  là ma trận đơn vị");
        else System.out.println("ma trận trên không phải là ma trận đơn vị");

        // kiểm tra ma trận đơn 0
        flag=true;
        for (int i=0; i<number.length;i++){
            for (int j=0;j<number[0].length;j++){
                if (number[i][j]==0){}
                else {
                    flag=false;
                    break;
                }
            }
        }
        if (flag==true)System.out.println("ma trận trên  là ma trận 0");
        else System.out.println("ma trận trên không phải là ma trận 0");
        // kiểm tra ma trận đơn đối xứng
        flag=true;
        for (int i=0; i<number.length-1;i++){
            for (int j=i+1;j<number[0].length;j++){
                if (number[i][j]==number[j][i]);
                else {
                    flag=false;
                    break;
                }
            }
        }
        if (flag==true)System.out.println("ma trận trên  là ma trận đối xứng");
        else System.out.println("ma trận trên không phải là ma trận đối xứng");
    }
}
