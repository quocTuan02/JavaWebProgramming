package CleanCode;
/*
//CLEAN CODE
- Meaningful names (tên phải có ý nghĩa) :
    + Use intention-revealing Names ( tên nó phải thể hiện được chức năng ) :
    + Use Pronounceable Names ( tên phải dễ phát âm ): đặt tên theo quy tắc CamelCase
    + Class Names( tên lớp ): Tên class không nên là động từ, nó là danh từ
        * Thêm cái nữa là giả sử từ Address.
            Thấy hay có cái như AccountAddress ClientAddress MACAddress.
            Nó khá dư thừa
        * Tốt hơn nên sử dụng luôn MAC thay cho MACAdress.
            Còn ClientAddress hay AccountAddress thì nên là Client.Address thay cho Client.ClientAddress.
            Tên class nó thể hiện rồi mà.
        *Trong trường hợp cùng một class mà có 2 property liên quan đến address
            như Client.HouseAddress và Client.CompanyAddress thì nên dùng
    + Method Names( tên phương thức ) : Tên của method nên bắt đầu bằng một động từ.
        1 method thì có nghĩa là làm một cái gì đó. Làm thì phải động từ 😀
- Function (hàm)
    + Chỉ nên thực hiện một chức năng
    + Ngắn gọn (nên trong khoảng tầm 20 dòng tầm 150 kí tự là đẹp)
- Hạn chế Comment :
    + nên để tên hàm ( tên phương thức , tên biến , ...) thể hiện


 */


//BAD
public class User {
    private String name;
    private long dateofbirth;
    private long membersince;

    public long getmembersince() {
        return this.membersince;
    }
}


//GOOD
class Task {

    public static void main(String[] args) {
int taskEstimate[]=; int realdays


        //GOOD
        final int WORK_DAYS_PER_WEEK = 5;
        final int NUMBER_OF_TASKS = 34;
        int realDaysPerIdealDay = 4;
        int sum = 0;
        for (int j = 0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }

        double s = 0, t[ 5];

        //BAG
        for (int j = 0; j < 34; j++) {
            s += (t[j] * 4) / 5;
        }

    }


}








