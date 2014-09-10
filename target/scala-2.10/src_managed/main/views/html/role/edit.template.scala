
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
object edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Role,Account,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(role: Role,session: Account):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""

"""),_display_(Seq[Any](/*3.2*/main(session)/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    <header class="panel-heading">
        EDIT ROLE
    </header>
    <div class="panel-body">
        <div class="position-left">
            <form action=""""),_display_(Seq[Any](/*9.28*/routes/*9.34*/.Roles.updateRole())),format.raw/*9.53*/("""" method="post" class="form-horizontal" role="form">
                <input type="hidden" name="id" value=""""),_display_(Seq[Any](/*10.56*/role/*10.60*/.id)),format.raw/*10.63*/("""" />
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Role Name</label>
                    <div class="col-lg-5">
                        <input type="text" name="roleName" class="form-control" value=""""),_display_(Seq[Any](/*14.89*/role/*14.93*/.roleName)),format.raw/*14.102*/("""">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-offset-2 col-lg-5">
                        <button type="submit" class="btn btn-round btn-success btn-xs">Update Role</button>
                        <a href=""""),_display_(Seq[Any](/*20.35*/routes/*20.41*/.Roles.index)),format.raw/*20.53*/("""" class="btn btn-round btn-warning btn-xs">Cancel</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
""")))})))}
    }
    
    def render(role:Role,session:Account): play.api.templates.HtmlFormat.Appendable = apply(role,session)
    
    def f:((Role,Account) => play.api.templates.HtmlFormat.Appendable) = (role,session) => apply(role,session)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 10 05:17:55 ICT 2014
                    SOURCE: E:/KANTOR/bukopin/app/views/role/edit.scala.html
                    HASH: 8dcb6959d80289571c301dbde7cc41b512d1c2c5
                    MATRIX: 784->1|907->30|946->35|967->48|1005->49|1206->215|1220->221|1260->240|1405->349|1418->353|1443->356|1745->622|1758->626|1790->635|2127->936|2142->942|2176->954
                    LINES: 26->1|29->1|31->3|31->3|31->3|37->9|37->9|37->9|38->10|38->10|38->10|42->14|42->14|42->14|48->20|48->20|48->20
                    -- GENERATED --
                */
            