package practice.week01;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        /*
        Write a Java program to compare two numbers.
        firstNumber = 15 ,secondNumber = 20 ;
        possible ways:
        1st = 2nd
        1st<2nd
        2nd<1st
        1st<=2nd
        2n<=1st
        1st != 2nd
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number");
        int firstNumber = scan.nextInt();

        System.out.println("Input the second number");
        int secondNumber = scan.nextInt();

        if (firstNumber == secondNumber){
            System.out.println(firstNumber +" = " +secondNumber+"\n");
        }if (firstNumber < secondNumber){
            System.out.println(firstNumber +" < " +secondNumber+"\n");
        }if (firstNumber > secondNumber){
            System.out.println(firstNumber +" > " +secondNumber+"\n");
        }if (firstNumber <= secondNumber){
            System.out.println(firstNumber +" <= " +secondNumber+"\n");
        }if (firstNumber >= secondNumber){
            System.out.println(firstNumber +" >= " +secondNumber+"\n");
        }if (firstNumber != secondNumber){
            System.out.println(firstNumber +" != " +secondNumber+"\n");
        }



    }



}
