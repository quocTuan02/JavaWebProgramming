/**
 * 6. Tạo class EmployeeManager kế thừa Manager
 * Override các phương thức cần thiết
 */
public class EmployeeManager extends Manager {
    public final int MAX_EMPLOYEE=20;
    private int numberEmployee =0;
    private Employee[] listEmployee = new Employee[MAX_EMPLOYEE];

    public boolean add(Employee employee){
        if (numberEmployee<MAX_EMPLOYEE){
            listEmployee[numberEmployee]=employee;
            numberEmployee ++;
            return true;
        } else return false;
    }
    @Override
    public void add() {
        Employee e =new Employee();
        e.input();
        if (add(e)){
            System.out.println("success !!");
        }else System.out.println("Failure !!");
    }

    @Override
    public void show() {
        for (Employee e : listEmployee){
            if (e==null) continue;
            System.out.println(e);
        }
    }

    @Override
    public void search(String name) {
        boolean found= false;
        for (int i=0; i< listEmployee.length;i++){
            if (listEmployee[i]==null) continue;
            if ( name.compareToIgnoreCase(listEmployee[i].getName()) == 0){
                System.out.println(listEmployee[i]);
                found=true;
            }
        }
        if (!found) System.out.println(" không tìm thấy"+ " ' "+name+" '");
    }
}
