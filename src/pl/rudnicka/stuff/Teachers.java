package pl.rudnicka.stuff;

public class Teachers extends SchoolEmployees implements Schedule{
    public Teachers(String name, int accessCardNumber, boolean isPresent, double salary) {
        super(name, accessCardNumber, isPresent, salary);
    }

    @Override
    public void downloadSchedule() {
        System.out.println("Teachers' Schedule");
    }
}
