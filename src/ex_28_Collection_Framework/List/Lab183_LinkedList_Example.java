package ex_28_Collection_Framework.List;
import java.util.*;
public class Lab183_LinkedList_Example {

        public static void main(String[] args) {
            //Creating list of Books
            List<Book> list=new LinkedList<Book>();
            //Creating Books
            Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
            Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
            Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
            //Adding Books to list
            list.add(b1);
            list.add(b2);
            list.add(b3);
            //Traversing list
            for(Book b:list){
                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
            }
            System.out.println(list);
        }
    }
class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                "}\n";
    }
}
