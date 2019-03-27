/**
 * 5. Tạo class StudentManager kế thừa Manager
 * Override các phương thức cần thiết
 */

public class StudentManager extends Manager {
    private final int MAX_STUDENT =20;
    private int numberStudent=0;
    private  Student[] listStudents = new Student[MAX_STUDENT]  ;

    public boolean add(Student student){
        if ( numberStudent<MAX_STUDENT ){
            listStudents[numberStudent]=student;
            numberStudent++;
            return true;
        }
        return false;
    }
    @Override
    public void add() {
        Student hs =new Student();
        hs.input();
        if (add(hs)) {
            System.out.println("success !!");
        }else System.out.println("Failure !!");

    }

    @Override
    public void show() {
        for (int i = 0; i <listStudents.length; i++) {
            if (listStudents[i]==null) continue;
            System.out.println(listStudents[i]);
        }
    }

    @Override
    public void search(String name) {
        boolean found= false;
        for (int i=0; i< listStudents.length;i++){
            if (listStudents[i]==null) continue;
            if ( name.compareToIgnoreCase(listStudents[i].getName()) == 0){
                System.out.println(listStudents[i]);
                found=true;
            }
        }
        if (!found) System.out.println(" không tìm thấy"+ " ' "+name+" '");
    }




}
