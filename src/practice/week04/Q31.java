package practice.week04;

import java.util.Scanner;

public class Q31 {
   /*
   Create a java program that shows values being read into an array's
   elements and then displayed its sum
   */

    static int size;
    static int sum;

    static Scanner scan = new Scanner(System.in);

    public static void arraySummationMethod() {
        System.out.println("Please input the size of Array...");
        size = scan.nextInt() ;
        // create an array to hold integers
        int [] arrayList = new int[size];
        // create an array
        for (int i=0 ; i<size ; i++){
            System.out.println(i+1+". Data");
            arrayList[i] = scan.nextInt() ;
        }
        // calculate the sum of data
        for (int i = 0 ; i<size; i++){
            sum += arrayList[i] ;
        }
        System.out.println("The sum of array :"+sum);
    }

    public static void main(String[] args) {
            arraySummationMethod() ;

    }
}
