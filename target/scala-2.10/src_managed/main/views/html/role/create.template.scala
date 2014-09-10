
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
object create extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Account,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(session: Account):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(Seq[Any](/*3.2*/main(session)/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    <header class="panel-heading">
        CREATE NEW ROLE
    </header>
    <div class="panel-body">
        <div class="position-left">
            <form action=""""),_display_(Seq[Any](/*9.28*/routes/*9.34*/.Roles.saveRole())),format.raw/*9.51*/("""" method="post" class="form-horizontal" role="form">
                <div class="form-group">
                    <label class="col-lg-2 col-sm-2 control-label">Role Name</label>
                    <div class="col-lg-5">
                        <input type="text" name="roleName" class="form-control" placeholder="Role Name">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-offset-2 col-lg-5">
                        <button type="submit" class="btn btn-round btn-success btn-xs">Create Role</button>
                        <a href=""""),_display_(Seq[Any](/*19.35*/routes/*19.41*/.Roles.index)),format.raw/*19.53*/("""" class="btn btn-round btn-warning btn-xs">Cancel</a>
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
                    SOURCE: E:/KANTOR/bukopin/app/views/role/create.scala.html
                    HASH: bb009571cdec88038bb52bfa7954169b6ac0608d
                    MATRIX: 781->1|893->19|932->24|953->37|991->38|1198->210|1212->216|1250->233|1915->862|1930->868|1964->880
                    LINES: 26->1|29->1|31->3|31->3|31->3|37->9|37->9|37->9|47->19|47->19|47->19
                    -- GENERATED --
                */
            