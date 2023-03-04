package practice.week03;

import java.util.Scanner;

public class Q24 {
   // Let's take 2 numbers in the form of dividend and divisor from the user
   // Create a method that performs the division and calculates the division without division symbol using it.

    static Scanner scan = new Scanner(System.in);
     static double dividend ;
     static double divisor ;
     static int quotient ;

    public static int divisionOperation(double dividend,double divisor){
        while (dividend>=divisor){
            dividend-=divisor;
            quotient ++ ;
        }
        return quotient ;
    }

    public static void main(String[] args) {
        System.out.println("Input the dividend number :");
        dividend = scan.nextDouble();
        System.out.println("Input the divisor number :");
        divisor = scan.nextDouble() ;
        System.out.println("Result :"+divisionOperation(dividend,divisor));
    }
}
