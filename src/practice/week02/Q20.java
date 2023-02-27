package practice.week02;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {

 //Check whether there is a space character in a string you receive from the user.
        Scanner scan=new Scanner(System.in);
        System.out.print("Input a string :");
        String str=scan.nextLine();


        boolean varMi=	str.contains(" ");

        System.out.println("Is there a space in the inputted string? :"+varMi);

        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.


        System.out.println("Is the inputted string empty?:"+str.isEmpty());


    }
}
