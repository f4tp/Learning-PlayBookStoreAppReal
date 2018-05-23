
package views.html

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
/*1.2*/import views.html.Books.layout

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/layout("Create Book")/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
  """),format.raw/*3.3*/("""<div class="container">
    <div class="jumbotron">
      <h1> Welcome to BookStore App </h1>
      <h3> Built using Play Framework 2.6 </h3>
    </div>
  </div>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed May 23 12:41:24 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/index.scala.html
                  HASH: ae1fd10f270b6e7dda0a0a6cca41ab400d47f5a9
                  MATRIX: 651->1|1068->34|1097->55|1135->56|1165->60
                  LINES: 24->1|34->2|34->2|34->2|35->3
                  -- GENERATED --
              */
          