package practice.week02;

import javax.management.BadBinaryOpValueExpException;
import java.util.Scanner;

public class Q15 {





    public static void main(String[] args) {
        /*
    Write a Java program that calculates your final lecture's score.
    Test Data: quiz,mid,finalexam,score,average, score, average =quiz20%+mid30%+finalexam50%
    0-39  ==> F
    40-59 ==> D
    50-69 ==> C
    70-89 ==> B
    90-100 ==> A
     */
        Scanner scan = new Scanner(System.in);
        double quiz, mid, finalexam, average; // we defined data type of variables
        String score = "Invalid Input Data";
        System.out.println("Plese enter your quiz score...");
        quiz = scan.nextDouble();

        System.out.println("Plese enter your mid score...");
        mid = scan.nextDouble();

        System.out.println("Plese enter your finalexam score...");
        finalexam = scan.nextDouble();

        average = ((quiz*20)+(mid*30)+(finalexam*50))/100 ;

        if (average>=0 && average<=39){
            score = "F" ;
        } else if (average>=40 && average<=59){
            score = "D" ;
        }else if (average>=60 && average<=69){
            score = "C" ;
        }else if (average>=70 && average<=89){
            score = "B" ;
        }else if (average>=90 && average<=100){
            score = "A" ;
        }
        System.out.println("Your Grade is :"+ score);
    }
}
