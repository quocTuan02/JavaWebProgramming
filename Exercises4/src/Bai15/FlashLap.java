package Bai15;

public class FlashLap extends Battery{
    private boolean status;// trạng thái của đèn, nếu status =10

    Battery battery = new Battery();

    public  void FlashLamp(){
        // khởi tạo trạng thái đèn tắt và chưa có pin

    }

    public  void setBattery(Battery b){
        // nap pin cho đèn
    }

    public  int getBatteryInfo(){
        // lấy về năng lượng Pin của đèn
        return getEnergy();
    }

    public void turnOn(){
        // In ra thông tin đèn có sáng hay không (trạng thái đèn là true và năng lượng > 0)
    }

    public  void turnOff(){
        // In ra thông tin đèn không sáng
    }


}
