package practice.week01;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        /*
       Write a java program that displays what day it is when a number is entered.
       Test Data : day = 8
       Expected Output : Monday
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number");
        int day = scan.nextInt();

        if (day%7==1){
            System.out.println("Today is Monday");
        } else if (day%7==2) {
            System.out.println("Today is Tuesday");
        }else if (day%7==3) {
            System.out.println("Today is Wednesday");
        }else if (day%7==4) {
            System.out.println("Today is Thursday");
        }else if (day%7==5) {
            System.out.println("Today is Friday");
        }else if (day%7==6) {
            System.out.println("Today is Saturday");
        }else if (day%7==0) {
            System.out.println("Today is Sunday");
        }

        //
    }

}
