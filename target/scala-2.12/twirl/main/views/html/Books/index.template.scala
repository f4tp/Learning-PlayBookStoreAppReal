
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(books : List[Book]):play.twirl.api.HtmlFormat.Appendable = {
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

  def render(books:List[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((List[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue May 22 13:42:17 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/Books/index.scala.html
                  HASH: c915d107d2e2e0a478b38723ab975882dc232b15
                  MATRIX: 657->1|683->21|1022->53|1136->74|1199->112|1225->130|1264->132|1293->135|1376->193|1409->211|1447->212|1479->217|1516->227|1531->233|1582->263|1625->279|1638->283|1665->289|1694->290|1743->312|1756->316|1783->322|1812->323|1862->346|1875->350|1903->357|1932->358|1970->366|2001->370|2038->380|2053->386|2099->411|2148->430
                  LINES: 24->1|25->2|30->3|35->4|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|44->13|46->15|46->15|46->15|46->15|47->16
                  -- GENERATED --
              */
          