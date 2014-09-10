
package views.html.profile

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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Account,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(session: Account):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(Seq[Any](/*3.2*/main(session)/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    <div class="panel-body profile-information">
        <div class="col-md-3">
            <div class="profile-pic text-center">
                <img src=""""),_display_(Seq[Any](/*7.28*/routes/*7.34*/.Assets.at("images/lock_thumb.jpg"))),format.raw/*7.69*/("""" alt=""/>
            </div>
        </div>
        <div class="col-md-6">
            <div class="profile-desk">
                <h1>"""),_display_(Seq[Any](/*12.22*/session/*12.29*/.realName)),format.raw/*12.38*/("""</h1>
                <span class="text-muted">as """),_display_(Seq[Any](/*13.46*/for(r <- session.roles) yield /*13.69*/{_display_(Seq[Any](_display_(Seq[Any](/*13.71*/r/*13.72*/.roleName))))})),format.raw/*13.82*/("""</span>
                <br /><br />
                Username: """),_display_(Seq[Any](/*15.28*/session/*15.35*/.username)),format.raw/*15.44*/("""
                Email: """),_display_(Seq[Any](/*16.25*/session/*16.32*/.email)),format.raw/*16.38*/("""<br />
                Security Question: """),_display_(Seq[Any](/*17.37*/session/*17.44*/.securityQuestion)),format.raw/*17.61*/("""<br />
                Security Answer: """),_display_(Seq[Any](/*18.35*/session/*18.42*/.securityAnswer)),format.raw/*18.57*/("""<br /><br />
                <a href="#" class="btn btn-primary btn-round btn-xs">Edit Profile</a>
            </div>
        </div>
        <div class="col-md-3">
            <div class="profile-statistics">
                <h1>1240</h1>
                <p>Tasks</p>
                <h1>45</h1>
                <p>Login Times</p>
                <ul>
                    <li>
                        <a href="#">
                            <i class="fa fa-facebook"></i>
                        </a>
                    </li>
                    <li class="active">
                        <a href="#">
                            <i class="fa fa-twitter"></i>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <i class="fa fa-google-plus"></i>
                        </a>
                    </li>
                </ul>
            </div>
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
                    DATE: Wed Sep 10 05:13:42 ICT 2014
                    SOURCE: E:/KANTOR/bukopin/app/views/profile/index.scala.html
                    HASH: bcdc60f1d88710359a82b8184f6a8d7813928296
                    MATRIX: 783->1|895->19|934->24|955->37|993->38|1190->200|1204->206|1260->241|1437->382|1453->389|1484->398|1572->450|1611->473|1659->475|1669->476|1705->486|1807->552|1823->559|1854->568|1916->594|1932->601|1960->607|2040->651|2056->658|2095->675|2173->717|2189->724|2226->739
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|40->12|40->12|40->12|41->13|41->13|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18
                    -- GENERATED --
                */
            