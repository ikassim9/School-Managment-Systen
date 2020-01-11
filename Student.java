/**
 * This class keeps track of students fees, Name, grade , ID fees paid
 */
public class Student {
    private String name;
    private int id;
    private int feesPaid;
    private int feesTotal;

    public Student(String name,  int ID) {
        this.id = ID;
        this.name = name;
        this.feesPaid = 0;
        this.feesTotal = 0;
    }


// Setters and Getters




    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFee(int fee) {
        this.feesTotal = fee;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getFeesTotal() {
        return feesTotal;


    }

    public int getRemainingFees(int updateFee) {
        return updateFee -= feesPaid - feesTotal;
    }

    @Override
    public String toString() {
        return "Student's name: " + name + "\nTotal fee paid " + feesPaid  + "\nTotal fee  " + feesTotal;
    }

}


