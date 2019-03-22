import java.util.Scanner;

public class Camera extends Product{
    private boolean hasWfi;

    public Camera(){}
    public Camera(boolean hasWfi) {
        this.hasWfi = hasWfi;
    }

    public Camera(String name, int id, double price, int quantity, boolean hasWfi) {
        super(name, id, price, quantity);
        this.hasWfi = hasWfi;
    }

    public boolean isHasWfi() {
        return hasWfi;
    }

    public void setHasWfi(boolean hasWfi) {
        this.hasWfi = hasWfi;
    }
    @Override
    public void addNew(){
        super.addNew();
        System.out.printf("có Wifi hay không (Y/N): ");
        String or = new Scanner(System.in).nextLine();
        if(or.compareToIgnoreCase("n")==0){
            this.hasWfi =false;
        }else{
            this.hasWfi=true;
        }
    }
}
