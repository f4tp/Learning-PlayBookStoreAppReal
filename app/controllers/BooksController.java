package controllers;
import play.mvc.*;
import models.*;
import java.util.Set;
import views.html.Books.*;
import javax.inject.Inject;
import play.data.*;
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


        System.out.println("hellllo :" + bookFormInst.getClass().toString());
        //get book data out of form and compose book object
    //.... here
        Book bookinst = bookFormInst.get();
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

        return redirect(routes.BooksController.index());
    }

    public Result edit(Integer idOfBook)
    {
        return TODO;
    }

    public Result update()
    {
        return TODO;
    }

    public Result destroy(Integer idOfBook)
    {
        return TODO;
    }

    //to return book details
    public Result show(Integer idOfBook)
    {
        return TODO;
    }


}
