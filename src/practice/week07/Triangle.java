package practice.week07;

import java.util.Scanner;

public class Triangle implements Operations {

    static Scanner scan = new Scanner(System.in);
    public static Double s1(){
        System.out.println("Input the first side of the triangle");
        double side1 = scan.nextDouble();
        if (side1<=0){
            System.out.println("Please Input The Positive Number");
            return null;
        }
        return side1 ;
    }

    public static Double s2(){
        System.out.println("Input the second side of the triangle");
        double side2 = scan.nextDouble();
        if (side2<=0){
            System.out.println("Please Input The Positive Number");
            return null;
        }
        return side2 ;
    }

    public static Double s3(){
        System.out.println("Input the third side of the triangle");
        double side3 = scan.nextDouble();
        if (side3<=0){
            System.out.println("Please Input The Positive Number");
            return null;
        }
        return side3 ;
    }

    double s1 = s1() ;
    double s2 = s2() ;
    double s3 = s3() ;



    @Override
    public void area() {
     double halfOfPerimetrer = (s1+s2+s3)/2 ;
        System.out.println("The area of the triangle is :"+
                Math.sqrt(halfOfPerimetrer*(halfOfPerimetrer-s1)*(halfOfPerimetrer-s2)*(halfOfPerimetrer-s3)));
    }

    @Override
    public void perimeter() {
        System.out.println("The perimeter of the triangle :" + (s1+s2+s3));
    }
}
