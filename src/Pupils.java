public class Pupils extends Users{
    double averageGrade;
    public Pupils(String name, int accessCardNumber, boolean isPresent, double averageGrade) {
        super(name, accessCardNumber, isPresent);
    }
    public void pupilWelcome(){
        System.out.println("Witam! Nazywam się "+name+" jestem uczniem tej szkoły :)");
    }
}
