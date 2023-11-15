package pl.rudnicka;

import pl.rudnicka.pupils.Pupils;
import pl.rudnicka.stuff.AdministrationStaff;
import pl.rudnicka.stuff.HeadTeacher;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        AdministrationStaff administrationStaff = new AdministrationStaff("Beata Kowalska", 6789,
                false, 3500);

        HeadTeacher headTeacher = new HeadTeacher("Ewa Kowalska", 1001, true,
                6500, 0.2);

        Pupils pupils = new Pupils("Igor", 1092, true, 45, 10);
        Pupils pupils1 = new Pupils("Iza", 4592, false, 51, 10);

        administrationStaff.description();
        administrationStaff.welcome();
        administrationStaff.applyForVacation(5, "10-12-2023");
        headTeacher.description();
        headTeacher.welcome();
        pupils.description();
        pupils.pupilWelcome();
        pupils1.pupilWelcome();
        headTeacher.downloadSchedule();

        System.out.println(headTeacher.totalSalary());
        System.out.println(pupils1.getName()+": średnia ocen = "+ pupils1.averageGradeCalculation());
        System.out.println(pupils.getName()+": średnia ocen = "+ pupils.averageGradeCalculation());
    }

}