import java.util.Scanner;

public class Student {
    //Mỗi học sinh sẽ có thông tin cơ bản như sau:
    private String id;
    private String name;
    private double mark;
    private int group;
    private String phone;
    Scanner scanner = new Scanner(System.in);

    public void input(){
        /**
         * Nhập Mã học viên sẽ là chuỗi bắt đầu bằng chữ HV sau đó là số thứ tự gồm 3 chữ số
         * ví dụ: HV023, HV032
         */
        do {
            System.out.print("Id: ");
            this.id=scanner.nextLine();
            String str = id.split();
            boolean c ;
            try {
                Integer.parseInt(str);
                c=true;
            } catch (Exception e) {
                c=false;
            }

            if (id.startsWith("HV") && id.length()==5&& c){
                break;
            }else {
                System.out.println("Mã học viên sẽ là chuỗi bắt đầu bằng chữ HV sau đó là số thứ tự gồm 3 chữ số, ví dụ: HV023, HV032");

            }
        }while (true);
        /**
         * nhập tên học viên
         */
        System.out.print("Name: ");
        this.name=scanner.nextLine();
        /**
         * Nhập Điểm tổng kết là số thực có giá trị từ 1 - 10
         * nếu người dùng nhập sai cũng đưa ra thông báo và yêu cầu nhập lại.
         */
        do {
            try {
                System.out.print("Mark: ");
                this.mark=Integer.parseInt(scanner.nextLine());
                if (mark>=0 && mark<=10){
                    break;
                }else {
                    System.out.println("Điểm tổng kết phải là số thực có giá trị từ 1 - 10");
                }
            }catch (Exception e){
                System.out.println("Điểm tổng kết phải là số thực có giá trị từ 1 - 10");
            }
        }while (true);

        /**
         * Tương tự với số điện thoại,
         * nếu người dùng nhập sai định dạng sẽ yêu cầu nhập lại cho đến khi nhập đúng.
         */
        do {
            try {
                System.out.print("Phone: ");
                this.phone=scanner.nextLine();
                Integer.parseInt(this.phone);
                break;
            }catch (Exception e){
                System.out.println("Sai định dang số điện thoại");
            }
        }while (true);
    }

    public Student(){}
    public Student(String id, String name, double mark, int group, String phone) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.group = group;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
