package practice.week04;

import java.util.Scanner;

public class Q33 {

    /**
     * This program find the largest value
     * in an array
     */

    static int size ;
    static Scanner scan = new Scanner(System.in) ;
    static int max = 0; // hold index number of the largest value

    // finding largest value
    public static void largestValue(){

        System.out.println("Please input the size of Array...");
        size = scan.nextInt();
        // create an array to hold integers
        int[] arrayList = new int[size];
        // create an array
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + ". Data");
            arrayList[i] = scan.nextInt();

        }
        for(int i =0 ; i<arrayList.length ; i++){
            if(arrayList[i] > arrayList[max]){
                max = i ;
            }
        }
        System.out.println("Largest value is :"+arrayList[max]);
    }

    public static void main(String[] args) {
        largestValue() ;
    }

}
