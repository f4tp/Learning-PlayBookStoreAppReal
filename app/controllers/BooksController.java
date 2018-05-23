package controllers;
import play.mvc.*;
import models.*;

import java.util.HashMap;
import java.util.List;
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
        //below method from when DB not in action
       // Set<Book> Mybooks = Book.allBooks();
        //return ok(index.render(Mybooks));

        //below is the database variant of above
        List<Book> Mybooks = Book.find.all();
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
       // Book.add(bookinst);
        //below for DB - for routine that does not work
        //bookinst.save();
    // end code from video ///////////////////////////////////////////////////////

        play.data.DynamicForm data = formFactory.form().bindFromRequest();
        Integer idFromForm = Integer.parseInt(data.get("id"));
        String titleFromForm = data.get("title");
        Integer priceFromForm = Integer.parseInt(data.get("price"));
        String authorFromForm = data.get("author");
        // Code for the old routine without DB
        //Book bookInToAdd = new Book(idFromForm, titleFromForm,priceFromForm, authorFromForm);
        //Book.add(bookInToAdd);

        Book bookInToAddToDB = new Book();
        bookInToAddToDB.id = idFromForm;
        bookInToAddToDB.title = titleFromForm;
        bookInToAddToDB.price = priceFromForm;
        bookInToAddToDB.author = authorFromForm;
        //save method must be a super class method as the class now extends the Model class
        bookInToAddToDB.save();


        //return redirect(routes.BooksController.index());
    // code works above
    //new way of doing it

       // Map<String,String> myMap = new HashMap<>();

       // myMap.put("id",bookFormInst.get().id.toString());
       // myMap.put("id",bookFormInst.get().title);
       // myMap.put("id",bookFormInst.get().price.toString());
        //myMap.put("id",bookFormInst.get().author);

        //redirect them to the result / where they need to be next
        return redirect(routes.BooksController.index());
    }

    public Result edit(Integer idOfBook)
    {
        //form old code without DB
        //Book theBook = Book.findById(idOfBook);

        //routine for DB; .find and .byId must be super class methods now that the class extends
        //the Model class
        Book theBook = Book.find.byId(idOfBook);
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
        //old routine wit no DB
        //Book bookInToUpdate = new Book(idFromForm, titleFromForm,priceFromForm, authorFromForm);
        Book bookInToUpdate = new Book();
        bookInToUpdate.id = idFromForm;
        bookInToUpdate.title = titleFromForm;
        bookInToUpdate.price = priceFromForm;
        bookInToUpdate.author = authorFromForm;

        //old routine from old model before DB
        //Book oldBookToUpdate = Book.findById(bookInToUpdate.id);
        //new routine with DB
        Book oldBookToUpdate = Book.find.byId(bookInToUpdate.id);
        if(oldBookToUpdate == null)
        {
            return notFound("This book does not exist");
        }
        else
        {
            oldBookToUpdate.title = bookInToUpdate.title;
            oldBookToUpdate.author = bookInToUpdate.author;
            oldBookToUpdate.price = bookInToUpdate.price;

            //this was not present in old model without DB, but is in new one
            oldBookToUpdate.update();
            return redirect(routes.BooksController.index());
        }


    }

    public Result destroy(Integer idOfBook)
    {
        //old routine before DB
        //Book book = Book.findById(idOfBook);
        //new routine after DB
        Book book = Book.find.byId(idOfBook);
        if(book == null)
        {
            return notFound("Book not found");
        }
        else
        {
            //old before DB
            //Book.remove(book);
            //new after DB
            book.delete();
            return redirect(routes.BooksController.index());
        }

    }

    //to return book details
    public Result show(Integer idOfBook)
    {
        //old before db
        //Book book = Book.findById(idOfBook);
        //new after DB
        Book book = Book.find.byId(idOfBook);
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
