package practice.week09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterator02 {

    /*
Write a Java program to iterate through a map and print the
key-value pairs in reverse order (i.e., starting from the
last entry and ending at the first entry).
 */

    public static void main(String[] args) {
        // Create the map with some key value pair
        Map<String, Integer> fruit = new HashMap<>() ;
        fruit.put("Apple", 3);
        fruit.put("Banana", 5);
        fruit.put("Cherry", 2);
        fruit.put("Orange", 7);

        // use iterator to print the key-value pairs in reverse order

        Iterator<Map.Entry<String,Integer>> iterator = fruit.entrySet().iterator() ;
        Map.Entry<String,Integer> entry;
        while (iterator.hasNext()){
            entry = iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }







    }



}
