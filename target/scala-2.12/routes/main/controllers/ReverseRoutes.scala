// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/bookstoreapp/conf/routes
// @DATE:Tue May 15 13:01:01 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:21
    def welcome(namer:String, lastnamer:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "welcome/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("namer", namer)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("lastnamer", lastnamer)))
    }
  
    // @LINE:19
    def welcomeAgain(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "welcomeAgain/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:26
  class ReverseBooksController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def edit(idOfBook:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("idOfBook", idOfBook)))
    }
  
    // @LINE:27
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/create")
    }
  
    // @LINE:29
    def show(idOfBook:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("idOfBook", idOfBook)))
    }
  
    // @LINE:35
    def destroy(idOfBook:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("idOfBook", idOfBook)))
    }
  
    // @LINE:33
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books/create")
    }
  
    // @LINE:32
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books/edit")
    }
  
    // @LINE:26
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books")
    }
  
  }


}
