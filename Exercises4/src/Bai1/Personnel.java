package Bai1;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class Personnel {
    private String name;
    private int year;
    private String address;
    private double salary;
    private int timeWork;

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

    public void inputInfo(){
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
    public void printInfo(){
        System.out.print("\nTên: "+name);
        System.out.println("\nTuổi: "+year);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Tiền lương: "+salary);
        System.out.println("Tổng số giờ làm việc: "+timeWork);

    }
    public double bonus(){
        double bonus;
        if (timeWork>=200) {
           bonus=salary*0.2;
        }else if (timeWork<200&&timeWork>=100){
            bonus=salary*0.1;
        }else bonus=0;
        return bonus;
    }

}
