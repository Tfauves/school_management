package school;

public class Teachers {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teachers(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void updateSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalExpenses(salary);
    }



}
