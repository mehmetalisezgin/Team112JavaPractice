package Practice01;

import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {

       /*
       Write a Java program to print area and perimeter of a rectangle.
       Test Data:
       width=5.5, height=8.5
       Expected Output:
       Area is width*height
       Perimeter is 2*(width+height)
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 sides of rectangular");
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double areaOfRec = side2*side1;
        double perimeterOfRec = 2*(side2+side1);
        System.out.println("The area of the Rec: " + areaOfRec);
        System.out.println("The perimeter of the Rec: " + perimeterOfRec);




    }





}
