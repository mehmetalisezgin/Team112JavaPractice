package practice.week05;

import java.util.ArrayList;
import java.util.Arrays;

public class Q41 {

    // Convert ArrayList to Array
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>() ;
        ArrayList<Integer> list1 = new ArrayList<>() ;
        ArrayList<Object> list2 = new ArrayList<>() ; // you can add any data type like int,string,double..
        Object[] arr= new Object[]{5,"mehmet",2.2, true,"Elcin"};


       list.add("mehmet");
       list.add("python");
       list.add("java");
       list.add("c#");
       String[] stringArray = new String[list.size()] ;
       list.toArray(stringArray) ;// converted from list to array
        System.out.println(Arrays.toString(stringArray));
    }
}
