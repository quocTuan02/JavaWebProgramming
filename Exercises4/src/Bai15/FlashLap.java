package Bai15;

public class FlashLap extends Battery{
    private boolean status;
    //  trạng thái của đèn, nếu status = true tức đèn được bật, ngược lại đèn tắt.

    private Battery battery ;// pin của đèn

    public  void FlashLamp(){
        // khởi tạo trạng thái đèn tắt và chưa có pin
        status=false;
    }

    public  void setBattery(Battery b){
        // nạp pin cho đèn
        b.setEnergy(10);
    }

    public  int getBatteryInfo(){
        // lấy về năng lượng Pin của đèn
        return getEnergy();
    }

    public void turnOn(){
        // In ra thông tin đèn có sáng hay không (trạng thái đèn là true và năng lượng > 0)
        if (status== true && getBatteryInfo()>0){
            System.out.println(" đèn sáng");
        }
        decreaseEnergy();
    }

    public  void turnOff(){
        // In ra thông tin đèn không
        if (status==false || getBatteryInfo()==0){
            System.out.println("đèn không sáng");
        }
    }


}
