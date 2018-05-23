package models;
import java.util.*;
//import com.avaje.ebean.Model;
import io.ebean.Model;
import javax.persistence.*;

import io.ebean.Finder;

@Entity
public class Book extends Model {
    @Id
    public Integer id;
    public String title;
    public Integer price;
    public String author;

    public static Finder<Integer, Book> find = new Finder<>(Book.class);


    /*
    public Book()
    {
        //this.id = 25;
        //this.title ="tessssster";
    }
    public Book(Integer id, String title, Integer price, String author)
    {
        this.id  = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    //public Book(String id, String title, String price, String author)
    //{
       // this.id  = Integer.parseInt((id));
        //this.title = title;
        //this.price = Integer.parseInt((price));
       //this.author = author;
   // }

    private static Set<Book> books;

    static
    {
        books = new HashSet<>();
        books.add(new Book(1, "C++", 20, "ABC"));
        books.add(new Book(2, "Java", 30, "XYZ"));
    }

    public static Set<Book> allBooks()
    {
        return books;
    }

    public static Book findById(Integer id)
    {
        //Book tempbook;
        for (Book book: books)
        {
            if(id.equals(book.id))
            {
                return book;
            }
        }
        return null;
    }

    public static void add (Book book)
    {
        books.add(book);
    }

    public static void remove(Book book)
    {
        books.remove(book);
    }
    */

}
