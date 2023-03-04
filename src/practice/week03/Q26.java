package practice.week03;

import java.util.Scanner;

public class Q26 {

    //   Let's print the positive divisors of a positive integer


    static Scanner scan = new Scanner(System.in);
    static int positiveNumber ;


    public static void positiveDivisors(){
        System.out.println("Please Input A Positive Integer :");
        positiveNumber = scan.nextInt();
        if (positiveNumber<=0){
            System.out.println("please input a positive integer...");
        }else{
            for(int i = 1; i<=positiveNumber ; i++){
                if (positiveNumber%i==0){
                    System.out.print(i + ", ");
                }
            }
        }
    }

    public static void positiveDivisorsWithWhile(){
        System.out.println("Please Input A Positive Integer :");
        positiveNumber = scan.nextInt();
        if (positiveNumber<=0){
            System.out.println("please input a positive integer...");
        }else{
           int i =1;
            while(i<=positiveNumber){
                if(positiveNumber%i==0){
                    System.out.print(i +",");
                }i++;
            }
        }
    }

    public static void main(String[] args) {
      //  positiveDivisors();
          positiveDivisorsWithWhile();
    }




}
