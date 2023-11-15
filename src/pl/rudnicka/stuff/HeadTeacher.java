package pl.rudnicka.stuff;

public class HeadTeacher extends SchoolEmployees implements Schedule, Vacation {
    double functionalAdditive;


    public HeadTeacher(String name, int accessCardNumber, boolean isPresent, double salary,
                       double functionalAdditive) {
        super(name, accessCardNumber, isPresent, salary);
        this.functionalAdditive=functionalAdditive;
    }
    public double totalSalary () {double totalSalary;
        double salary = getSalary();
        totalSalary = salary+(salary*functionalAdditive);
        return totalSalary;
    }

    @Override
    public void downloadSchedule() {
        System.out.println("Head Teacher's Schedule");
    }

    @Override
    public void applyForVacation(int numberOfVacationDays, String vacationStartDate) {

    }
}
