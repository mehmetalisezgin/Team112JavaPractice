package practice.week02;

import java.util.Scanner;

public class Q14 {



    public static void main(String[] args) {
        // Write a Java Program that shows what season you were born in.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the month you born in");
        String month = scan.next();
        String season = null;

       if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") ||
               month.equalsIgnoreCase("August")){
           season = "Summer" ;
       }else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") ||
               month.equalsIgnoreCase("November")){
           season = "Autumn" ;
       }else if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") ||
               month.equalsIgnoreCase("February")){
           season = "Winter" ;
       }else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") ||
               month.equalsIgnoreCase("May")){
           season = "Spring" ;
       }
       else {
           System.out.println("Invalid input...");
       }
        System.out.println("You were born in :"+season);
    }
}
