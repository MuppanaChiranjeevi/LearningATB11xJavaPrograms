package ex_28_Collection_Framework.Comparable;
import java.util.*;
public class Lab204_Comparable {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 12.99),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, 10.50),
                new Book("1984", "George Orwell", 1949, 9.99),
                new Book("Pride and Prejudice", "Jane Austen", 1813, 8.75),
                new Book("The Hobbit", "J.R.R. Tolkien", 1937, 14.25)
        );

        System.out.println("Books before sorting:");
        books.forEach(System.out::println);

        // Sort using natural ordering (by title)
        Collections.sort(books);

        System.out.println("\nBooks after sorting by title:");
        books.forEach(System.out::println);
    }
}


class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Implement compareTo to sort by title alphabetically
    @Override
    public int compareTo(Book other) {
//        return this.title.compareToIgnoreCase(other.title);
//        return this.author.compareToIgnoreCase(other.author);
        return other.yearPublished - this.yearPublished;  //descending order
//        return Double.compare(other.price,this.price);     //descending order
    }

    @Override
    public String toString() {
        return String.format("%-25s by %-15s (%d) $%.2f",
                title, author, yearPublished, price);
    }


}

