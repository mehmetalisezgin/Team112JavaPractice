package practice.week04;

import java.util.ArrayList;
import java.util.List;

public class Q35 {

    public static void commonEelement(){
        String[] data1 = {"java","sql","maven","database","api","postman"} ;
        String[] data2 = {"sql","maven","database1","soupapi","python","java"} ;
        List<String> commonElements = new ArrayList<>();

        for (int i =0 ; i <data1.length ; i ++){
            for (int j = 0 ; j<data2.length ; j++ ){
                if (data1[i].equals(data2[j])){
                    commonElements.add(data1[i]) ;
                }
            }
        }
        System.out.println("Common Elemens :"+ commonElements);

    }

    public static void main(String[] args) {
        commonEelement() ;
    }

}
