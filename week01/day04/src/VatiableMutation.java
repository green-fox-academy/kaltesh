import java.sql.SQLOutput;
import java.util.SortedMap;
import java.util.Scanner;


public class VatiableMutation {
    public static void main(String[] args) {


        int b = 100;
        b = (b - 7);
//        make b smaller by 7

        System.out.println(b);

        int c = 44;
        c = (c * 2);
//        please double c 's value

        System.out.println(c);

        int d = 125;
        d = (d / 5);
//        please divide by 5 d 's value

        System.out.println(d);

        int e = 8;
        e = (e * e);
//        please cube of e 's value

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        if (f1 > f2) {
            System.out.println("yes f is");
        } else {
            System.out.println("no f isn't");
        }
        boolean f = (f1 > f2);
        System.out.println(f);

//        tell if f1 is bigger than f2(print as a boolean)

        int g1 = 350;
        int g2 = 200;
        if ((2 * g2) > g1) {
            System.out.println("yes g");
        } else {
            System.out.println("no g");
        }
        boolean g = ((g2 * 2) > g1);
        System.out.println(g);
//        tell if the double of g2 is bigger than g1(print as a boolean)

        int h = 135798745;
        if (h % 11 == 0) {
            System.out.println("dividable it is");
        } else {
            System.out.println("it ain't");
        }
        boolean h1 = (h % 11 == 0);
        System.out.println(h1);
//        tell if it has 11 as a divisor(print as a boolean);
    }
}