package practice.week05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q38 {

    // Reverse an array of integer values

    public static void main(String[] args) {
        int[] my_array1 = {17,20,21,54,30};
        System.out.println("Original Array : "+ Arrays.toString(my_array1));
        for (int i = 0 ; i<my_array1.length/2 ; i++){
            int box = my_array1[i];
            my_array1[i] = my_array1[my_array1.length-i-1] ;
            my_array1[my_array1.length-i-1] = box ;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array1));
    }
}













