package practice.week05;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Q36 {
   // Initializing a Two Dimensional Array

    static LocalDateTime dateTime = LocalDateTime.now();

    public static void twoDimArray(){
        System.out.println(dateTime);
        // Matrices
        int [][] values = {{10,20,30,15,14,51},{40},{70,80,90},{10,20,30},{40,50,60},{70,80,90}} ;
        // for each inner array is called row. ==>> {10,20,30} is a row
        // each element from the inner array is called column
        //Nested loop to print the array

        for (int i = 0; i<values.length ; i++ ){
            for (int j=0 ; j<values[i].length;   j++){
                System.out.print(values[i][j]+" ");
            }
            System.out.println();
        }
    }
  /*
   how many rows, columns are there
   int [][] arr = {{10,20,30},{40,50,60},{70,80,90},{10,20,30},{40,50,60},{70,80,90}} ;
   there are 6 rows and 3 columns

   There are 6 rows and 6 columns in the values array
    int [][] values = {{10,20,30,15,14,51},{40},{70,80,90},{10,20,30},{40,50,60},{70,80,90}} ;
   */
    public static void main(String[] args) {
        twoDimArray();
    }

}
