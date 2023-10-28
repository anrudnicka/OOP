
public class Main {
    public static void main(String[] args) {

        Users users=new Users("Beata Kowalska", 3457, true);
        SchoolEmployees schoolEmployees=new SchoolEmployees("Beata Kowalska",6789,false, 3500);
        AdministrationStaff administrationStaff=new AdministrationStaff("Beata Kowalska",6789,
            false, 3500);
        HeadTeacher headTeacher=new HeadTeacher("Ewa Kowalska", 1001,true,
            6500);

        Pupils pupils=new Pupils("Igor", 1092,true, 4.5);
        Pupils pupils1=new Pupils("Iza", 4592,false, 4.2);
        administrationStaff.description();
        administrationStaff.welcome();
        headTeacher.description();
        headTeacher.welcome();
        pupils.description();
        pupils.pupilWelcome();
        pupils1.description();
        pupils1.pupilWelcome();

        System.out.println(headTeacher.totalSalary());
    }

}