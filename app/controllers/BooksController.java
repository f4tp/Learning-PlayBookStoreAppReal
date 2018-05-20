package controllers;
import play.mvc.*;
import models.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import views.html.Books.*;
import javax.inject.Inject;
import play.data.*;
import play.data.Form;
import play.mvc.Http;



public class BooksController extends Controller {
    //this stuff helps us to create a form in the view
    @Inject play.data.FormFactory formFactory;

    public Result index()
    {
        Set<Book> Mybooks = Book.allBooks();
        return ok(index.render(Mybooks));
    }

    //to create book
    public Result create()
    {
        //formfactory creates us a form
        Form<Book> bookForm = formFactory.form(Book.class);

        //passes the form to the create view which is rendered
        //Http.Request thisReq = request();
        //System.out.println(thisReq.getHeaders());
        return ok(create.render(bookForm));

    }

    //POST HTTP request so going to handle data coming in
    //from create.scala.html page
    public Result save()
    {
    // code from video didn't work / ////////////////////////////////////////////////
        //Http.Request thisReq = request();
        //System.out.println(thisReq.getHeaders());
        //System.out.println(thisReq.body().toString());
        //get form that was generated in create method

    //this line of code was the problem - the form contained the stuff but it wouldn't create a
    //book object using the Form.get() method below...
        Form<Book> bookFormInst = formFactory.form(Book.class).bindFromRequest();
        Book bookinst = bookFormInst.bindFromRequest().get();


        System.out.println("hellllo :" + bookFormInst.getClass().toString());
        //get book data out of form and compose book object
    //.... here

        System.out.println("I NEEEEED : " + bookFormInst.toString());
        System.out.println("I NEEEEED : " + bookinst.toString());
        System.out.println("the title of the new book is :" + bookinst.title);
        System.out.println("the title of the new book is :" + bookinst.id);
        System.out.println("the title of the new book is :" + bookinst.price);
        System.out.println("the title of the new book is :" + bookinst.author);

        //System.out.println(bookinst.author.toString());
         //add the book to the list calling static method in Book model
       // Book bookInstTwo = new Book();

        //play.data.DynamicForm dataFromForm = play.data.Form.


        //Book.add(bookinst);

        //redirect them to the result / where they need to be next

    // end code from video ///////////////////////////////////////////////////////

        play.data.DynamicForm data = formFactory.form().bindFromRequest();
        Integer idFromForm = Integer.parseInt(data.get("id"));
        String titleFromForm = data.get("title");
        Integer priceFromForm = Integer.parseInt(data.get("price"));
        String authorFromForm = data.get("author");
        Book bookInToAdd = new Book(idFromForm, titleFromForm,priceFromForm, authorFromForm);
        Book.add(bookInToAdd);
        //return redirect(routes.BooksController.index());
    // code works above
    //new way of doing it

       // Map<String,String> myMap = new HashMap<>();

       // myMap.put("id",bookFormInst.get().id.toString());
       // myMap.put("id",bookFormInst.get().title);
       // myMap.put("id",bookFormInst.get().price.toString());
        //myMap.put("id",bookFormInst.get().author);


        return redirect(routes.BooksController.index());
    }

    public Result edit(Integer idOfBook)
    {
        Book theBook = Book.findById(idOfBook);
        if(theBook == null)
        {
            return notFound("book not found");
        }
        else
        {
            Form<Book> bookForm = formFactory.form(Book.class).fill(theBook);
            return ok(edit.render(bookForm));
        }
    }

    public Result update()
    {

        play.data.DynamicForm data = formFactory.form().bindFromRequest();
        Integer idFromForm = Integer.parseInt(data.get("id"));
        String titleFromForm = data.get("title");
        Integer priceFromForm = Integer.parseInt(data.get("price"));
        String authorFromForm = data.get("author");
        Book bookInToUpdate = new Book(idFromForm, titleFromForm,priceFromForm, authorFromForm);
        Book oldBookToUpdate = Book.findById(bookInToUpdate.id);
        if(oldBookToUpdate == null)
        {
            return notFound("This book does not exist");
        }
        else
        {
            oldBookToUpdate.title = bookInToUpdate.title;
            oldBookToUpdate.author = bookInToUpdate.author;
            oldBookToUpdate.price = bookInToUpdate.price;
            return redirect(routes.BooksController.index());
        }


    }

    public Result destroy(Integer idOfBook)
    {
        Book book = Book.findById(idOfBook);
        if(book == null)
        {
            return notFound("Book not found");
        }
        else
        {
            Book.remove(book);
            return redirect(routes.BooksController.index());
        }

    }

    //to return book details
    public Result show(Integer idOfBook)
    {
        Book book = Book.findById(idOfBook);
        if(book == null)
        {
            return notFound("Book not found");
        }
        else
        {
            return ok(show.render(book));
        }
    }


}
