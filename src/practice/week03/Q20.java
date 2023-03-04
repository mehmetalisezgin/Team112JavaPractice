package practice.week03;

import java.util.Scanner;



public class Q20 {

     // Is Space Exist
     static Scanner scan = new Scanner(System.in);
     static boolean isExist ;
     static String text;

     public static void isSpaceExist(){
         System.out.println("Please input yourr text...");
         text = scan.nextLine() ;

         isExist=text.contains(" ") ;

         if (isExist==true){
             System.out.println("There is a space in the inputted text");

         }else{
             System.out.println("There is no space in the inputted text");

         }
     }

    public static void main(String[] args) {
        isSpaceExist();
    }

}
