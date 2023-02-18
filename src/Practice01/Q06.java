package Practice01;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

      /*
      Write a Java program to print the area and perimeter of a circle
      A = pi x radius x radius
      P = 2 x pi x r
      Test Data:
      Radius : 7.5
      pi:3.14
       */

     double radius,pi,area,perimeter ;
     radius = 7.5 ;
     pi = 3 ;
      area = pi*radius*radius;
      perimeter = 2*pi*radius ;

        System.out.println("The Area of the circle is :"+area);
        System.out.println("The Perimeter of the circle is :"+perimeter); // ctrl d

        Scanner scan = new Scanner(System.in);


        System.out.println("Input the radius of the circle");
        radius = scan.nextDouble();

        if (radius<=0){
            System.out.println("Please input bigger than 0 ");
        } else {
            area = pi*radius*radius;
            perimeter = 2*pi*radius ;
            System.out.println("The Area of the circle is :"+area);
            System.out.println("The Perimeter of the circle is :"+perimeter);
        }


    }

}
