package StudentManager;

public class InputStudent extends Student {
    public String inputId() {
        String tempId = this.scanner.nextLine();
        try {
            //Kiem tra dieu kien
            // Biểu thức chính quy - Regular Expression
            if (!tempId.matches("HV[0-9]{3}"))
                throw new Exception("Phai bat dau bang HV va 3 so");
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputId();
        }
        return tempId;
    }

    public String inputName() {
        String tempName = this.scanner.nextLine();
        if (tempName.length() >= 2) {
            return tempName;
        }
        System.out.print("Tên không hợp lệ" +
                "\nNhập lại tên: ");
        return this.inputName();

    }

    /*
        public static void main(String[] args) {
            InputStudent ip = new InputStudent();
            System.out.println("name: ");

            System.out.println(ip.inputName());
        }
    */
    
    public double inputMark() {
        double tempMark = 0;
        try {
            tempMark = Double.parseDouble(scanner.nextLine());
            if (tempMark < 1 || tempMark > 10) {
                System.out.println("Điểm tổng kết phải là số thực có giá trị từ 1 - 10" +
                        "\nNhập lại điểm");
                return this.inputMark();
            }
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputMark();
        }
        return tempMark;
    }

    public String inputPhone() {
        String tempPhone = this.scanner.nextLine();
        try {
            if (!tempPhone.matches("0[1-9]{1}\\d{8}$"))
                throw new Exception("SĐT có dạng 0xxxxxxxxx");
        } catch (Exception e) {
            System.out.println("Sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputPhone();
        }
        return tempPhone;
    }
}
