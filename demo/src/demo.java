import java.text.NumberFormat;

public class demo {
    public static void main(String[] args) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        double x=0.1;
        System.out.println(currencyInstance.format(x));
        System.out.println(percentInstance.format(x));
    }
}
