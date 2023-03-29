package practice.week06.BooksManagementProject;

public class BooksInfo {

    // we will create properties of the book
   private int no ;
   private String nameOfBook ;
   private String author ;
   private int publishYear ;
   private double priceOfBook;


   // If we use private key we need encapsulation


    public BooksInfo(int no, String nameOfBook, String author, int publishYear, double priceOfBook) {
        this.no = no;
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publishYear = publishYear;
        this.priceOfBook = priceOfBook;
    }

    public BooksInfo() {
    }

    // why did we create an empty constructor? Because it overrides the default parameter


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public double getPriceOfBook() {
        return priceOfBook;
    }

    public void setPriceOfBook(double priceOfBook) {
        this.priceOfBook = priceOfBook;
    }

    // Java recommends that we use to toString method to print variables on the object.
    @Override
    public String toString() {
        return "BooksInfo{" +
                "no=" + no +
                ", nameOfBook='" + nameOfBook + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                ", priceOfBook=" + priceOfBook +
                '}';
    }




}
