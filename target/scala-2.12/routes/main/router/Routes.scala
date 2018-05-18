// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/bookstoreapp/conf/routes
// @DATE:Tue May 15 13:01:01 BST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:13
  Assets_1: controllers.Assets,
  // @LINE:26
  BooksController_2: controllers.BooksController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:13
    Assets_1: controllers.Assets,
    // @LINE:26
    BooksController_2: controllers.BooksController
  ) = this(errorHandler, HomeController_0, Assets_1, BooksController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, BooksController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """welcomeAgain/""" + "$" + """name<[^/]+>""", """controllers.HomeController.welcomeAgain(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """welcome/""" + "$" + """namer<[^/]+>/""" + "$" + """lastnamer<[^/]+>""", """controllers.HomeController.welcome(namer:String, lastnamer:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BooksController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """idOfBook<[^/]+>""", """controllers.BooksController.show(idOfBook:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit/""" + "$" + """idOfBook<[^/]+>""", """controllers.BooksController.edit(idOfBook:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit""", """controllers.BooksController.update()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BooksController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/delete/""" + "$" + """idOfBook<[^/]+>""", """controllers.BooksController.destroy(idOfBook:Integer)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_about2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about2_invoker = createInvoker(
    HomeController_0.about(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """my routes made underneath""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_welcomeAgain3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("welcomeAgain/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_welcomeAgain3_invoker = createInvoker(
    HomeController_0.welcomeAgain(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "welcomeAgain",
      Seq(classOf[String]),
      "GET",
      this.prefix + """welcomeAgain/""" + "$" + """name<[^/]+>""",
      """has a variable called name   passing this method a string variable called name""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_welcome4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("welcome/"), DynamicPart("namer", """[^/]+""",true), StaticPart("/"), DynamicPart("lastnamer", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_welcome4_invoker = createInvoker(
    HomeController_0.welcome(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "welcome",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """welcome/""" + "$" + """namer<[^/]+>/""" + "$" + """lastnamer<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_BooksController_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_index5_invoker = createInvoker(
    BooksController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "index",
      Nil,
      "GET",
      this.prefix + """books""",
      """new books controller class routes
any that require arguments have after those that don't, the tutorial flagged up an error with this""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_BooksController_create6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BooksController_create6_invoker = createInvoker(
    BooksController_2.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "create",
      Nil,
      "GET",
      this.prefix + """books/create""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_BooksController_show7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("idOfBook", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_show7_invoker = createInvoker(
    BooksController_2.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/""" + "$" + """idOfBook<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_BooksController_edit8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit/"), DynamicPart("idOfBook", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_edit8_invoker = createInvoker(
    BooksController_2.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/edit/""" + "$" + """idOfBook<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_BooksController_update9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit")))
  )
  private[this] lazy val controllers_BooksController_update9_invoker = createInvoker(
    BooksController_2.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "update",
      Nil,
      "POST",
      this.prefix + """books/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_BooksController_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BooksController_save10_invoker = createInvoker(
    BooksController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "save",
      Nil,
      "POST",
      this.prefix + """books/create""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_BooksController_destroy11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/delete/"), DynamicPart("idOfBook", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_destroy11_invoker = createInvoker(
    BooksController_2.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/delete/""" + "$" + """idOfBook<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:13
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_HomeController_about2_route(params@_) =>
      call { 
        controllers_HomeController_about2_invoker.call(HomeController_0.about())
      }
  
    // @LINE:19
    case controllers_HomeController_welcomeAgain3_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HomeController_welcomeAgain3_invoker.call(HomeController_0.welcomeAgain(name))
      }
  
    // @LINE:21
    case controllers_HomeController_welcome4_route(params@_) =>
      call(params.fromPath[String]("namer", None), params.fromPath[String]("lastnamer", None)) { (namer, lastnamer) =>
        controllers_HomeController_welcome4_invoker.call(HomeController_0.welcome(namer, lastnamer))
      }
  
    // @LINE:26
    case controllers_BooksController_index5_route(params@_) =>
      call { 
        controllers_BooksController_index5_invoker.call(BooksController_2.index())
      }
  
    // @LINE:27
    case controllers_BooksController_create6_route(params@_) =>
      call { 
        controllers_BooksController_create6_invoker.call(BooksController_2.create())
      }
  
    // @LINE:29
    case controllers_BooksController_show7_route(params@_) =>
      call(params.fromPath[Integer]("idOfBook", None)) { (idOfBook) =>
        controllers_BooksController_show7_invoker.call(BooksController_2.show(idOfBook))
      }
  
    // @LINE:30
    case controllers_BooksController_edit8_route(params@_) =>
      call(params.fromPath[Integer]("idOfBook", None)) { (idOfBook) =>
        controllers_BooksController_edit8_invoker.call(BooksController_2.edit(idOfBook))
      }
  
    // @LINE:32
    case controllers_BooksController_update9_route(params@_) =>
      call { 
        controllers_BooksController_update9_invoker.call(BooksController_2.update())
      }
  
    // @LINE:33
    case controllers_BooksController_save10_route(params@_) =>
      call { 
        controllers_BooksController_save10_invoker.call(BooksController_2.save())
      }
  
    // @LINE:35
    case controllers_BooksController_destroy11_route(params@_) =>
      call(params.fromPath[Integer]("idOfBook", None)) { (idOfBook) =>
        controllers_BooksController_destroy11_invoker.call(BooksController_2.destroy(idOfBook))
      }
  }
}
