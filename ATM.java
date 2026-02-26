//1

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

/*
//2
import java.util.Scanner;


public class ATM {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();


        if (amount <= balance) {
            System.out.println("Transaction Successful"); 
        }else {
            System.out.println("Insufficient Balance");
        }
    }
}


//3
import java.util.Scanner;


public class ATM {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();


        if (amount <= balance) {
            System.out.println("Transaction Successful"); 
        }else {
            System.out.println("Insufficient Balance");
        }
    }
}

*/
