
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
object edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Account,Account,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(account: Account,session: Account):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

"""),_display_(Seq[Any](/*3.2*/main(session)/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    <header class="panel-heading">
        EDIT ACCOUNT
    </header>
    <div class="panel-body">
        <div class="position-left">
            <form action=""""),_display_(Seq[Any](/*9.28*/routes/*9.34*/.Accounts.updateAccount())),format.raw/*9.59*/("""" method="post" class="form-horizontal" role="form">
                <input type="hidden" name="id" value=""""),_display_(Seq[Any](/*10.56*/account/*10.63*/.id)),format.raw/*10.66*/("""" />
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Real Name</label>
                    <div class="col-lg-5">
                        <input type="text" name="realName" class="form-control" value=""""),_display_(Seq[Any](/*14.89*/account/*14.96*/.realName)),format.raw/*14.105*/("""">
                        <p class="help-block">Enter account real name</p>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Username</label>
                    <div class="col-lg-5">
                        <input type="text" name="username" class="form-control" value=""""),_display_(Seq[Any](/*21.89*/account/*21.96*/.username)),format.raw/*21.105*/("""">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Email</label>
                    <div class="col-lg-5">
                        <input type="email" name="email" class="form-control" value=""""),_display_(Seq[Any](/*27.87*/account/*27.94*/.email)),format.raw/*27.100*/("""">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Security Question</label>
                    <div class="col-lg-5">
                        <input type="text" name="securityQuestion" class="form-control" value=""""),_display_(Seq[Any](/*33.97*/account/*33.104*/.securityQuestion)),format.raw/*33.121*/("""">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Security Answer</label>
                    <div class="col-lg-5">
                        <input type="text" name="securityAnswer" class="form-control" value=""""),_display_(Seq[Any](/*39.95*/account/*39.102*/.securityAnswer)),format.raw/*39.117*/("""">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-offset-2 col-lg-5">
                        <button type="submit" class="btn btn-round btn-success btn-xs">Update Account</button>
                        <a href=""""),_display_(Seq[Any](/*45.35*/routes/*45.41*/.Accounts.index)),format.raw/*45.56*/("""" class="btn btn-round btn-warning btn-xs">Cancel</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
""")))})))}
    }
    
    def render(account:Account,session:Account): play.api.templates.HtmlFormat.Appendable = apply(account,session)
    
    def f:((Account,Account) => play.api.templates.HtmlFormat.Appendable) = (account,session) => apply(account,session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 10 05:17:55 ICT 2014
                    SOURCE: E:/KANTOR/bukopin/app/views/account/edit.scala.html
                    HASH: 31f9120e0b1e90abe415b87e4197a0729975de20
                    MATRIX: 790->1|919->36|958->41|979->54|1017->55|1221->224|1235->230|1281->255|1426->364|1442->371|1467->374|1769->640|1785->647|1817->656|2243->1046|2259->1053|2291->1062|2637->1372|2653->1379|2682->1385|3050->1717|3067->1724|3107->1741|3471->2069|3488->2076|3526->2091|3866->2395|3881->2401|3918->2416
                    LINES: 26->1|29->1|31->3|31->3|31->3|37->9|37->9|37->9|38->10|38->10|38->10|42->14|42->14|42->14|49->21|49->21|49->21|55->27|55->27|55->27|61->33|61->33|61->33|67->39|67->39|67->39|73->45|73->45|73->45
                    -- GENERATED --
                */
            