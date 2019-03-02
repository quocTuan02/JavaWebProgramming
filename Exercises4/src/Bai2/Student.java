package Bai2;

import java.util.Scanner;

public class Student {
    public String studentID;
    public double AvgMark;
    public int year;
    public String cLass;

    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getAvgMark() {
        return AvgMark;
    }
    public void setAvgMark(double avgMark) {
        AvgMark = avgMark;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getcLass() {
        return cLass;
    }
    public void setcLass(String cLass) {
        this.cLass = cLass;
    }

    public void inputInfor(){
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.print("\nMÃ sinh viên: ");
            this.studentID = scanner.nextLine();
            if (studentID.length()!=8){
                System.out.println("Mã sinh viên phải chứa 8 ký tự");
            }
        }while (studentID.length()!=8);

        do {
            System.out.print("Điểm trung bình: ");
            this.AvgMark = scanner.nextDouble();
            if (AvgMark<0.0||AvgMark>10.0){
                System.out.println("Điểm trung bình: từ 0.0 – 10.0");
            }
        }while (AvgMark<0.0||AvgMark>10.0);

        do {
            System.out.print("Tuổi: ");
            this.year = scanner.nextInt();
            if (year<18){
                System.out.println("Tuổi: Phải lớn hơn hoặc bằng 18");
            }
        }while (year<18);

        scanner.nextLine();
        do {
            System.out.print("Lớp: ");
            this.cLass = scanner.nextLine();
            if(cLass.charAt(0)=='A'){
               break;
            }else  if(cLass.charAt(0)=='C'){
                break;
            } else  System.out.println("Lớp: Phải bắt đầu bởi kí tự ‘A’ hoặc kí tự ‘C’");

        }while (cLass.charAt(0)!='A'||cLass.charAt(0)!='C');
    }
    public void showInfor(){
        System.out.println("Mã sinh viên: "+studentID);
        System.out.println("Điểm trung bình: "+AvgMark);
        System.out.println("Tuổi: "+year);
        System.out.println("Lớp: "+cLass);
    }
    public void scholarship(){
        if (AvgMark>=8.0){
            System.out.println("Student được học bổng");
        } else System.out.println("Student không được học bổng");
    }

}
