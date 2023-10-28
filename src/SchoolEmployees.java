public class SchoolEmployees extends Users{
    double salary;
    public SchoolEmployees(String name, int accessCardNumber, boolean isPresent,double salary) {
        super(name, accessCardNumber, isPresent);
        this.salary=salary;}

    public void welcome(){
       System.out.println("Witam! Nazywam się "+name+" jestem pracownikiem tej szkoły :)");
    }
}
