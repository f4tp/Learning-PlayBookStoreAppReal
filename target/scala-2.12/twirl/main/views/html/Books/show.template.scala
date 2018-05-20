
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


Seq[Any](format.raw/*1.14*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        <title>"""),_display_(/*6.17*/book/*6.21*/.title),format.raw/*6.27*/("""</title>
    </head>
    <body>

        <h1> """),_display_(/*10.15*/book/*10.19*/.title),format.raw/*10.25*/(""" """),format.raw/*10.26*/("""</h1>
        <p>Price :  """),_display_(/*11.22*/book/*11.26*/.price),format.raw/*11.32*/(""" """),format.raw/*11.33*/("""</p>
        <p>Author : """),_display_(/*12.22*/book/*12.26*/.author),format.raw/*12.33*/("""</p>

        <a href=""""),_display_(/*14.19*/routes/*14.25*/.BooksController.edit(book.id)),format.raw/*14.55*/(""""> Edit</a>
        <a href=""""),_display_(/*15.19*/routes/*15.25*/.BooksController.destroy(book.id)),format.raw/*15.58*/(""""> Delete</a>


    </body>
</html>

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
                  DATE: Sun May 20 12:49:34 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/Books/show.scala.html
                  HASH: 93ff9a1352cf1d09e2be2f3193e68788605499cc
                  MATRIX: 951->1|1036->16|1084->13|1112->36|1140->38|1202->74|1214->78|1240->84|1318->135|1331->139|1358->145|1387->146|1442->174|1455->178|1482->184|1511->185|1565->212|1578->216|1606->223|1659->249|1674->255|1725->285|1783->316|1798->322|1852->355
                  LINES: 28->1|31->2|34->1|35->3|36->4|38->6|38->6|38->6|42->10|42->10|42->10|42->10|43->11|43->11|43->11|43->11|44->12|44->12|44->12|46->14|46->14|46->14|47->15|47->15|47->15
                  -- GENERATED --
              */
          