package StudentManager;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {
    private String name;
    private String email;
    private String rollNumber;
    private Date dob;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String email, String rollNumber) {
        this.name = name;
        this.email = email;
        this.rollNumber = rollNumber;
        this.dob = new Date();
    }

    public Student(String name, String email, String rollNumber, Date dob) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", dob=" + formatter.format(dob) +
                '}';
    }



}
