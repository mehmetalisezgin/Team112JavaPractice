package Practice01;

public class Q09 {


    public static void main(String[] args) {

       /*
       Write a Java program to swap two variables.
       Test Data : a = 12 , b=15
       Expected Output : a = 15 , b = 12 ;
        */

        int a , b , temp ;
        a = 12 ;
        b = 15 ;
        // let assign a to temp
        temp = a ;
        a = b ;
        b = temp ;
        System.out.println("a :"+a);
        System.out.println("b :"+b);





    }
}
