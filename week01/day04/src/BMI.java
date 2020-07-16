import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;



public class BMI {
    public static void main(String[] args) {

        double massInKg = 81.2;
       double heightInM = 1.78;
        double BMI = (massInKg / (heightInM * heightInM));
        System.out.println("The BMI is: " + BMI);

    }
}