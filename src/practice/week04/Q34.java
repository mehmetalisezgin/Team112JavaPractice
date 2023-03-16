package practice.week04;

import java.util.Scanner;

public class Q34 {
    /**
     * This program find the largest length of  value
     * in a String array
     */

    static int size ;
    static Scanner scan = new Scanner(System.in) ;
    static int max ; // hold index number of the largest value

    // finding largest value
    public static void largestLenghtofStringValue(){

        System.out.println("Please input the size of Array...");
        size = scan.nextInt();
        // create an array to hold integers
        String[] arrayList = new String[size];
        // create an array
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + ". Data");
            arrayList[i] = scan.next();

        }
        for(int i =0 ; i<arrayList.length ; i++){
            if(arrayList[i].length() > arrayList[max].length()){
                max = i ;
            }
        }
        System.out.println("Largest length of value is :"+arrayList[max]);
    }

    public static void main(String[] args) {
        largestLenghtofStringValue() ;

    }
}
