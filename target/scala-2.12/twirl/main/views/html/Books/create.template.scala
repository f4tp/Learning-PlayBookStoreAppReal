
package views.html.Books

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import play.api.data.Form
/*3.2*/import models.Book
/*4.2*/import views.html.helper
/*5.2*/import views.html.Books.layout


Seq[Any](_display_(/*6.2*/layout("Create Book")/*6.23*/{_display_(Seq[Any](format.raw/*6.24*/("""
  """),format.raw/*7.3*/("""<h1> Create Book </h1>
    <!--this piece of code creates a route like
    <form action=""/>books/create" method="POST">-->
  """),_display_(/*10.4*/helper/*10.10*/.form(action = routes.BooksController.save())/*10.55*/{_display_(Seq[Any](format.raw/*10.56*/("""
    """),_display_(/*11.6*/helper/*11.12*/.inputText(bookForm("id"))),format.raw/*11.38*/("""
    """),_display_(/*12.6*/helper/*12.12*/.inputText(bookForm("title"))),format.raw/*12.41*/("""
    """),_display_(/*13.6*/helper/*13.12*/.inputText(bookForm("price"))),format.raw/*13.41*/("""
    """),_display_(/*14.6*/helper/*14.12*/.inputText(bookForm("author"))),format.raw/*14.42*/("""
    """),format.raw/*15.5*/("""<input type="submit" value="Create Book">
  """)))}),format.raw/*16.4*/("""

""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(bookForm:Form[Book]): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)

  def f:((Form[Book]) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => apply(bookForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 20 13:23:21 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/Books/create.scala.html
                  HASH: 6e85bbb720abfb8b6c990d616496a73b4e8f8e56
                  MATRIX: 959->1|1055->26|1088->53|1114->73|1146->99|1205->131|1234->152|1272->153|1301->156|1454->283|1469->289|1523->334|1562->335|1594->341|1609->347|1656->373|1688->379|1703->385|1753->414|1785->420|1800->426|1850->455|1882->461|1897->467|1948->497|1980->502|2055->547|2088->550
                  LINES: 28->1|31->2|32->3|33->4|34->5|37->6|37->6|37->6|38->7|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16|49->18
                  -- GENERATED --
              */
          