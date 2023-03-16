package practice.week04;

import java.util.Scanner;

public class Q32 {

     /*
     Create a Java program that displays even values of array.
     */

    static int count = 0 ;
    static int size;
    static Scanner scan = new Scanner(System.in);

    public static int[] createArray() {
        System.out.println("Please input the size of Array...");
        size = scan.nextInt();
        // create an array to hold integers
        int[] arrayList = new int[size];
        // create an array
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + ". Data");
            arrayList[i] = scan.nextInt();
        }
        return arrayList ;
    }

    public static void evenValuesFromArray(int[] arr,int size) {
        System.out.println("The Even Numbers :");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("The number of even elements :"+count);
    }

    public static void main(String[] args) {
       int[] arr1 = {10,15,25,32,16} ;
       int[] arr2 = {10,88,25,32,16} ;
       int[] arr3 = {10,20,26,-65,-16} ;
       int[] arr4 = {-10,15,25,60,16} ;
       int[] arr5 = {10,44,25,32,16} ;

        evenValuesFromArray(createArray(),5) ;
        evenValuesFromArray(arr1,5) ;
        evenValuesFromArray(arr2,5) ;
        evenValuesFromArray(arr3,5) ;
        evenValuesFromArray(arr4,5) ;
        evenValuesFromArray(arr5,5) ;
    }

}
