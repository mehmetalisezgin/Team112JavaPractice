package practice.week01;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
         /*
    Write a Java program that takes three numbers as input
    calculate and print the average of the numbers
    Test Data : 1st: 10 ,2nd:20, 3rd:30
    Output :(1st+2nd+3rd) / 3
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the first number");
        int firstNumber = scan.nextInt();

        System.out.println("Input the second number");
        int secondNumber = scan.nextInt();

        System.out.println("Input the third number");
        int thirdNumber = scan.nextInt();

        int averageNumber ;

        averageNumber = (firstNumber+secondNumber+thirdNumber)/3 ;
        System.out.println("The Average of thre numbers :"+averageNumber);

    }

}
