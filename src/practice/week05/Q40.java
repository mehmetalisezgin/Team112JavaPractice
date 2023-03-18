package practice.week05;

import java.util.ArrayList;
import java.util.Arrays;

public class Q40 {

    // Convert an array to ArrayList
    public static void main(String[] args) {
        String [] my_array = new String[]{"python","java","selenium","API","Cucumber"} ;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(my_array)) ;
        System.out.println(list);


    }
}
