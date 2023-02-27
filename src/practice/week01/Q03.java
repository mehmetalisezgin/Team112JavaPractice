package practice.week01;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

     /*
     Write a Java program to divide two numbers and print on the screen
     Test Data: 50/3
     Expected Output : 16

      */

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number");
        int firstNumber = scan.nextInt();
        System.out.println("Input the second number");
        int secondNumber = scan.nextInt();
        int dividingOfTwoNumbers = firstNumber / secondNumber ;
        System.out.println("The Result is : "+dividingOfTwoNumbers);


    }
}
