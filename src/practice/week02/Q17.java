package practice.week02;

import java.util.Scanner;

public class Q17 {


    public static void main(String[] args) {
/*
    Write a Java program to compute body mass index (BMI) of a person.
    BMI = (weight)kg / (height * height)(m)
    Expected Output:
    BMI<=18.5, underweight
    18.5<BMI<24.9 ,healthy range
    25<=BMI<29.9,overweight
    30<=BMI<34.9,obese
    35<=BMI<39.9, severe obesity.
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your weight :");
        double weight ,height , BMI ;
        weight = scan.nextDouble();
        System.out.print("Input your height as a meter :");
        height = scan.nextDouble() ;

        BMI = weight/(height*height) ;

        if (BMI<=18.5){
            System.out.println("Underweight");
        }else if( (18.5<BMI) && (BMI<=24.9)){
            System.out.println("healthy range");
        }else if((25<=BMI)&&(BMI<29.9)){
            System.out.println("overweight");
        }else if((30<=BMI)&&(BMI<34.9)){
            System.out.println("obese");
        }else if((35<=BMI)&&(BMI<39.9)){
            System.out.println("severe obesity");
        }





    }




}
