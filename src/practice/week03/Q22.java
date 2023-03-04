package practice.week03;

public class Q22 {

    public static void main(String[] args) {
//      1
//      2 3
//      4 5 6
//      7 8 9 10
//      11 12 13 14 15
//      16 17 18 19 20 21
//      22 23 24 25 26 27 28
//      29 30 31 32 33 34 35 36
// print these numbers as left-ordered numbers

      int number = 0 ;
      for(int row = 1 ; row <=10 ; row++){
          for (int cloumn = 1 ; cloumn<=row ; cloumn++){
              System.out.print(++number +"");
          }
          System.out.println();
      }





    }
}
