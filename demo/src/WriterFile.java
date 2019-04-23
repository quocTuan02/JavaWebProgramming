import java.io.*;


public class WriterFile {
    /*
     public static void main(String[] args) throws FileNotFoundException {
         PrintWriter pW = new PrintWriter("C:\\Users\\oOo\\Desktop\\demo.txt");
         pW.println("I miss you");
         pW.close();
     }
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\oOo\\Desktop\\demo.txt");

        try (
                PrintWriter pW = new PrintWriter(new BufferedWriter(new FileWriter(file)))
        ){
            pW.append("\nhdhdassjfbsdjfbs" +
                    "jurgfudsigvug" +
                    "fvudfbvudf" +
                    "kvsdfufvubv");

        } catch (Exception e) {

        }

        
    }

}
