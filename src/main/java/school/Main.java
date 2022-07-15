package school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teachers gabe = new Teachers(1, "Gabe", 25);
        Teachers cliff = new Teachers(2, "Cliff", 30);

        List<Teachers> cdTeaches = new ArrayList<>();
        cdTeaches.add(gabe);
        cdTeaches.add(cliff);


        Students sergio = new Students(1, "Sergio", 12);
        Students keith = new Students(2, "Keith", 12);

        List<Students> cdStudents = new ArrayList<>();
        cdStudents.add(sergio);
        cdStudents.add(keith);

        School careerDevs = new School(cdTeaches, cdStudents);
        sergio.updateFeesPaid(3000);
        System.out.println("careerDevs has earned $" + careerDevs.getTotalIncome());

        System.out.println(sergio.toString());
    }
}
