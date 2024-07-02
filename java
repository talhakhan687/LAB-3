
PROBLEM 1 :

import java.util.Scanner;
public class BookProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Book 1:");
        Book book1 = createBook(sc);

        System.out.println("\nEnter details for Book 2:");
        Book book2 = createBook(sc);

        System.out.println("\nEnter details for Book 3:");
        Book book3 = createBook(sc);

        System.out.println("\nBook Details:");
        System.out.println("Book 1:");
        book1.dDetails();

        System.out.println("\nBook 2:");
        book2.dDetails();

        System.out.println("\nBook 3:");
        book3.dDetails();

        Book.displayTotalBooks();

    }
    public static Book createBook(Scanner sc) {
        System.out.print("Title: ");
        String title = sc.next();

        System.out.print("Author: ");
        String author = sc.next();

        System.out.print("Year: ");
        int year = sc.nextInt();
        sc.next(); 

        return new Book(title, author, year);
    }
}
class Book {
    private String title;
    private String author;
    private int year;
    private static String genre = "Fiction"; 
    private static int p = 0;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        p++;
    }
    public void dDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }
    public static void displayTotalBooks() {
        System.out.println("\nTotal number of books: " + p);
    }
}
