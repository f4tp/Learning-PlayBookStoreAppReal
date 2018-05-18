
package views.html.Home

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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(namer : String, lastnamer : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
  <head>
   <title> My Welcome Page</title>
  </head>
  <body>
    <p>Welcome """),_display_(/*8.17*/namer),format.raw/*8.22*/(""" """),_display_(/*8.24*/lastnamer),format.raw/*8.33*/(""" """),format.raw/*8.34*/("""to our website</p>
  </body>
</html>

"""))
      }
    }
  }

  def render(namer:String,lastnamer:String): play.twirl.api.HtmlFormat.Appendable = apply(namer,lastnamer)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (namer,lastnamer) => apply(namer,lastnamer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue May 15 13:01:02 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/Home/welcome.scala.html
                  HASH: 5885ec560d461a91d4cd01c29df2ea2d3c9d48ce
                  MATRIX: 962->1|1092->38|1119->39|1231->125|1256->130|1284->132|1313->141|1341->142
                  LINES: 28->1|33->2|34->3|39->8|39->8|39->8|39->8|39->8
                  -- GENERATED --
              */
          