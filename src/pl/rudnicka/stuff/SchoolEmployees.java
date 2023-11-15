package pl.rudnicka.stuff;

import pl.rudnicka.Users;

public abstract class SchoolEmployees extends Users {

   private double salary;

  public SchoolEmployees(String name, int accessCardNumber, boolean isPresent, double salary) {
        super(name, accessCardNumber, isPresent);
        this.salary = salary;
    }

    @Override
    public void welcome() {
        String name = getName();
        System.out.println("Witam! Nazywam się " + name + " jestem pracownikiem tej szkoły.");
    }

    public double getSalary() {
      return salary;
    }

    public void setSalary(double salary) {
      this.salary = salary;
    }




}
