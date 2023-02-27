package practice.week02;

import java.util.Scanner;

public class Q16 {


   /*
   Get 3 positive numbers from the user, Check the triangle creation status with these numbers
   Rule: if a,b,c are positive then if these conditions (a+b>c>a-b, a+c>b>a-c, b+c>a>b-c) are met,
   this is a triangle.
   if a=b=c this is an Equilateral triangle
   if a=b or a=c or b=c this is an Isosceles triangle
   if a!=b!=c this is a scalene triangle
   Expected Output: Yes This is a Isosceles triangle
    */

    public static void main(String[] args) {

        /*
   Get 3 positive numbers from the user, Check the triangle creation status with these numbers
   Rule: if a,b,c are positive then if these conditions (a+b>c>a-b, a+c>b>a-c, b+c>a>b-c) are met,
   this is a triangle.
   if a=b=c this is an Equilateral triangle
   if a=b or a=c or b=c this is an Isosceles triangle
   if a!=b!=c this is a scalene triangle
   Expected Output: Yes This is a Isosceles triangle
    */

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Please input the sides of triangle\nWhen you input click on the ENTER...");
        int side1 ,side2, side3 ;
        // side1=a , side2 = b , side3 = c
        side1 = scan.nextInt();
        side2 = scan.nextInt();
        side3 = scan.nextInt();
        // (a+b>c>a-b, a+c>b>a-c, b+c>a>b-c)
         if (side1<=0 || side2<=0 || side3<=0){
            System.out.println("Please input the positive numbers...");
             return;
        } if( ((side1+side2>side3) && (side3>side1-side2)) &&  ((side1+side3)>side2) && (side2>(side1-side3)) && (side2+side3)>side1 && side1>(side2-side3)){
            System.out.println("This is a triangle");

        } else {
            System.out.println("This is not a triangle...");
            return;

        } if ( (side1==side2) && (side2==side3) && (side1==side3)){
            System.out.println("This is an Equilateral triangle");
        } if(  ((side1==side2)&& (side2!=side3) && (side1!=side3)) || ((side2==side3)&& (side2!=side1) && (side3!=side1)) ||
        ((side1==side3)&& side1!=side2 && side3!=side2)){
            System.out.println("This is an Isosceles triangle ");
        }if(  (side1!=side2) && (side2!=side3)) {
            System.out.println("This is a scalene triange");
        }



    }






}
