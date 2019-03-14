package Bai15;

public class Battery {
    private int energy;

    public Battery(){
        // Khởi tạo mặc định giá trị năng lượng Pin (energy) là 10
        this.energy=10;
    }


    public int getEnergy() {
        // Trả về thông tin năng lượng pin đang có
        return energy;
    }
    public void setEnergy(int energy) {
        // Thiết đặt lại giá trị mới cho pin (thực hiện việc sạc pin)
        this.energy = energy;
    }

    public void  decreaseEnergy(){
        //  mỗi lần Pin được sử dụng, năng lượng của Pin sẽ giảm đi 2 đơn vị
        energy-=2;

    }


}
