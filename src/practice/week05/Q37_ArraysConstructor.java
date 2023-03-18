package practice.week05;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Q37_ArraysConstructor {
   // Create a two-dimensional array method and take it from the user
    final int sizeRow ; // Row is sizeOfOuter
    final int sizeColumn ; // Cloumn is size of inner
    /*
     Final variables: When a variable is declared as final,
     its value cannot be changed once it has been initialized.
     This is useful for declaring constants or other values
     that should not be modified.
     */
    static LocalDateTime dateTime = LocalDateTime.now() ;
    // we have to create constructor with paramether when we use final with datatypes
    public Q37_ArraysConstructor(int sizeOfOuter, int sizeOfInner) {
        this.sizeRow = sizeOfOuter;
        this.sizeColumn = sizeOfInner;
    }

    public static void create2DimArr(int row,int column){
        System.out.println(dateTime);
        Q37_ArraysConstructor object = new Q37_ArraysConstructor(row, column) ;
        int[][] array2dim = new int[object.sizeRow][object.sizeColumn] ;
        System.out.println(array2dim.length);
    }


    public static void main(String[] args) {
        create2DimArr(2,3);
    }
}
