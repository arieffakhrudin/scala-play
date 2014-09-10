
package views.html.role

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
object role extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[models.Role],Account,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(roles: List[models.Role], session: Account):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.46*/("""

"""),_display_(Seq[Any](/*3.2*/main(session)/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
<header class="panel-heading">
    ROLE LISTS
        <span class="pull-right">
            <a class="btn btn-round btn-success btn-xs" href=""""),_display_(Seq[Any](/*7.64*/routes/*7.70*/.Roles.createRole())),format.raw/*7.89*/("""">Create New Role</a>
        </span>
</header>
<div class="panel-body">
    <table class="table table-bordered table-striped table-condensed">
        <tr>
            <th>ID</th>
            <th>ROLE NAME</th>
            <th>ACTIONS</th>
        </tr>
        """),_display_(Seq[Any](/*17.10*/for(r<-roles) yield /*17.23*/{_display_(Seq[Any](format.raw/*17.24*/("""
        <tr>
            <td>"""),_display_(Seq[Any](/*19.18*/r/*19.19*/.id)),format.raw/*19.22*/("""</td>
            <td>"""),_display_(Seq[Any](/*20.18*/r/*20.19*/.roleName)),format.raw/*20.28*/("""</td>
            <td><a class="btn btn-round btn-primary btn-xs" href=""""),_display_(Seq[Any](/*21.68*/routes/*21.74*/.Roles.editRole(r.id))),format.raw/*21.95*/("""">Edit</a>
                <a class="btn btn-round btn-danger btn-xs" href=""""),_display_(Seq[Any](/*22.67*/routes/*22.73*/.Roles.deleteRole(r.id))),format.raw/*22.96*/("""">Delete</a></td>
        </tr>
        """)))})),format.raw/*24.10*/("""
    </table>
</div>
""")))})))}
    }
    
    def render(roles:List[models.Role],session:Account): play.api.templates.HtmlFormat.Appendable = apply(roles,session)
    
    def f:((List[models.Role],Account) => play.api.templates.HtmlFormat.Appendable) = (roles,session) => apply(roles,session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 10 05:13:43 ICT 2014
                    SOURCE: E:/KANTOR/bukopin/app/views/role/role.scala.html
                    HASH: e2e30e9d5a488edb7f6f5c2a2879c012a22a01dd
                    MATRIX: 797->1|935->45|974->50|995->63|1033->64|1216->212|1230->218|1270->237|1580->511|1609->524|1648->525|1717->558|1727->559|1752->562|1812->586|1822->587|1853->596|1963->670|1978->676|2021->697|2135->775|2150->781|2195->804|2270->847
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|45->17|45->17|45->17|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|52->24
                    -- GENERATED --
                */
            