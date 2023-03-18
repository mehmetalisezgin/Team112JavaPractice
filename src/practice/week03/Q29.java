package practice.week03;

import java.util.Scanner;

public class Q29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();

        // Check if the number is a perfect square
        boolean isPerfectSquare = false;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }

        // Print the result
        if (isPerfectSquare) {
            System.out.println(false);
        } else {
            System.out.println(num);
        }
    }
}
