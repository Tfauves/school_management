package school;

import java.util.List;

public class School {

    private List<Teachers> teachersList;
    private List<Students> studentsList;
    private static int totalIncome;
    private static int totalExpenses;

    public School(List<Teachers> teachersList, List<Students> studentsList) {
        this.teachersList = teachersList;
        this.studentsList = studentsList;
        totalIncome = 0;
        totalExpenses = 0;
    }

    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    public void addTeacher(Teachers teachers) {
        teachersList.add(teachers);
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void addStudentsList(Students students) {
        studentsList.add(students);
    }

    public int getTotalIncome() {
        return totalIncome;
    }

    public static void updateTotalIncome(int income) {
        totalIncome += income;
    }

    public int getTotalExpenses() {
        return totalExpenses;
    }

    public static void updateTotalExpenses(int expenses) {
        totalIncome -= expenses;
    }
}
