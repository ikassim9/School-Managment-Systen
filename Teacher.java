public class Teacher {
    private String name;
    private int id;
    private int salary;
    private int salaryEarned;

    public Teacher(String name, int id, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void receiveSalary(int receiveSalary) {
        salaryEarned += receiveSalary;
        School.setTotalMoneySpent(receiveSalary);

    }

    @Override
    public String toString() {
        return "Teacher Name: " + name + "\nSalary earned " + salaryEarned + "\nSalary received " + salary;
    }

}
