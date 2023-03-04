package practice.week03;

import java.util.Scanner;

public class Q23 {

    // Is This text A String

    static Scanner scan = new Scanner(System.in);

    public static void thisIsString(){
        System.out.println("Input A String Text");

        while (true){
            if (scan.hasNextInt()){
                int input = scan.nextInt();
                System.out.println("This is Integer :"+ input);
                thisIsString();
            }else if(scan.hasNextDouble()){
                double data = scan.nextDouble();
                System.out.println("This is double :"+data);
                thisIsString() ;
            }else if(scan.hasNext()){
                String input2 = scan.next();
                System.out.println("Great this is a String :"+input2);
            }
        }
    }

    public static void main(String[] args) {
        thisIsString() ;
    }

}
