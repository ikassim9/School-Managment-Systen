import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Teacher
        Teacher lizzy = new Teacher("Lizzy", 12, 300);
        Teacher melissa = new Teacher("Melissa", 52, 500);
        Teacher john = new Teacher("John", 3, 430);
        Teacher meghan = new Teacher("Meghan", 5, 322);



        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.remove(john);



        // Student
        Student jack = new Student("Jack", 35);
        Student alex = new Student("Alex",  23);
        Student ismail = new Student("Ismail",13);





        List<Student> studentList = new ArrayList<>();
        studentList.add(jack);
        studentList.add(ismail);
        studentList.add(alex);
        System.out.println("ismail: " + ismail.getId());
        //GradeBook
        GradeBook grades = new GradeBook(new int[]{52, 32, 87, 99}, new String[]{"Algebra","History", "Art", "Geography"});
        System.out.println(grades);
    
        List<GradeBook> gradeBookList = new ArrayList<>();
        gradeBookList.add(grades);
    System.out.println(gradeBookList);



    }
}
