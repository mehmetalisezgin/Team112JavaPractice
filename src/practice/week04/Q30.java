package practice.week04;

import java.util.Scanner;

public class Q30 {
     /*
 * Create a Java Program that shows values being read into an array's
   elements and then displayed.
 */

    static int size ;
    static Scanner scan = new Scanner(System.in) ;

    public static void printArrayMethod(){
        System.out.println("Please input the size of Array...");
        size = scan.nextInt() ;
        int[] age = new int[size] ;
        System.out.println("Input ther ages: ");
        // Create an array from the user
        for (int i = 0 ; i <size ; i++){
            System.out.println(i+1+". Data");
            age[i] =scan.nextInt();
        }
        System.out.println("Inputted Ages :");
        // print array
        for (int i = 0 ; i<size ; i++){
            System.out.print(age[i]+" ");
        }

    }

    public static void main(String[] args) {
        printArrayMethod() ;
    }

}
