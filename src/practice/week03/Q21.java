package practice.week03;


import java.util.Scanner;

public class Q21 {
    // triangular pyramid

    /*
       *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 * * * * * * *
* * * * * * * *
     */


    static Scanner scan = new Scanner(System.in);
    static int numberForInput ;
    public static void createTriangularPyramid(){
        System.out.println("Input a number");
        numberForInput = scan.nextInt();
        System.out.println("Regular triangular pyramid");

      for (int row=1 ; row<=numberForInput; row++){
          for (int space = numberForInput-1; space>=row-1 ; space-- ){
              System.out.println(" ");
          }for(int star = 0 ; star<row; star++){
              System.out.print("* ");
              System.out.println();
          }for (int space2 = numberForInput ;space2<=row ; space2--){
              System.out.println(" ");
              for (int star2 = numberForInput;star2>=row ; star2--){
                  System.out.println("*"+ " ");
                  System.out.println();
              }

          }

      }

    }

    public static void main(String[] args) {
        createTriangularPyramid();
    }


}
