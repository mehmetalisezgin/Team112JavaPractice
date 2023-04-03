package practice.week7;

import jdk.dynalink.Operation;

import java.util.Scanner;

public class Square implements Operations {

    static Scanner scan = new Scanner(System.in);

    public static Double sideOfSquare(){
        System.out.println("Input the side of the square");
        double side = scan.nextDouble();
        if(side<=0){
            System.out.println("Please Input The Positive Number");
            return null;
        }
        return side ;
    }

   double side  = sideOfSquare() ;



    @Override
    public void area() {
        System.out.println("The Area of the square :"+ side*side);
    }

    @Override
    public void perimeter() {
        System.out.println("The Perimeter of the square :"+ 4*side);
    }


}
