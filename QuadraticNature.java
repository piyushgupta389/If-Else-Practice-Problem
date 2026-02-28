//1

import java.util.Scanner;

public class QuadraticNature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            System.out.println("Two Real and Distinct Roots");
        } else if (d == 0) {
            System.out.println("Two Real and Equal Roots");
        } else {
            System.out.println("Complex Roots");
        }
    }
}

/*
//2
import java.util.Scanner;


public class QuadraticNature


    public static void main(
        Scanner sc = new Sca


        System.out.print("En
        double a = sc.nextDo
        System.out.print("En
        double b = sc.nextDo
        System.out.print("En
        double c = sc.nextDo


        double d = b * b - 4


        if (d > 0) {
            System.out.print
        }else if (d == 0) {
            System.out.print
        }else {
            System.out.print
        }
    }
}


//3
import java.util.Scanner;


public class QuadraticNature


    public static void main(
        Scanner sc = new Sca


        System.out.print("En
        double a = sc.nextDo
        System.out.print("En
        double b = sc.nextDo
        System.out.print("En
        double c = sc.nextDo


        double d = b * b - 4


        if (d > 0) {
            System.out.print
        }else if (d == 0) {
            System.out.print
        }else {
            System.out.print
        }
    }
}

*/
