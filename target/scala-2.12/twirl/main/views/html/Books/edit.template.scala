
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm: Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import play.api.data.Form
/*3.2*/import models.Book
/*4.2*/import views.html.helper
/*5.2*/import views.html.Books.layout


Seq[Any](format.raw/*1.24*/("""
"""),_display_(/*6.2*/layout("Edit Book")/*6.21*/{_display_(Seq[Any](format.raw/*6.22*/("""
    """),format.raw/*7.5*/("""<h1> Edit Book </h1>
    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.BooksController.update())/*8.59*/{_display_(Seq[Any](format.raw/*8.60*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(bookForm("id"),'id -> "bookForm('id')",'placeholder -> "id", 'value -> "hello")),format.raw/*9.106*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(bookForm("title"),'id -> "bookForm('title')",'id -> "bookForm('title')",'placeholder -> "id", 'value -> "hello")),format.raw/*10.139*/("""
        """),_display_(/*11.10*/helper/*11.16*/.inputText(bookForm("price"))),format.raw/*11.45*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(bookForm("author"))),format.raw/*12.46*/("""
        """),format.raw/*13.9*/("""<input type="submit" value="Edit Book"/>
    """)))}),format.raw/*14.6*/("""
""")))}),format.raw/*15.2*/("""

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
                  DATE: Mon May 21 12:05:23 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/Books/edit.scala.html
                  HASH: 2a5ca4ac5793bfc31abefbe1a8b033b0f8393a5d
                  MATRIX: 957->1|1052->26|1085->54|1111->75|1143->102|1203->23|1231->135|1258->154|1296->155|1328->161|1380->188|1394->194|1449->241|1487->242|1524->253|1538->259|1649->349|1687->360|1702->366|1847->489|1885->500|1900->506|1950->535|1988->546|2003->552|2054->582|2091->592|2168->639|2201->642
                  LINES: 28->1|31->2|32->3|33->4|34->5|37->1|38->6|38->6|38->6|39->7|40->8|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|46->14|47->15
                  -- GENERATED --
              */
          