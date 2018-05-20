
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
/*1.2*/import models.Book
/*2.2*/import views.html.Books.layout

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(books : Set[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""<!-- set object has been defined -->
"""),_display_(/*5.2*/layout("AllBooks")/*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""
  """),format.raw/*6.3*/("""<h1> All Books </h1>

    <!-- scala for each loop -->
  """),_display_(/*9.4*/for(book <- books) yield /*9.22*/{_display_(Seq[Any](format.raw/*9.23*/("""
    """),format.raw/*10.5*/("""<a href=""""),_display_(/*10.15*/routes/*10.21*/.BooksController.show(book.id)),format.raw/*10.51*/("""">Book Title = """),_display_(/*10.67*/book/*10.71*/.title),format.raw/*10.77*/(""" """),format.raw/*10.78*/("""</a>
    <p> Price = """),_display_(/*11.18*/book/*11.22*/.price),format.raw/*11.28*/(""" """),format.raw/*11.29*/("""</p>
    <p> Author = """),_display_(/*12.19*/book/*12.23*/.author),format.raw/*12.30*/(""" """),format.raw/*12.31*/("""</p>
  """)))}),format.raw/*13.4*/("""

  """),format.raw/*15.3*/("""<a href=""""),_display_(/*15.13*/routes/*15.19*/.BooksController.create()),format.raw/*15.44*/("""">Create Book</a>
""")))}),format.raw/*16.2*/("""


"""))
      }
    }
  }

  def render(books:Set[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((Set[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 20 13:22:11 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/Books/index.scala.html
                  HASH: c0b8620e79a01774e62c1296a48833fee9b70396
                  MATRIX: 657->1|683->21|1021->53|1134->73|1197->111|1223->129|1262->131|1291->134|1374->192|1407->210|1445->211|1477->216|1514->226|1529->232|1580->262|1623->278|1636->282|1663->288|1692->289|1741->311|1754->315|1781->321|1810->322|1860->345|1873->349|1901->356|1930->357|1968->365|1999->369|2036->379|2051->385|2097->410|2146->429
                  LINES: 24->1|25->2|30->3|35->4|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|44->13|46->15|46->15|46->15|46->15|47->16
                  -- GENERATED --
              */
          