package practice.week01;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
     /*
      Task01 :
      Write a Java Program to print "Hello" on screen and then print your name on a separate line
      Expected Output :
      Hello
      Mehmet Ali
      */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Input your firs name: ");
        String firstNane = scan.next() ;
        System.out.println("Please Input your last name");
        String lastName = scan.next();
        System.out.println("Hello \n" +firstNane+" "+ lastName);

    }






}
