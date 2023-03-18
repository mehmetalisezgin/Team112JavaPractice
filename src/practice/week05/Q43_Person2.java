package practice.week05;

import java.util.ArrayList;
import java.util.List;

public class Q43_Person2 {

    public static void createPersonList(int age, int idNo, String bloodType, boolean isAlive) {
        // We create a list to put all data
        // we defined Q42_Person class as a data type to use all variables from Q42_Person class
        List<Q42_Person> personList = new ArrayList<>() ;
        // to assign value we create object from the Q42_Person class
        Q42_Person person = new Q42_Person(age,idNo,bloodType,isAlive) ;
        // we implemented person object in the personList
        personList.add(person) ;
        // to see list we can use for loop
        for (int i=0; i<personList.size() ; i ++){
            System.out.println(personList.get(i));
        }
    }

    public static void main(String[] args) {
        createPersonList(21,321456,"AB+",true)  ;
    }
}
