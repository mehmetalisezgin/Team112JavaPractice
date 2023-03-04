package practice.week03;

import java.util.Scanner;

public class Q25 {

    // Write java a code that checks your STRING PIN and give it to 3 false grants logins.

    static Scanner scan = new Scanner(System.in);
    static String systemPin = "wiseQuarter";
    static String userPin ;
    static int numberOfInputrights = 3 ;

    public static void systemLogIn(){

        while (true){
            System.out.println("Input Your Pin Code :");
            userPin = scan.next();
            if (systemPin.equals(userPin)){
                System.out.println("Welcome to Wise Quarter");
                break;
            }else {
                System.out.println("Incorrect password...");
                numberOfInputrights-- ;
                System.out.println("Remaining attempts : "+ numberOfInputrights);
                if (numberOfInputrights==0){
                    System.out.println("System Blocked Contact to Administrator :");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        systemLogIn();
    }

}
