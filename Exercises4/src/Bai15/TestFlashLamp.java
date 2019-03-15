package Bai15;
/*
Mô phỏng sự hoạt dộng của một chiếc đèn pin.
Với hai nhóm đối tượng cơ bản là Đèn (FlashLap) và Pin (Battery).
Đối tượng pin mang trong mình thông tin về trạng thái năng lượng,
đối tượng đèn sữ sử dụng một đối tượng pin để cung cấp năng lượng cho hoạt động chiếu sáng.
Mô tả chi tiết lớp các đối tượng pin và đèn như sau:
 */
public class TestFlashLamp {
    public static void main(String[] args) {
        Battery battery= new Battery(); //- Khai báo và khởi tạo một đối tượng Battery
        FlashLap flashLap = new FlashLap();//- Khai báo và khởi tạo một đối tượng FlashLamp
        flashLap.setBattery(battery);//- Lắp pin cho đèn
        // - Bật và tắt đèn pin 10 lần
        // - Hiển thị ra màn hình mức năng lượng còn lại trong pin

    }
}
