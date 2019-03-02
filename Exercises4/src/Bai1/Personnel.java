package Bai1;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class Personnel {
    public String name;
    public int year;
    public String address;
    public double salary;
    public int timeWork;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTimeWork() {
        return timeWork;
    }
    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }

    public void inputInfor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nTên: ");
        this.name=scanner.nextLine();
        System.out.print("Tuổi: ");
        this.year=scanner.nextInt();
        System.out.print("Địa chỉ: ");
        scanner.nextLine();
        this.address=scanner.nextLine();
        System.out.print("Tiền lương: ");
        this.salary=scanner.nextDouble();
        System.out.print("Tổng số giờ làm việc: ");
        this.timeWork=scanner.nextInt();
    }
    public void printInfor(){
        System.out.print("\nTên: "+name);
        System.out.println("\nTuổi: "+year);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Tiền lương: "+salary);
        System.out.println("Tổng số giờ làm việc: "+timeWork);

    }
    public double tinhThuong(){
        double tinhThuong;
        if (timeWork>=200) {
            tinhThuong=salary*0.2;
        }else if (timeWork<200&&timeWork>=100){
            tinhThuong=salary*0.1;
        }else tinhThuong=0;
        return tinhThuong;
    }

}
