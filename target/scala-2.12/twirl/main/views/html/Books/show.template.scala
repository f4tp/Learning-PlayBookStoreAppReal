
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Book,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(book: Book):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import models.Book
/*3.2*/import views.html.Books.layout


Seq[Any](format.raw/*1.14*/("""
"""),_display_(/*4.2*/layout("Show all books")/*4.26*/{_display_(Seq[Any](format.raw/*4.27*/("""
    """),format.raw/*5.5*/("""<h1> """),_display_(/*5.11*/book/*5.15*/.title),format.raw/*5.21*/(""" """),format.raw/*5.22*/("""</h1>
    <p>Price :  """),_display_(/*6.18*/book/*6.22*/.price),format.raw/*6.28*/(""" """),format.raw/*6.29*/("""</p>
    <p>Author : """),_display_(/*7.18*/book/*7.22*/.author),format.raw/*7.29*/("""</p>

    <a href=""""),_display_(/*9.15*/routes/*9.21*/.BooksController.edit(book.id)),format.raw/*9.51*/(""""> Edit</a>
    <a href=""""),_display_(/*10.15*/routes/*10.21*/.BooksController.destroy(book.id)),format.raw/*10.54*/(""""> Delete</a>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(book:Book): play.twirl.api.HtmlFormat.Appendable = apply(book)

  def f:((Book) => play.twirl.api.HtmlFormat.Appendable) = (book) => apply(book)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 21 12:05:23 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/Books/show.scala.html
                  HASH: 2e5c79d7a5eeee7e6179a5b8bf309edaba702547
                  MATRIX: 951->1|1036->16|1062->37|1122->13|1150->70|1182->94|1220->95|1252->101|1284->107|1296->111|1322->117|1350->118|1400->142|1412->146|1438->152|1466->153|1515->176|1527->180|1554->187|1602->209|1616->215|1666->245|1720->272|1735->278|1789->311|1835->327
                  LINES: 28->1|31->2|32->3|35->1|36->4|36->4|36->4|37->5|37->5|37->5|37->5|37->5|38->6|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|41->9|42->10|42->10|42->10|43->11
                  -- GENERATED --
              */
          