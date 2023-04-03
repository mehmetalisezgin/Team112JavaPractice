package practice.week7;

import java.util.Scanner;

public class Runner {

    /*
    Write a Java program to calculate the area and perimeter
    of various geometric shapes (Square, Rectangle, and Triangle)
    by implementing an interface named "Operations".

    The program should provide the option to select the shape for which the
    user wants to perform calculations.

   The solution provided demonstrates the use of an interface Operations
   with methods area() and perimeter() to calculate the area and perimeter
   of various shapes.

   The classes Square, Rectangle, and Triangle implement
   the Operations interface and provide their respective implementations
   for calculating the area and perimeter.

   The Runner class contains the main method that allows the user to select the desired shape and perform
   the area and perimeter calculations.
     */


   static Scanner scan = new Scanner(System.in);
   static int select ;

    public static void main(String[] args) {
        System.out.println("Please Select the Geometric shape you want to calculate:\n" +
                "1. Square\n" +
                "2. Rectangle\n" +
                "3. Triangle");

        select = scan.nextInt();
        if (select==1){
            Square square = new Square();
            square.area();
            square.perimeter();
        }else if(select==2){
            Rectangle rectangle = new Rectangle();
            rectangle.area();
            rectangle.perimeter();
        }else if(select==3){
            Triangle triangle = new Triangle();
            triangle.area();
            triangle.perimeter();
        }else {
            System.out.println("Please Select from 1 to 3");
        }


    }


}
