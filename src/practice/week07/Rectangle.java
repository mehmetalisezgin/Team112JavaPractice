package practice.week07;

import java.util.Scanner;

public class Rectangle implements Operations {

    //Let create two methods for the calculation are and perimeter of a rectangle

   static Scanner scan = new Scanner(System.in);
    // if we create static method we can not use without static key
    // But if we use without static key method we do not need to use static key


   // this method just to get input from the user
    public static Double width(){
        System.out.println("Input the width of the rectangle");
        double width = scan.nextDouble();
       if (width<=0){
           System.out.println("Please Input Positive Numbers");

       }
       return width ;// we created static Double method then the method should return Double value
        // we got this double value from the user and we returned it.
    }

    public static Double length(){
        System.out.println("Input the length of the rectangle");
        double length = scan.nextInt();
        if (length<=0){
            System.out.println("Please Input Positive Numbers");

        }
        return length ;// we created static Double method then the method should return Double value
        // we got this double value from the user and we returned it.
    }

     double area = width() * length() ;
    // width() method return us width value from the user
    // length() method return us length value from the user
    double perimeter = 2*(width() + length()) ;

    public void area() {

        System.out.println("The Area of the rectangle :"+ area);
    }

    public void perimeter() {

        System.out.println("The Perimeter of the rectangle :"+ perimeter);
    }



}
