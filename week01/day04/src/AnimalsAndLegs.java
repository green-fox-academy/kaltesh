import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of chickens:");
        int inputChicken = scanner.nextInt();
        System.out.println("Number of Pigs:");
        int inputPigs = scanner.nextInt();
        System.out.println((inputChicken * 2) + (inputPigs * 4));



    }
}