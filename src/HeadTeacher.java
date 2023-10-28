public class HeadTeacher extends SchoolEmployees{
    double functionalAdditive;

    public HeadTeacher(String name, int accessCardNumber, boolean isPresent, double salary
                       /*double functionalAdditive*/) {
        super(name, accessCardNumber, isPresent, salary);
    }
    public double totalSalary () {double totalSalary;
        totalSalary = salary*1.2;
        return totalSalary;
    }
}
