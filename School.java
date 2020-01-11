import java.util.List;

/**
 * Many teachers, many students
 * use arrayList to account for amount of teachers and students
 */

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private List<GradeBook> grades;
    private static int totalMoneyEarned;
    private int studentFee;
    private static int totalMoneySpent;


    public School(List<Teacher> teachers, List<Student> students, List<GradeBook> gradeBooks) {
        this.teachers = teachers;
        this.students = students;
        this.grades = gradeBooks;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
        this.studentFee = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<GradeBook> getGradeBooks() {
        return grades;
    }

    public List<Student> getStudents() {
        return students;
    }


    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getStudentFee() {
        return studentFee;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);

    }

    public void addGrade(GradeBook grade) {
        grades.add(grade);
    }

    public void addStudents(Student student) {
        students.add(student);

    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public void updateStudentFee(int studentFee) {
        this.studentFee = studentFee;
    }

    public static void setTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }

}