// @SOURCE:E:/KANTOR/bukopin/conf/routes
// @HASH:15169b598f820116ce5f721afb0ffefb6af7a2b7
// @DATE:Tue Sep 09 16:23:47 ICT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Authentication_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Authentication_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Authentication_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:12
private[this] lazy val controllers_Accounts_getAuthentication4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authentication"))))
        

// @LINE:15
private[this] lazy val controllers_Accounts_createAccount5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("account/new"))))
        

// @LINE:16
private[this] lazy val controllers_Accounts_saveAccount6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("account"))))
        

// @LINE:17
private[this] lazy val controllers_Accounts_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("account"))))
        

// @LINE:18
private[this] lazy val controllers_Accounts_editAccount8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("account/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_Accounts_updateAccount9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("account/update"))))
        

// @LINE:20
private[this] lazy val controllers_Accounts_deleteAccount10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("account/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Roles_createRole11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role/new"))))
        

// @LINE:24
private[this] lazy val controllers_Roles_saveRole12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role"))))
        

// @LINE:25
private[this] lazy val controllers_Roles_index13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role"))))
        

// @LINE:26
private[this] lazy val controllers_Roles_editRole14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:27
private[this] lazy val controllers_Roles_updateRole15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role/update"))))
        

// @LINE:28
private[this] lazy val controllers_Roles_deleteRole16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("role/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:31
private[this] lazy val controllers_AccountRole_setRole17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("account/"),DynamicPart("id", """[^/]+""",true),StaticPart("/role"))))
        

// @LINE:32
private[this] lazy val controllers_AccountRole_saveRole18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("account/"),DynamicPart("id", """[^/]+""",true),StaticPart("/role"))))
        

// @LINE:35
private[this] lazy val controllers_Profile_index19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile"))))
        

// @LINE:39
private[this] lazy val controllers_Assets_at20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Authentication.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authentication""","""controllers.Accounts.getAuthentication()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """account/new""","""controllers.Accounts.createAccount()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """account""","""controllers.Accounts.saveAccount()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """account""","""controllers.Accounts.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """account/edit/$id<[^/]+>""","""controllers.Accounts.editAccount(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """account/update""","""controllers.Accounts.updateAccount()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """account/delete/$id<[^/]+>""","""controllers.Accounts.deleteAccount(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role/new""","""controllers.Roles.createRole()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role""","""controllers.Roles.saveRole()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role""","""controllers.Roles.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role/edit/$id<[^/]+>""","""controllers.Roles.editRole(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role/update""","""controllers.Roles.updateRole()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """role/delete/$id<[^/]+>""","""controllers.Roles.deleteRole(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """account/$id<[^/]+>/role""","""controllers.AccountRole.setRole(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """account/$id<[^/]+>/role""","""controllers.AccountRole.saveRole(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile""","""controllers.Profile.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page / default path""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Authentication_login1(params) => {
   call { 
        invokeHandler(controllers.Authentication.login(), HandlerDef(this, "controllers.Authentication", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Authentication_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Authentication.authenticate(), HandlerDef(this, "controllers.Authentication", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Authentication_logout3(params) => {
   call { 
        invokeHandler(controllers.Authentication.logout(), HandlerDef(this, "controllers.Authentication", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:12
case controllers_Accounts_getAuthentication4(params) => {
   call { 
        invokeHandler(controllers.Accounts.getAuthentication(), HandlerDef(this, "controllers.Accounts", "getAuthentication", Nil,"GET", """""", Routes.prefix + """authentication"""))
   }
}
        

// @LINE:15
case controllers_Accounts_createAccount5(params) => {
   call { 
        invokeHandler(controllers.Accounts.createAccount(), HandlerDef(this, "controllers.Accounts", "createAccount", Nil,"GET", """ Account""", Routes.prefix + """account/new"""))
   }
}
        

// @LINE:16
case controllers_Accounts_saveAccount6(params) => {
   call { 
        invokeHandler(controllers.Accounts.saveAccount(), HandlerDef(this, "controllers.Accounts", "saveAccount", Nil,"POST", """""", Routes.prefix + """account"""))
   }
}
        

// @LINE:17
case controllers_Accounts_index7(params) => {
   call { 
        invokeHandler(controllers.Accounts.index(), HandlerDef(this, "controllers.Accounts", "index", Nil,"GET", """""", Routes.prefix + """account"""))
   }
}
        

// @LINE:18
case controllers_Accounts_editAccount8(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Accounts.editAccount(id), HandlerDef(this, "controllers.Accounts", "editAccount", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """account/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_Accounts_updateAccount9(params) => {
   call { 
        invokeHandler(controllers.Accounts.updateAccount(), HandlerDef(this, "controllers.Accounts", "updateAccount", Nil,"POST", """""", Routes.prefix + """account/update"""))
   }
}
        

// @LINE:20
case controllers_Accounts_deleteAccount10(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Accounts.deleteAccount(id), HandlerDef(this, "controllers.Accounts", "deleteAccount", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """account/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Roles_createRole11(params) => {
   call { 
        invokeHandler(controllers.Roles.createRole(), HandlerDef(this, "controllers.Roles", "createRole", Nil,"GET", """ Role""", Routes.prefix + """role/new"""))
   }
}
        

// @LINE:24
case controllers_Roles_saveRole12(params) => {
   call { 
        invokeHandler(controllers.Roles.saveRole(), HandlerDef(this, "controllers.Roles", "saveRole", Nil,"POST", """""", Routes.prefix + """role"""))
   }
}
        

// @LINE:25
case controllers_Roles_index13(params) => {
   call { 
        invokeHandler(controllers.Roles.index(), HandlerDef(this, "controllers.Roles", "index", Nil,"GET", """""", Routes.prefix + """role"""))
   }
}
        

// @LINE:26
case controllers_Roles_editRole14(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Roles.editRole(id), HandlerDef(this, "controllers.Roles", "editRole", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """role/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:27
case controllers_Roles_updateRole15(params) => {
   call { 
        invokeHandler(controllers.Roles.updateRole(), HandlerDef(this, "controllers.Roles", "updateRole", Nil,"POST", """""", Routes.prefix + """role/update"""))
   }
}
        

// @LINE:28
case controllers_Roles_deleteRole16(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Roles.deleteRole(id), HandlerDef(this, "controllers.Roles", "deleteRole", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """role/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:31
case controllers_AccountRole_setRole17(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.AccountRole.setRole(id), HandlerDef(this, "controllers.AccountRole", "setRole", Seq(classOf[Integer]),"GET", """ AccountRole""", Routes.prefix + """account/$id<[^/]+>/role"""))
   }
}
        

// @LINE:32
case controllers_AccountRole_saveRole18(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.AccountRole.saveRole(id), HandlerDef(this, "controllers.AccountRole", "saveRole", Seq(classOf[Integer]),"POST", """""", Routes.prefix + """account/$id<[^/]+>/role"""))
   }
}
        

// @LINE:35
case controllers_Profile_index19(params) => {
   call { 
        invokeHandler(controllers.Profile.index(), HandlerDef(this, "controllers.Profile", "index", Nil,"GET", """ Profile""", Routes.prefix + """profile"""))
   }
}
        

// @LINE:39
case controllers_Assets_at20(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     