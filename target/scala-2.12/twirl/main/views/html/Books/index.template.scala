
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books : Set[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.4*/import models.Book


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!-- set object has been defined -->
  """),format.raw/*5.1*/("""<html>
  <head>
   <title> All Books</title>
  </head>
  <body>
    <h1> All Books </h1>

    <!-- scala for each loop -->
    """),_display_(/*13.6*/for(book <- books) yield /*13.24*/{_display_(Seq[Any](format.raw/*13.25*/("""
      """),format.raw/*14.7*/("""<a href="#">Book Title = """),_display_(/*14.33*/book/*14.37*/.title),format.raw/*14.43*/(""" """),format.raw/*14.44*/("""</a>
      <p> Price = """),_display_(/*15.20*/book/*15.24*/.price),format.raw/*15.30*/(""" """),format.raw/*15.31*/("""</p>
      <p> Author = """),_display_(/*16.21*/book/*16.25*/.author),format.raw/*16.32*/(""" """),format.raw/*16.33*/("""</p>
    """)))}),format.raw/*17.6*/("""

  """),format.raw/*19.3*/("""</body>
</html>

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
                  DATE: Tue May 15 13:01:02 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/Books/index.scala.html
                  HASH: 1f1bd4ab211705e80c1ed1f2e9d32214175494e3
                  MATRIX: 957->1|1049->62|1096->21|1123->22|1188->81|1342->209|1376->227|1415->228|1449->235|1502->261|1515->265|1542->271|1571->272|1622->296|1635->300|1662->306|1691->307|1743->332|1756->336|1784->343|1813->344|1853->354|1884->358
                  LINES: 28->1|31->4|34->2|35->3|36->5|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|48->17|50->19
                  -- GENERATED --
              */
          