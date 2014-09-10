
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
object account extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[models.Account],Account,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(accounts: List[models.Account], session: Account):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.52*/("""

"""),_display_(Seq[Any](/*3.2*/main(session)/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    <header class="panel-heading">
        ACCOUNT LISTS
        <span class="pull-right">
            <a class="btn btn-round btn-success btn-xs" href=""""),_display_(Seq[Any](/*7.64*/routes/*7.70*/.Accounts.createAccount())),format.raw/*7.95*/("""">Create New Account</a>
        </span>
    </header>
    <div class="panel-body">
        <table class="table table-bordered table-striped table-condensed">
            <tr>
                <th>ID</th>
                <th>REAL NAME</th>
                <th>USERNAME</th>
                <th>EMAIL</th>
                <th>ROLE</th>
                <th>ACTIONS</th>
            </tr>
            """),_display_(Seq[Any](/*20.14*/for(a<-accounts) yield /*20.30*/{_display_(Seq[Any](format.raw/*20.31*/("""
            <tr>
                <td>"""),_display_(Seq[Any](/*22.22*/a/*22.23*/.id)),format.raw/*22.26*/("""</td>
                <td>"""),_display_(Seq[Any](/*23.22*/a/*23.23*/.realName)),format.raw/*23.32*/("""</td>
                <td>"""),_display_(Seq[Any](/*24.22*/a/*24.23*/.username)),format.raw/*24.32*/("""</td>
                <td>"""),_display_(Seq[Any](/*25.22*/a/*25.23*/.email)),format.raw/*25.29*/("""</td>
                <td>
                    """),_display_(Seq[Any](/*27.22*/if(a.roles.isEmpty)/*27.41*/{_display_(Seq[Any](format.raw/*27.42*/("""
                        <a href=""""),_display_(Seq[Any](/*28.35*/routes/*28.41*/.AccountRole.setRole(a.id))),format.raw/*28.67*/("""" class="btn btn-round btn-warning btn-xs">Set Role</a>
                    """)))}/*29.22*/else/*29.26*/{_display_(Seq[Any](format.raw/*29.27*/("""
                        """),_display_(Seq[Any](/*30.26*/for(r<-a.roles) yield /*30.41*/{_display_(Seq[Any](_display_(Seq[Any](/*30.43*/r/*30.44*/.roleName)),format.raw/*30.53*/(""" <a href=""""),_display_(Seq[Any](/*30.64*/routes/*30.70*/.AccountRole.setRole(a.id))),format.raw/*30.96*/("""" class="btn btn-round btn-warning btn-xs">Change</a>""")))})),format.raw/*30.150*/("""
                    """)))})),format.raw/*31.22*/("""
                </td>
                <td><a class="btn btn-round btn-primary btn-xs" href=""""),_display_(Seq[Any](/*33.72*/routes/*33.78*/.Accounts.editAccount(a.id))),format.raw/*33.105*/("""">Edit</a>
                    <a class="btn btn-round btn-danger btn-xs" href=""""),_display_(Seq[Any](/*34.71*/routes/*34.77*/.Accounts.deleteAccount(a.id))),format.raw/*34.106*/("""">Delete</a></td>
            </tr>
            """)))})),format.raw/*36.14*/("""
        </table>
    </div>
""")))})))}
    }
    
    def render(accounts:List[models.Account],session:Account): play.api.templates.HtmlFormat.Appendable = apply(accounts,session)
    
    def f:((List[models.Account],Account) => play.api.templates.HtmlFormat.Appendable) = (accounts,session) => apply(accounts,session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 10 05:13:42 ICT 2014
                    SOURCE: E:/KANTOR/bukopin/app/views/account/account.scala.html
                    HASH: 84fcb5d9896ad418ab237a7de2901a7dcb529aaa
                    MATRIX: 806->1|950->51|989->56|1010->69|1048->70|1242->229|1256->235|1302->260|1749->671|1781->687|1820->688|1897->729|1907->730|1932->733|1996->761|2006->762|2037->771|2101->799|2111->800|2142->809|2206->837|2216->838|2244->844|2330->894|2358->913|2397->914|2469->950|2484->956|2532->982|2629->1060|2642->1064|2681->1065|2744->1092|2775->1107|2823->1109|2833->1110|2864->1119|2911->1130|2926->1136|2974->1162|3061->1216|3116->1239|3248->1335|3263->1341|3313->1368|3431->1450|3446->1456|3498->1485|3581->1536
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|48->20|48->20|48->20|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|58->30|58->30|58->30|58->30|58->30|58->30|59->31|61->33|61->33|61->33|62->34|62->34|62->34|64->36
                    -- GENERATED --
                */
            