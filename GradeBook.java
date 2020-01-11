import java.util.List;

public class GradeBook {
    private int[] grades;
    private String[] courseName;
    private int maxGrade;
    private int minGrade;
    private int avgGrade;
	

    public GradeBook(int[] grades, String[] coureNames) {
        this.grades = grades;
        this.courseName = courseName;
        this.avgGrade = avgGrade;
        this.maxGrade = maxGrade;
        this.minGrade = minGrade;

    }

    public int minGrade() {
        int smallestGrade = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < smallestGrade) {
                smallestGrade = grades[i];
            }
        }
        return smallestGrade;
    }

    public int maxGrade() {
        int largestGrade = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > largestGrade) {
                largestGrade = grades[i];
            }
        }
        return largestGrade;
    }

    public int averageGrade() {
        // Returns average of our grades. It divides sum method by count method

        double total = 0;
        double average = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];

            average = total / grades.length;
        }

        return (int) Math.round((double) sum() / count());
    }

    public int sum() {
  //e.g. for [10, 20, 30, 40] the sum is 100
        //TODO
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum;
    }

    public int count() {
        // Return the count of all our grades
        // e.g. for [10, 20, 30, 40] the count is 4
        // TODO
        return grades.length;
    }

    @Override
    public String toString() {
        return ("Average grade: " + averageGrade() + "\nMax grade: " + maxGrade + "\nMin grade: " + minGrade());

    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }
}
