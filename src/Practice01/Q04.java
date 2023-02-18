package Practice01;


import java.util.Scanner;

public class Q04 {


    public static void main(String[] args) {
         /*
     Write a Java program to divide two numbers and print on the screen
     Test Data: 50/3
     Expected Output : 16.6

      */

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number");
        double firstNumber = scan.nextInt();
        System.out.println("Input the second number");
        double secondNumber = scan.nextInt();
        double dividingOfTwoNumbers = firstNumber / secondNumber ;
        System.out.println("The Result is : "+dividingOfTwoNumbers);
    }
}
