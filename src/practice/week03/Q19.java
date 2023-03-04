package practice.week03;


import java.awt.*;
import java.util.Scanner;

public class Q19 {
 /*
    Write a Java ATM program
    ask the user to do following operations
    1- Balance learning (default balance is 5000 euro)
    2- Deposit
    3- Withdraw
    4- Exit

   The user should do this operations, the program will be simple not OOP
     */

    static Scanner scan = new Scanner(System.in);
    static double balance = 2500;
    static double deposit;
    static int withdraw;
    static int numberOfTransaction;

    public static void welcomeToBank() {
        System.out.println("***** WELCOME TO THE BANK OF SLOVENIA ***** ");
        System.out.println("Please Select Your Transaction");
        System.out.println("1-Balance\n2-Deposit\n3-Withdraw\n4-Exit");
        numberOfTransaction = scan.nextInt();
        if (numberOfTransaction >= 5 || numberOfTransaction < 1) {
            System.out.println("Wrong Input...");
            welcomeToBank();
        }
    }

    public static void balanceLearning() {
        System.out.println("Your Balance Is :" + balance);

    }

    public static void depositAmount() {
        System.out.println("Please enter your deposit amount");
        deposit = scan.nextDouble();
        balance += deposit;
        System.out.println("Your New Balance Is :" + balance);

    }

    public static void withdrawAmount() {
        System.out.println("Please enter your withdraw amount");
        withdraw = scan.nextInt();
        balance -= withdraw;
        System.out.println("Your Balance Is :" + balance);

    }

    public static void exit(){
        System.out.println("Thank you for choosing us");
    }


    public static void transaction(){
        welcomeToBank();
        switch (numberOfTransaction){
            case 1 : balanceLearning(); break;
            case 2 : depositAmount(); break;
            case 3 : withdrawAmount(); break;
            case 4 : exit();
        }
    }
    public static void main(String[] args) {

        transaction() ;


    }




}
