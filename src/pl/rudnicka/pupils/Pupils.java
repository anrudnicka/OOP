package pl.rudnicka.pupils;


import pl.rudnicka.Users;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pupils extends Users {

   public int sumOfGrades;
   public int quantityOfSubjects;
    public Pupils(String name, int accessCardNumber, boolean isPresent, int sumOfGrades, int quantityOfSubjects) {
        super(name, accessCardNumber, isPresent);
        this.sumOfGrades = sumOfGrades;
        this.quantityOfSubjects=quantityOfSubjects;
    }

    public void pupilWelcome(){
        String name = getName();
        System.out.println("Witam! Nazywam się "+name+" jestem uczniem tej szkoły :)");
    }

    public BigDecimal averageGradeCalculation () {
        int sumOfGrades=this.sumOfGrades;
        int quantityOfSubjects=this.quantityOfSubjects;
        double averageGrade = (double) sumOfGrades / quantityOfSubjects;
        BigDecimal averageGradeRounded = new BigDecimal(averageGrade).setScale(2, RoundingMode.HALF_UP);
        return averageGradeRounded;
        }
}
