package practice.week06.BooksManagementProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksProcess {

/*
1. Write an application in Java that allows the user to add, delete, and list books.
2. Books should be numbered sequentially and automatically starting from 1001.
3. Each book should be included the Name of the book, the author's name, publication year, and price information.
4. Users should see a menu like the following when running the program.
 ============ Online Book Store ============
  1. Add a Book
  2. Delete a Book with a Number
  3. List all Books
  4. Finish
 */
    // we created a list with BooksInfo data type. We will put all properties of the book in a list
    static List<BooksInfo> bookList = new ArrayList<>() ;
    // we nee dscanner object to get info from the user
    static Scanner scan = new Scanner(System.in) ;
    static int bookNo = 1000;


    // This is a menu method to bring all transactions to user
    // we added (List<BooksInfo> list) this paramether because we should put all info in the list
    // then we will connect this list with bookList
    public static void menu(List<BooksInfo> list){
        System.out.println("========== Book Store ==========\n1: Add Book\n2: Delete Book" +
                "\n3: List All Book\n4: Exit");
        System.out.println("Please Select Your Operation :");
        int option = scan.nextInt();
        switch (option){
            case 1:
                addBook(list);
                break;
            case 2:
                deleteBookWithNumber(list);
                break;
            case 3:
                listBook(list);
                break;
            case 4:
                finish();
                break;
            default:
                System.out.println("Wrong entry data... Please try again");
                break;
        }
    }

    private static void finish() {
        System.out.println("Thank you for choosing us...");
    }

    private static void listBook(List<BooksInfo> list) {

        for (BooksInfo each : list){
            System.out.println(each.toString());
        }
        menu(list);
    }

    private static void deleteBookWithNumber(List<BooksInfo> list) {
        System.out.println("Please Enter The Number of Book That You Want to Delete...");
        int deleteNo = scan.nextInt() ;
         //We have check each book, does the number of book match the list or not

        for(BooksInfo bookNumber: list){
            if(bookNumber.getNo() == deleteNo){
                list.remove(bookNumber);
                menu(list); // methodcall
            }
        }
        System.out.println("The book number "+ deleteNo + " to be deleted couldnt be found");
        menu(list);
    }

    private static void addBook(List<BooksInfo> list) {
        System.out.println("Please Enter The Name Of The Book");
        String bookName = scan.nextLine();
        scan.nextLine();
        //If consecutive scan objects run with the same primitive data, we should add dummy scan.nextLine to jump lines
        System.out.println("Please Enter The Author :");
        String authorName = scan.nextLine();

        System.out.println("Please Enter The Publish Year :");
        int publishYear = scan.nextInt();

        System.out.println("Please Enter The Price :");
        double price = scan.nextDouble();

        // we need to create object that add to properties of the book

        BooksInfo booksInfo = new BooksInfo(++bookNo,bookName,authorName,publishYear,price);
        list.add(booksInfo) ;

        System.out.println("The Book is :"+ booksInfo + " added...");

        // this is a method call ==>> In the Java its called Recursion method. Method calls itself continuously
        menu(list);

    }


}
