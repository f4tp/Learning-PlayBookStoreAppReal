
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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*5.54*/routes/*5.60*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*5.102*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("css/style.css")),format.raw/*6.94*/("""">

    </head>
    <body>


    <div class="container">

        <!--
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="colapse" data-target="#exnav">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href=""""),_display_(/*23.31*/routes/*23.37*/.HomeController.index()),format.raw/*23.60*/("""" class="navbar-brand"> BookStore App </a>
            </div>
            <div class="collapse navbar-collapse" id="exnav">
                <ul class="nav navbar-nav navbar-left">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href=""""),_display_(/*28.35*/routes/*28.41*/.BooksController.index()),format.raw/*28.65*/("""">All Books</a></li>
                    <li><a href=""""),_display_(/*29.35*/routes/*29.41*/.BooksController.create()),format.raw/*29.66*/("""">Create Book</a></li>
                </ul>
            </div>


            </div>
        </nav>
        -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href=""""),_display_(/*38.44*/routes/*38.50*/.HomeController.index()),format.raw/*38.73*/("""">BookStore App</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href=""""),_display_(/*46.52*/routes/*46.58*/.BooksController.index()),format.raw/*46.82*/("""">All Books <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href=""""),_display_(/*49.52*/routes/*49.58*/.BooksController.create()),format.raw/*49.83*/("""">Add Book<span class="sr-only">(current)</span></a>
                    </li>
                    <!-- below is the active class - meaning the selected page -->
                    <!--
                    <li class="nav-item">
                        <a class="nav-link active" href="#"> Add Book </a>
                    </li>
                    -->

                    <!-- drop down menu
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Dropdown
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Disabled</a>
                    </li>
                    -->
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>



        """),_display_(/*84.10*/body),format.raw/*84.14*/("""
    """),format.raw/*85.5*/("""</div>


        <script src=""""),_display_(/*88.23*/routes/*88.29*/.Assets.versioned("js/jquery-3.3.1.min.js")),format.raw/*88.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*89.23*/routes/*89.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*89.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*90.23*/routes/*90.29*/.Assets.versioned("js/custom.js")),format.raw/*90.62*/("""" type="text/javascript"></script>
    </body>
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
                  DATE: Wed May 23 12:35:16 BST 2018
                  SOURCE: D:/My Documents/Play Projects/bookstoreapp/app/views/Books/layout.scala.html
                  HASH: a0ae78104ad96fb6177c9aff00889414eed3a97c
                  MATRIX: 960->1|1084->30|1112->32|1175->69|1200->74|1228->75|1317->138|1331->144|1394->186|1477->243|1491->249|1545->283|2123->834|2138->840|2182->863|2493->1147|2508->1153|2553->1177|2636->1233|2651->1239|2697->1264|2956->1496|2971->1502|3015->1525|3582->2065|3597->2071|3642->2095|3846->2272|3861->2278|3907->2303|5628->3997|5653->4001|5686->4007|5747->4041|5762->4047|5826->4090|5911->4148|5926->4154|5987->4194|6072->4252|6087->4258|6141->4291
                  LINES: 28->1|33->1|34->2|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|55->23|55->23|55->23|60->28|60->28|60->28|61->29|61->29|61->29|70->38|70->38|70->38|78->46|78->46|78->46|81->49|81->49|81->49|116->84|116->84|117->85|120->88|120->88|120->88|121->89|121->89|121->89|122->90|122->90|122->90
                  -- GENERATED --
              */
          