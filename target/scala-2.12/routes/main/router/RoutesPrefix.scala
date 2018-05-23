// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/bookstoreapp/conf/routes
// @DATE:Wed May 23 11:53:44 BST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
