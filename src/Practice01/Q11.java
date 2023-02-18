package Practice01;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        /*
        Write a Java program that print the month when `a number between 1 and 12
        is entered
        Test Data : input: 2
        Output : February
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number between 1 to 12");
        int number = scan.nextInt();

        if (number==1){
            System.out.println("it is  January");
        } else if (number==2) {
            System.out.println("it is February");
        }else if (number==3) {
            System.out.println("it is March");
        }else if (number==4) {
            System.out.println("it is April");
        }else if (number==5) {
            System.out.println("it is May");
        }else if (number==6) {
            System.out.println("it is June");
        }else if (number==7) {
            System.out.println("it is July");
        }else if (number==8) {
            System.out.println("it is August");
        }else if (number==9) {
            System.out.println("it is September");
        }else if (number==10) {
            System.out.println("it is October");
        }else if (number==11) {
            System.out.println("it is November");
        }else if (number==12) {
            System.out.println("it is December");
        }else  {
            System.out.println("invalid month");
        }


    }





}
