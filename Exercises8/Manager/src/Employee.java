/**
 * 3. Xây dựng class Employee(id, name, salary) kế thừa lại Person
 * Override phương thức input
 */
public class Employee extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public void input() {
        super.input();
        System.out.print("Salary: ");
        this.salary=Double.parseDouble(scanner.nextLine());
        /**
         *scanner.nextDouble(); lưư lại phím enter vào bộ nhớ đệm
         * Double.parseDouble(scanner.nextLine()); không lưư lại phím enter vào bộ nhớ đệm
         */
    }

    @Override
    public String toString() {
        return super.toString()+"\nSalary: "+this.salary;
    }

    public Employee(){}
    public Employee(double salary) {
        this.salary = salary;
    }
    public Employee(String id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }


}
