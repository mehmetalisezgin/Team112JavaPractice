package Practice01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q02 {


    public static void main(String[] args) {
     /*
   Write aJava program to print the sum of two numbers
   Test Data : 75+25 = 100
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number");
        int firstNumber = scan.nextInt();
        System.out.println("Input the second number");
        int secondNumber = scan.nextInt();
        int sumOfTwoNumbers = firstNumber + secondNumber ;
        System.out.println(sumOfTwoNumbers);
    }

}
