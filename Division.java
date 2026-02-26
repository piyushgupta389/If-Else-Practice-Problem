//1

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        double per = sc.nextDouble();

        if (per >= 60) {
            System.out.println("First Division");
        } else if (per >= 50) {
            System.out.println("Second Division");
        } else if (per >= 40) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }
    }
}

/*
//2
import java.util.Scanner;


public class Division {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        double per = sc.nextDouble();


        if (per >= 60) {
            System.out.println("First Division"); 
        }else if (per >= 50) {
            System.out.println("Second Division"); 
        }else if (per >= 40) {
            System.out.println("Third Division"); 
        }else {
            System.out.println("Fail");
        }
    }
}

//3
import java.util.Scanner;


public class Division {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        double per = sc.nextDouble();


        if (per >= 60) {
            System.out.println("First Division"); 
        }else if (per >= 50) {
            System.out.println("Second Division"); 
        }else if (per >= 40) {
            System.out.println("Third Division"); 
        }else {
            System.out.println("Fail");
        }
    }
}

*/
