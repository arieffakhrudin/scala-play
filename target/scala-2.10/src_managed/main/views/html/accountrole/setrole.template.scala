
package views.html.accountrole

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
object setrole extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Role],Account,Account,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(roles: List[Role], account: Account, session: Account):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.57*/("""

"""),_display_(Seq[Any](/*3.2*/main(session)/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
<header class="panel-heading">
    SET ROLE FOR THIS ACCOUNT
</header>
<div class="panel-body">

    <table class="table table-invoice" >
        <thead>
            <tr>
                <th style="width: 20%;">Real Name</th>
                <th><h4>"""),_display_(Seq[Any](/*13.26*/account/*13.33*/.realName)),format.raw/*13.42*/("""</h4></th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Account ID</td>
                <td>"""),_display_(Seq[Any](/*19.22*/account/*19.29*/.id)),format.raw/*19.32*/("""</td>
            </tr>
            <tr>
                <td>Email</td>
                <td>"""),_display_(Seq[Any](/*23.22*/account/*23.29*/.email)),format.raw/*23.35*/("""</td>
            </tr>
            <tr>
                <td>Security Question</td>
                <td>"""),_display_(Seq[Any](/*27.22*/account/*27.29*/.securityQuestion)),format.raw/*27.46*/("""</td>
            </tr>
            <tr>
                <td>Security Answer</td>
                <td>"""),_display_(Seq[Any](/*31.22*/account/*31.29*/.securityAnswer)),format.raw/*31.44*/("""</td>
            </tr>
        </tbody>
    </table>

    <hr />

    <div class="position-left">
        <form action=""""),_display_(Seq[Any](/*39.24*/routes/*39.30*/.AccountRole.saveRole(account.id))),format.raw/*39.63*/("""" method="post" class="form-horizontal" role="form">
            <!--
            <div class="controls">
                """),_display_(Seq[Any](/*42.18*/for(r <- roles) yield /*42.33*/ {_display_(Seq[Any](format.raw/*42.35*/("""
                <label class="checkbox">
                    <input type="checkbox" name="roles[]" value=""""),_display_(Seq[Any](/*44.67*/r/*44.68*/.id)),format.raw/*44.71*/("""" />
                    """),_display_(Seq[Any](/*45.22*/r/*45.23*/.roleName)),format.raw/*45.32*/("""
                </label>
                """)))})),format.raw/*47.18*/("""
            </div>
            -->
            <div class="form-group">
                <label class="col-lg-2 col-sm-2 control-label">Role Name</label>
                <div class="col-lg-5">
                    <select name="id" class="form-control">
                        """),_display_(Seq[Any](/*54.26*/for(r <- roles) yield /*54.41*/{_display_(Seq[Any](format.raw/*54.42*/("""
                            <option value=""""),_display_(Seq[Any](/*55.45*/r/*55.46*/.id)),format.raw/*55.49*/("""">"""),_display_(Seq[Any](/*55.52*/r/*55.53*/.roleName)),format.raw/*55.62*/("""</option>
                        """)))})),format.raw/*56.26*/("""
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-2 col-lg-5">
                    <button type="submit" class="btn btn-success btn-round btn-xs">Save Role</button>
                    <a href=""""),_display_(Seq[Any](/*63.31*/routes/*63.37*/.Accounts.index)),format.raw/*63.52*/("""" class="btn btn-warning btn-round btn-xs">Cancel</a>
                </div>
            </div>
        </form>
    </div>

</div>
""")))})))}
    }
    
    def render(roles:List[Role],account:Account,session:Account): play.api.templates.HtmlFormat.Appendable = apply(roles,account,session)
    
    def f:((List[Role],Account,Account) => play.api.templates.HtmlFormat.Appendable) = (roles,account,session) => apply(roles,account,session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 10 05:14:10 ICT 2014
                    SOURCE: E:/KANTOR/bukopin/app/views/accountrole/setrole.scala.html
                    HASH: be3368d18753d4dbd598421eab424b11399b1e47
                    MATRIX: 808->1|957->56|996->61|1017->74|1055->75|1353->337|1369->344|1400->353|1578->495|1594->502|1619->505|1752->602|1768->609|1796->615|1941->724|1957->731|1996->748|2139->855|2155->862|2192->877|2358->1007|2373->1013|2428->1046|2589->1171|2620->1186|2660->1188|2806->1298|2816->1299|2841->1302|2904->1329|2914->1330|2945->1339|3022->1384|3343->1669|3374->1684|3413->1685|3495->1731|3505->1732|3530->1735|3569->1738|3579->1739|3610->1748|3678->1784|4018->2088|4033->2094|4070->2109
                    LINES: 26->1|29->1|31->3|31->3|31->3|41->13|41->13|41->13|47->19|47->19|47->19|51->23|51->23|51->23|55->27|55->27|55->27|59->31|59->31|59->31|67->39|67->39|67->39|70->42|70->42|70->42|72->44|72->44|72->44|73->45|73->45|73->45|75->47|82->54|82->54|82->54|83->55|83->55|83->55|83->55|83->55|83->55|84->56|91->63|91->63|91->63
                    -- GENERATED --
                */
            