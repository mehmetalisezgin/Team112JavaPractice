package practice.week01;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
        /*
        Write a program tp print the sum, multiply, subtract,divide and remainder of two numbers
        Test Data: firstNumber = 125,secondNumber = 24
        Expected Output:
        125+24=149
        125-24=101
        125x24=
        125/24=5
        125/24 remainder is 5
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the first number");
        int firstNumber = scan.nextInt();

        System.out.println("Input the second number");
        int secondNumber = scan.nextInt();

        int sumOfTwoNumbers,SubtractTwoNumbers,dividingTwoNumbers,multiplyingTwoNumbers,remainderOfTwoNumbers ;


        sumOfTwoNumbers = firstNumber + secondNumber ;
        System.out.println("The sum Of Two Numbers is : "+sumOfTwoNumbers);

        SubtractTwoNumbers = firstNumber-secondNumber ;
        System.out.println("The subtrcat Of Two Numbers is : "+SubtractTwoNumbers);

        dividingTwoNumbers=firstNumber/secondNumber ;
        System.out.println("The Dividing Of Two Numbers is : "+dividingTwoNumbers);

        multiplyingTwoNumbers = firstNumber*secondNumber ;
        System.out.println("The Multiplying Of Two Numbers is : "+multiplyingTwoNumbers);

        remainderOfTwoNumbers=firstNumber%secondNumber;
        System.out.println("The Remainder Of Two Numbers is : "+remainderOfTwoNumbers);

    }
}
