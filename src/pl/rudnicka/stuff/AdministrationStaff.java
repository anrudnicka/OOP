package pl.rudnicka.stuff;

public class AdministrationStaff extends SchoolEmployees implements Vacation {
      public AdministrationStaff(String name, int accessCardNumber, boolean isPresent, double salary) {
        super(name, accessCardNumber, isPresent, salary);
    }

    @Override
    public void applyForVacation(int numberOfVacationDays, String vacationStartDate) {
        System.out.println("Zgłoszenie urlopu przez pracownika: "+getName() +": "+numberOfVacationDays+" dni urlopu, od dnia: "+vacationStartDate);

    }
}
