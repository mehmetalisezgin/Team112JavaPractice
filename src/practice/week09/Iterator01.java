package practice.week09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

/*
Question:
* Write a Java program that uses an iterator to delete elements in a list that
are not in the desired number range.
* The program should operate on the current list without creating a second list.
* The program should take a list of integers as input and a desired range of integers
(inclusive) as two integer values.
* The program should then print the modified list after removing all elements that are not in the desired range.
 */


    public static void main(String[] args) {
        // Difference between List and Array, Array and map, explain map why we are using it

        // Create the list of integers
        List<Integer> numbers = new ArrayList<>() ;
        numbers.add(2) ;
        numbers.add(13) ;
        numbers.add(56) ;
        numbers.add(23) ;
        numbers.add(45) ;
        numbers.add(14) ;
        numbers.add(40) ;
        numbers.add(54) ;

        // Define the desired number range
        int lowerBound = 20 ;
        int upperBound = 40 ;

        // use iterator to remove elements outside the desired range

        Iterator<Integer> iterator = numbers.iterator() ;
        while (iterator.hasNext()){
          // hasNext() method checks if there is a next element there(true/false)
          // next() method returns next element in the data
         int number = iterator.next() ;
         if(number<lowerBound || number>upperBound){
             iterator.remove();
         }
        }
        System.out.println(numbers);
    }




}
