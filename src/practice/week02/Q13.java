package practice.week02;

import java.util.Scanner;

public class Q13 {



    public static void main(String[] args) {
        /*
     -- Your are working in sales and have to calculate commision for the employees;
     -- You need to ask user a sales amount, and based on the amount, you need to
     define their commission.
     -- If user sold products for more than 10$ but less than 100$  ==> commission is 10%
     -- If user sold products for more than 100$ but less than 200$ ==> commission is 20%
     -- If user sold products for more than 200$ but less than 500$ ==> commission is 30%
     -- If user sold products for more than 500$ ==> commission is 50%
     Your program should print How much in commission user will get...
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the sales amount as $");
        int salesAmount = scan.nextInt();

        if (salesAmount > 10 && salesAmount <= 100) {
            System.out.println("Commission :" +salesAmount * 0.1+ "$");
        } else if (salesAmount > 100 && salesAmount <= 200) {
            System.out.println("Commission :" + salesAmount * 0.2+ "$");
        }  else if (salesAmount > 200 && salesAmount <= 500) {
            System.out.println("Commission :" + salesAmount * 0.3+ "$");
        }   else if (salesAmount > 500) {
            System.out.println("Commission :" + salesAmount * 0.5+ "$");
        } else {
            System.out.println("Please input correct amount...");
        }

    }
}
