
package views.html.account

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object create extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Account,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(session: Account):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(Seq[Any](/*3.2*/main(session)/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    <header class="panel-heading">
        CREATE NEW ACCOUNT
    </header>
    <div class="panel-body">
        <div class="position-left">
            <form action=""""),_display_(Seq[Any](/*9.28*/routes/*9.34*/.Accounts.saveAccount())),format.raw/*9.57*/("""" method="post" class="form-horizontal" role="form">
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Real Name</label>
                    <div class="col-lg-5">
                        <input type="text" name="realName" class="form-control" placeholder="Real Name">
                        <p class="help-block">Enter account real name</p>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Username</label>
                    <div class="col-lg-5">
                        <input type="text" name="username" class="form-control" placeholder="Username">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Email</label>
                    <div class="col-lg-5">
                        <input type="email" name="email" class="form-control" placeholder="Email">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Password</label>
                    <div class="col-lg-5">
                        <input type="password" name="password" class="form-control" placeholder="Password">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Retype Password</label>
                    <div class="col-lg-5">
                        <input type="password" class="form-control" placeholder="Retype Password">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Security Question</label>
                    <div class="col-lg-5">
                        <input type="text" name="securityQuestion" class="form-control" placeholder="Security Question">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Security Answer</label>
                    <div class="col-lg-5">
                        <input type="text" name="securityAnswer" class="form-control" placeholder="Security Answer">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-offset-2 col-lg-5">
                        <button type="submit" class="btn btn-round btn-success btn-xs">Create Account</button>
                        <a href=""""),_display_(Seq[Any](/*56.35*/routes/*56.41*/.Accounts.index)),format.raw/*56.56*/("""" class="btn btn-round btn-warning btn-xs">Cancel</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
""")))})))}
    }
    
    def render(session:Account): play.api.templates.HtmlFormat.Appendable = apply(session)
    
    def f:((Account) => play.api.templates.HtmlFormat.Appendable) = (session) => apply(session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 10 05:17:55 ICT 2014
                    SOURCE: E:/KANTOR/bukopin/app/views/account/create.scala.html
                    HASH: db9786206496745e10aa1e209fc2dbaf8ecd97d1
                    MATRIX: 784->1|896->19|935->24|956->37|994->38|1204->213|1218->219|1262->242|4017->2961|4032->2967|4069->2982
                    LINES: 26->1|29->1|31->3|31->3|31->3|37->9|37->9|37->9|84->56|84->56|84->56
                    -- GENERATED --
                */
            