
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


Seq[Any](format.raw/*5.1*/("""

"""),format.raw/*7.1*/("""<html>
  <head>
   <title> Create Book</title>
  </head>
  <body>

    <h1> Create Book </h1>
    <!--this piece of code creates a route like
    <form action=""/>books/create" method="POST">-->
      """),_display_(/*16.8*/helper/*16.14*/.form(action = routes.BooksController.save())/*16.59*/{_display_(Seq[Any](format.raw/*16.60*/("""
        """),_display_(/*17.10*/helper/*17.16*/.inputText(bookForm("id"))),format.raw/*17.42*/("""
        """),_display_(/*18.10*/helper/*18.16*/.inputText(bookForm("title"))),format.raw/*18.45*/("""
        """),_display_(/*19.10*/helper/*19.16*/.inputText(bookForm("price"))),format.raw/*19.45*/("""
        """),_display_(/*20.10*/helper/*20.16*/.inputText(bookForm("author"))),format.raw/*20.46*/("""
        """),format.raw/*21.9*/("""<input type="submit" value="Create Book">
      """)))}),format.raw/*22.8*/("""

  """),format.raw/*24.3*/("""</body>
</html>

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
                  DATE: Fri May 18 10:54:06 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/Books/create.scala.html
                  HASH: f9b2c4e7e8f7de059dd0fb01c8ec3ec86f16b826
                  MATRIX: 959->1|1055->26|1088->53|1114->73|1167->98|1195->100|1423->302|1438->308|1492->353|1531->354|1568->364|1583->370|1630->396|1667->406|1682->412|1732->441|1769->451|1784->457|1834->486|1871->496|1886->502|1937->532|1973->541|2052->590|2083->594
                  LINES: 28->1|31->2|32->3|33->4|36->5|38->7|47->16|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|53->22|55->24
                  -- GENERATED --
              */
          