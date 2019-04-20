import java.util.Scanner;

public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;

    public SmartPhone(){}
    public SmartPhone(boolean hasCamera, int sim) {
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public SmartPhone(String name, int id, double price, int quantity, boolean hasCamera, int sim) {
        super(name, id, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }
    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }
    public void setSim(int sim) {
        this.sim = sim;
    }
    @Override
    public void addNew(){
        super.addNew();
        System.out.printf("có Camera hay không (Y/N): ");
        String or = new Scanner(System.in).nextLine();
        if(or.compareToIgnoreCase("n")==0){
            this.hasCamera =false;
        }else{
            this.hasCamera=true;
        }
        System.out.printf("sim: ");
        this.sim= new Scanner(System.in).nextInt();
    }

}
