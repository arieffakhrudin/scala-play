
package views.html

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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Account,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(account: Account):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(Seq[Any](/*3.2*/main(account)/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""

    <header class="panel-heading">
        DASHBOARD
    </header>
    <div class="panel-body">
        <!--mini statistics start-->
        <div class="row">
            <div class="col-md-3">
                <div class="mini-stat clearfix">
                    <span class="mini-stat-icon orange"><i class="fa fa-gavel"></i></span>
                    <div class="mini-stat-info">
                        <span>320</span>
                        New Order Received
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="mini-stat clearfix">
                    <span class="mini-stat-icon tar"><i class="fa fa-tag"></i></span>
                    <div class="mini-stat-info">
                        <span>22,450</span>
                        Copy Sold Today
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="mini-stat clearfix">
                    <span class="mini-stat-icon pink"><i class="fa fa-money"></i></span>
                    <div class="mini-stat-info">
                        <span>34,320</span>
                        Dollar Profit Today
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="mini-stat clearfix">
                    <span class="mini-stat-icon green"><i class="fa fa-eye"></i></span>
                    <div class="mini-stat-info">
                        <span>32720</span>
                        Unique Visitors
                    </div>
                </div>
            </div>
        </div>
        <!--mini statistics end-->
    </div>
""")))})))}
    }
    
    def render(account:Account): play.api.templates.HtmlFormat.Appendable = apply(account)
    
    def f:((Account) => play.api.templates.HtmlFormat.Appendable) = (account) => apply(account)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 09 14:20:54 ICT 2014
                    SOURCE: E:/KANTOR/bukopin/app/views/home.scala.html
                    HASH: 9bdc10d4fcc768744a162855457980b93df315a4
                    MATRIX: 774->1|886->19|925->24|946->37|984->38
                    LINES: 26->1|29->1|31->3|31->3|31->3
                    -- GENERATED --
                */
            