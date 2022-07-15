package school;

public class Students {
    private int id;
    private String name;
    private int cohort;
    private int feesPaid;
    private int feesTotal;


    public Students(int id, String name, int cohort) {
        this.id = id;
        this.name = name;
        this.cohort = cohort;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    public void setCohort(int cohort) {
        this.cohort = cohort;
    }

    public void updateFeesPaid(int amtPaid) {
        feesPaid += amtPaid;
        School.updateTotalIncome(amtPaid);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }

    public String getName() {
        return name;
    }

    public int getCohort() {
        return cohort;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }


    @Override
    public String toString() {
        return "student name: " + name + "\n" + " fees paid: " + feesPaid;
    }
}
