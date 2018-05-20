
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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title : String)(body : Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.1*/("""<html>
    <head>
        <title> """),_display_(/*4.18*/title),format.raw/*4.23*/(""" """),format.raw/*4.24*/("""</title>
    </head>
    <body>
        """),_display_(/*7.10*/body),format.raw/*7.14*/("""
    """),format.raw/*8.5*/("""</body>
</html>

"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 20 13:01:41 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/Books/layout.scala.html
                  HASH: 96018bc635274ae0ba1e12b57312653601e3cdf8
                  MATRIX: 960->1|1084->30|1112->32|1175->69|1200->74|1228->75|1298->119|1322->123|1354->129
                  LINES: 28->1|33->1|34->2|36->4|36->4|36->4|39->7|39->7|40->8
                  -- GENERATED --
              */
          