// @SOURCE:E:/KANTOR/bukopin/conf/routes
// @HASH:15169b598f820116ce5f721afb0ffefb6af7a2b7
// @DATE:Tue Sep 09 16:23:47 ICT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:39
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseAuthentication {
    

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:10
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:35
class ReverseProfile {
    

// @LINE:35
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                                                
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
class ReverseAccounts {
    

// @LINE:15
def createAccount(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "account/new")
}
                                                

// @LINE:19
def updateAccount(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "account/update")
}
                                                

// @LINE:16
def saveAccount(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "account")
}
                                                

// @LINE:12
def getAuthentication(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authentication")
}
                                                

// @LINE:18
def editAccount(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "account/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:17
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "account")
}
                                                

// @LINE:20
def deleteAccount(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "account/delete/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:32
// @LINE:31
class ReverseAccountRole {
    

// @LINE:31
def setRole(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "account/" + implicitly[PathBindable[Integer]].unbind("id", id) + "/role")
}
                                                

// @LINE:32
def saveRole(id:Integer): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "account/" + implicitly[PathBindable[Integer]].unbind("id", id) + "/role")
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
class ReverseRoles {
    

// @LINE:26
def editRole(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "role/edit/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:23
def createRole(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "role/new")
}
                                                

// @LINE:27
def updateRole(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "role/update")
}
                                                

// @LINE:24
def saveRole(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "role")
}
                                                

// @LINE:28
def deleteRole(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "role/delete/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:25
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "role")
}
                                                
    
}
                          
}
                  


// @LINE:39
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseAuthentication {
    

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:35
class ReverseProfile {
    

// @LINE:35
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Profile.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        
    
}
              

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
class ReverseAccounts {
    

// @LINE:15
def createAccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.createAccount",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/new"})
      }
   """
)
                        

// @LINE:19
def updateAccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.updateAccount",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/update"})
      }
   """
)
                        

// @LINE:16
def saveAccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.saveAccount",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account"})
      }
   """
)
                        

// @LINE:12
def getAuthentication : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.getAuthentication",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authentication"})
      }
   """
)
                        

// @LINE:18
def editAccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.editAccount",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:17
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account"})
      }
   """
)
                        

// @LINE:20
def deleteAccount : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Accounts.deleteAccount",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/delete/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:32
// @LINE:31
class ReverseAccountRole {
    

// @LINE:31
def setRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountRole.setRole",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id) + "/role"})
      }
   """
)
                        

// @LINE:32
def saveRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountRole.saveRole",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id) + "/role"})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
class ReverseRoles {
    

// @LINE:26
def editRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.editRole",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "role/edit/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:23
def createRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.createRole",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "role/new"})
      }
   """
)
                        

// @LINE:27
def updateRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.updateRole",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "role/update"})
      }
   """
)
                        

// @LINE:24
def saveRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.saveRole",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "role"})
      }
   """
)
                        

// @LINE:28
def deleteRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.deleteRole",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "role/delete/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:25
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Roles.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "role"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:39
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:39
class ReverseAssets {
    

// @LINE:39
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseAuthentication {
    

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.logout(), HandlerDef(this, "controllers.Authentication", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:10
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.authenticate(), HandlerDef(this, "controllers.Authentication", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.login(), HandlerDef(this, "controllers.Authentication", "login", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:35
class ReverseProfile {
    

// @LINE:35
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Profile.index(), HandlerDef(this, "controllers.Profile", "index", Seq(), "GET", """ Profile""", _prefix + """profile""")
)
                      
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
class ReverseAccounts {
    

// @LINE:15
def createAccount(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.createAccount(), HandlerDef(this, "controllers.Accounts", "createAccount", Seq(), "GET", """ Account""", _prefix + """account/new""")
)
                      

// @LINE:19
def updateAccount(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.updateAccount(), HandlerDef(this, "controllers.Accounts", "updateAccount", Seq(), "POST", """""", _prefix + """account/update""")
)
                      

// @LINE:16
def saveAccount(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.saveAccount(), HandlerDef(this, "controllers.Accounts", "saveAccount", Seq(), "POST", """""", _prefix + """account""")
)
                      

// @LINE:12
def getAuthentication(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.getAuthentication(), HandlerDef(this, "controllers.Accounts", "getAuthentication", Seq(), "GET", """""", _prefix + """authentication""")
)
                      

// @LINE:18
def editAccount(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.editAccount(id), HandlerDef(this, "controllers.Accounts", "editAccount", Seq(classOf[Integer]), "GET", """""", _prefix + """account/edit/$id<[^/]+>""")
)
                      

// @LINE:17
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.index(), HandlerDef(this, "controllers.Accounts", "index", Seq(), "GET", """""", _prefix + """account""")
)
                      

// @LINE:20
def deleteAccount(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Accounts.deleteAccount(id), HandlerDef(this, "controllers.Accounts", "deleteAccount", Seq(classOf[Integer]), "GET", """""", _prefix + """account/delete/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:32
// @LINE:31
class ReverseAccountRole {
    

// @LINE:31
def setRole(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountRole.setRole(id), HandlerDef(this, "controllers.AccountRole", "setRole", Seq(classOf[Integer]), "GET", """ AccountRole""", _prefix + """account/$id<[^/]+>/role""")
)
                      

// @LINE:32
def saveRole(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountRole.saveRole(id), HandlerDef(this, "controllers.AccountRole", "saveRole", Seq(classOf[Integer]), "POST", """""", _prefix + """account/$id<[^/]+>/role""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page / default path""", _prefix + """""")
)
                      
    
}
                          

// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
class ReverseRoles {
    

// @LINE:26
def editRole(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.editRole(id), HandlerDef(this, "controllers.Roles", "editRole", Seq(classOf[Integer]), "GET", """""", _prefix + """role/edit/$id<[^/]+>""")
)
                      

// @LINE:23
def createRole(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.createRole(), HandlerDef(this, "controllers.Roles", "createRole", Seq(), "GET", """ Role""", _prefix + """role/new""")
)
                      

// @LINE:27
def updateRole(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.updateRole(), HandlerDef(this, "controllers.Roles", "updateRole", Seq(), "POST", """""", _prefix + """role/update""")
)
                      

// @LINE:24
def saveRole(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.saveRole(), HandlerDef(this, "controllers.Roles", "saveRole", Seq(), "POST", """""", _prefix + """role""")
)
                      

// @LINE:28
def deleteRole(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.deleteRole(id), HandlerDef(this, "controllers.Roles", "deleteRole", Seq(classOf[Integer]), "GET", """""", _prefix + """role/delete/$id<[^/]+>""")
)
                      

// @LINE:25
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Roles.index(), HandlerDef(this, "controllers.Roles", "index", Seq(), "GET", """""", _prefix + """role""")
)
                      
    
}
                          
}
        
    