import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;

public class day04 {
    public static void main(String[] args) {
        System.out.println("here goes nothing");

//        System.out.println(13+22);
//        System.out.println(22-13);
//        System.out.println(22/13);
//        System.out.println(22%13);
//        int a = 3;
//        a = (22/7);
//        System.out.println(a);

//  coding hours
//        int dailyHours = 6;
//        int workDays = 5;
//        int semester = 17;
//        int allTheHours;
//        allTheHours = (semester * workDays * dailyHours);
//        System.out.println("hours spent coding: " + allTheHours);
//        int averageHours = 52;
//        float weeklyCode;
//        weeklyCode = (workDays * dailyHours);
//        System.out.println("percentage is: " + (weeklyCode / averageHours) * 100 + "%");



// ** swap

//        int a = 123;
//        int b = 526;

//        System.out.println(a);
//        System.out.println(b);

// **  bmi
//        double massInKg = 81.2;
//        double heightInM = 1.78;
//        double BMI = (massInKg / (heightInM * heightInM));
//        System.out.println("The BMI is: " + BMI);

//        int b = 100;
//        b =  (b-7);
//         make b smaller by 7
//
//        System.out.println(b);
//
//        int c = 44;
//        c = (c * 2);
//         please double c's value
//
//        System.out.println(c);
//
//        int d = 125;
//        d = (d / 5);
//         please divide by 5 d's value
//
//        System.out.println(d);
//
//        int e = 8;
//        e = (e * e);
//         please cube of e's value
//
//        System.out.println(e);
//
//        int f1 = 123;
//        int f2 = 345;
//        if (f1 > f2) {
//            System.out.println("yes f is");
//        } else {
//            System.out.println("no f isn't");}
//        boolean f = (f1 > f2);
//        System.out.println(f);
//
//         tell if f1 is bigger than f2 (print as a boolean)
//
//        int g1 = 350;
//        int g2 = 200;
//        if ( (2 * g2) > g1) {
//            System.out.println("yes g");
//        } else {
//            System.out.println("no g");
//        }
//        boolean g = ((g2 * 2) > g1);
//        System.out.println(g);
//         tell if the double of g2 is bigger than g1 (print as a boolean)
//
//        int h = 135798745;
//        if (h % 11 == 0) {
//            System.out.println("dividable it is");
//        } else {
//            System.out.println("it ain't");
//        }
//        boolean h1 = (h % 11 == 0);
//        System.out.println(h1);
//         tell if it has 11 as a divisor (print as a boolean)

//        int i1 = 10;
//        int i2 = 3;
//         tell if i1 is higher

//       Write a program that stores 3 sides of a cuboid as variables (doubles)
//       The program should write the surface area and volume of the cuboid like:
//
//      Surface Area: 600
//      Volume: 1000

//         double a;
//         double b;
//         double c;
//         double surfacaArea = 600;
//         double volume = 1000;
//
//         600 = (2 * (a * b) + 2 * (b * c) + 2 * ( c * a));
//         1000 = (a * b * c);
//        System.out.println("one side would be" + (a * b);





//        int currentHours = 14;
//        int currentMinutes = 34;
//        int currentSeconds = 42;
//        int allSeconds = (24 * 60 * 60);
//        int secondsPassed = ((currentHours * 60 * 60 ) + (currentMinutes * 60) + currentSeconds);
//        int secondsLeft = (allSeconds - secondsPassed);
//        System.out.println(secondsLeft + " Seconds left from the day");

                // Write a program that prints the remaining seconds (as an integer) from a
                // day if the current time is represented by the variables









//        public class UserInput {
//            public static void main(String[] args) {
//                 Creates a scanner
//                Scanner scanner = new Scanner(System.in);
//
//                 The program stops and waits for user input and to press enter
//                String userInput1 = scanner.nextLine();
//
//                 It prints the whole line that was given by the user
//                System.out.println(userInput1);
//
//                 The program stops and waits for user input that is an integer and to press enter
//                int userInput2 = scanner.nextInt();
//
//                 It prints the integer
//                System.out.println(userInput2);
//      scannerUser
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("type plez:");
//        String userInput1 = scanner.nextLine();
//        System.out.println("hi my name is: " + userInput1);


//      scannerMile
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("value in km plez:");
//        double userInputKM = scanner.nextDouble();
//        System.out.println((userInputKM * 1.61) + " Is your distance in mile");



//      doubleScanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Number of chickens:");
//        int inputChicken = scanner.nextInt();
//        System.out.println("Number of Pigs:");
//        int inputPigs = scanner.nextInt();
//        System.out.println((inputChicken * 2) + (inputPigs * 4));


//      pentaScanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("name your numbers: ");
//        int input01 = scanner.nextInt();
//        int input02 = scanner.nextInt();
//        int input03 = scanner.nextInt();
//        int input04 = scanner.nextInt();
//        int input05 = scanner.nextInt();
//        System.out.println("the sum is: " + (input01 + input02 + input03 + input04 + input05));
//        System.out.println("the avg is: " + (input01 + input02 + input03 + input04 + input05) / 5);


//      evenOdd
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("your number plez");
//        int inputNumber = scanner.nextInt();
//        if (inputNumber % 2 == 0) {
//            System.out.println("even man");
//        } else {
//            System.out.println("odd man");
//        }
//        System.out.println();


//        oneTwoALot
// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter number plez:");
//        int inputNumber = scanner.nextInt();
//        if (inputNumber <= 0) {
//            System.out.println("Not enough");
//        } else if (inputNumber == 1) {
//            System.out.println("One");
//        } else if (inputNumber == 2) {
//            System.out.println("Two");
//        } else {
//            System.out.println("A lot");
//        }

//      printBigger
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("numbers plez:");
//        int input01 = scanner.nextInt();
//        int input02 = scanner.nextInt();
//        if (input01 > input02) {
//            System.out.println("bigger number is: " + input01);
//        } else {
//            System.out.println("bigger number is: " + input02);
//        }





//        double a = 24;
//        int out = 0;
//         if a is even increment out by one
//        if (a % 2 == 0) {
//            out++;
//        }
//
//        System.out.println(out);




//        int b = 23;
//        String out2 = "";
//         if b is between 10 and 20 set out2 to "Sweet!"
//         if less than 10 set out2 to "Less!",
//         if more than 20 set out2 to "More!"
//        if ( 10 < b && b < 20 ) {
//            out2 = "sweet";
//        } else if (b < 10) {
//            out2 = "Less!";
//        } else {
//            out2 = "More!";
//        }
//
//        System.out.println(out2);



        int c = 123;
        int credits = 40;
        boolean isBonus = true;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same
        if (credits >= 50 && isBonus == false) {
            c = c + 2;
        } else if (credits < 50 && isBonus == false) {
            c = c - 1;
        } else if (isBonus) {
            c = c;
        }

        System.out.println(c);




        int d = 8;
        int time = 120;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"
        if (d % 4 == 0 && time <= 200) {
            out3 = "check";
        } else if (time > 200) {
            out3 = "Time out";
        } else {
            out3 = "Run Forest Run!";
        }


        System.out.println(out3);







    }
}
