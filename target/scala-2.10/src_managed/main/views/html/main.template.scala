
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Account,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(account: Account)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.35*/("""

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Bukopin Card Management System">
    <meta name="author" content="MAF">
    <link rel="shortcut icon" href="images/favicon.png">

    <title>CMS Bukopin</title>

    <!--Core CSS -->
    <link href=""""),_display_(Seq[Any](/*16.18*/routes/*16.24*/.Assets.at("bs3/css/bootstrap.min.css"))),format.raw/*16.63*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*17.18*/routes/*17.24*/.Assets.at("stylesheets/bootstrap-reset.css"))),format.raw/*17.69*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*18.18*/routes/*18.24*/.Assets.at("font-awesome/css/font-awesome.css"))),format.raw/*18.71*/("""" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href=""""),_display_(Seq[Any](/*21.18*/routes/*21.24*/.Assets.at("stylesheets/style.css"))),format.raw/*21.59*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*22.18*/routes/*22.24*/.Assets.at("stylesheets/style-responsive.css"))),format.raw/*22.70*/("""" rel="stylesheet" />

</head>

<body>

<section id="container" >
<!--header start-->
<header class="header fixed-top clearfix">
<!--logo start-->
<div class="brand">

    <a href=""""),_display_(Seq[Any](/*34.15*/routes/*34.21*/.Application.index)),format.raw/*34.39*/("""" class="logo">
        <img src=""""),_display_(Seq[Any](/*35.20*/routes/*35.26*/.Assets.at("images/bukopin.png"))),format.raw/*35.58*/("""" width="170px" alt="">
    </a>
    <div class="sidebar-toggle-box">
        <div class="fa fa-bars"></div>
    </div>
</div>
<!--logo end-->

<div class="nav notify-row" id="top_menu">
    Card Management System Bukopin - Java Application with Play Framework 2.x, Scala, and Postgresql Database
</div>
<div class="top-nav clearfix">
    <!--search & user info start-->
    <ul class="nav pull-right top-menu">
        <li>
            <input type="text" class="form-control search" placeholder=" Search">
        </li>
        <!-- user login dropdown start-->
        <li class="dropdown">
            <a data-toggle="dropdown" class="dropdown-toggle icon-user" href="#">
                <!--<img alt="" src="images/avatar1_small.jpg">-->
                <i class="fa fa-user"></i>
                <span class="username">"""),_display_(Seq[Any](/*57.41*/account/*57.48*/.realName)),format.raw/*57.57*/("""</span>
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu extended logout">
                <li><a href=""""),_display_(Seq[Any](/*61.31*/routes/*61.37*/.Profile.index)),format.raw/*61.51*/(""""><i class=" fa fa-suitcase"></i>Profile</a></li>
                <li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
                <li><a href=""""),_display_(Seq[Any](/*63.31*/routes/*63.37*/.Authentication.logout)),format.raw/*63.59*/(""""><i class="fa fa-key"></i> Log Out</a></li>
            </ul>
        </li>
        <!-- user login dropdown end -->
        <!--
        <li>
            <div class="toggle-right-box">
                <div class="fa fa-bars"></div>
            </div>
        </li>
        -->
    </ul>
    <!--search & user info end-->
</div>
</header>
<!--header end-->
<aside>
    <div id="sidebar" class="nav-collapse">
        <!-- sidebar menu start-->            <div class="leftside-navigation">
        <ul class="sidebar-menu" id="nav-accordion">
            <li>
                <a href=""""),_display_(Seq[Any](/*84.27*/routes/*84.33*/.Application.index)),format.raw/*84.51*/("""">
                    <i class="fa fa-home"></i>
                    <span>Dashboard</span>
                </a>
            </li>
            <li>
                <a href=""""),_display_(Seq[Any](/*90.27*/routes/*90.33*/.Accounts.index)),format.raw/*90.48*/("""">
                    <i class="fa fa-gear"></i>
                    <span>Accounts</span>
                </a>
                <ul class="sub">
                    <li><a href=""""),_display_(Seq[Any](/*95.35*/routes/*95.41*/.Accounts.index)),format.raw/*95.56*/("""">Account</a></li>
                    <li><a href=""""),_display_(Seq[Any](/*96.35*/routes/*96.41*/.Roles.index)),format.raw/*96.53*/("""">Role</a></li>
                </ul>
            </li>
            <li>
                <a href="index.html">
                    <i class="fa fa-gear"></i>
                    <span>Administration</span>
                </a>
            </li>
            <li>
                <a href="index.html">
                    <i class="fa fa-group"></i>
                    <span>Data Acquisition</span>
                </a>
            </li>
            <li>
                <a href="index.html">
                    <i class="fa fa-sitemap"></i>
                    <span>Perso</span>
                </a>
            </li>
            <li>
                <a href="index.html">
                    <i class="fa fa-credit-card"></i>
                    <span>Card Management</span>
                </a>
            </li>
            <li>
                <a href="index.html">
                    <i class="fa fa-external-link-square"></i>
                    <span>Transaction</span>
                </a>
            </li>
            <!--
            <li class="sub-menu">
                <a href="javascript:;">
                    <i class="fa fa-laptop"></i>
                    <span>Administration</span>
                </a>
                <ul class="sub">
                    <li><a href="boxed_page.html">Boxed Page</a></li>
                    <li><a href="horizontal_menu.html">Horizontal Menu</a></li>
                    <li><a href="language_switch.html">Language Switch Bar</a></li>
                </ul>
            </li>
            -->
        </ul></div>
        <!-- sidebar menu end-->
    </div>
</aside>
<!--sidebar end-->
<!--main content start-->
<section id="main-content">
    <section class="wrapper">
        <!-- page start-->

        <div class="row">
            <div class="col-sm-12">
                <section class="panel">
                    """),_display_(Seq[Any](/*155.22*/content)),format.raw/*155.29*/("""
                </section>
            </div>
        </div>
        <!-- page end-->
    </section>
</section>
<!--main content end-->
<!--right sidebar start-->
<div class="right-sidebar">
<div class="search-row">
    <input type="text" placeholder="Search" class="form-control">
</div>
<div class="right-stat-bar">
<ul class="right-side-accordion">
<li class="widget-collapsible">
    <a href="#" class="head widget-head red-bg active clearfix">
        <span class="pull-left">work progress (5)</span>
        <span class="pull-right widget-collapse"><i class="ico-minus"></i></span>
    </a>
    <ul class="widget-container">
        <li>
            <div class="prog-row side-mini-stat clearfix">
                <div class="side-graph-info">
                    <h4>Target sell</h4>
                    <p>
                        25%, Deadline 12 june 13
                    </p>
                </div>
                <div class="side-mini-graph">
                    <div class="target-sell">
                    </div>
                </div>
            </div>
            <div class="prog-row side-mini-stat">
                <div class="side-graph-info">
                    <h4>product delivery</h4>
                    <p>
                        55%, Deadline 12 june 13
                    </p>
                </div>
                <div class="side-mini-graph">
                    <div class="p-delivery">
                        <div class="sparkline" data-type="bar" data-resize="true" data-height="30" data-width="90%" data-bar-color="#39b7ab" data-bar-width="5" data-data="[200,135,667,333,526,996,564,123,890,564,455]">
                        </div>
                    </div>
                </div>
            </div>
            <div class="prog-row side-mini-stat">
                <div class="side-graph-info payment-info">
                    <h4>payment collection</h4>
                    <p>
                        25%, Deadline 12 june 13
                    </p>
                </div>
                <div class="side-mini-graph">
                    <div class="p-collection">
						<span class="pc-epie-chart" data-percent="45">
						<span class="percent"></span>
						</span>
                    </div>
                </div>
            </div>
            <div class="prog-row side-mini-stat">
                <div class="side-graph-info">
                    <h4>delivery pending</h4>
                    <p>
                        44%, Deadline 12 june 13
                    </p>
                </div>
                <div class="side-mini-graph">
                    <div class="d-pending">
                    </div>
                </div>
            </div>
            <div class="prog-row side-mini-stat">
                <div class="col-md-12">
                    <h4>total progress</h4>
                    <p>
                        50%, Deadline 12 june 13
                    </p>
                    <div class="progress progress-xs mtop10">
                        <div style="width: 50%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="20" role="progressbar" class="progress-bar progress-bar-info">
                            <span class="sr-only">50% Complete</span>
                        </div>
                    </div>
                </div>
            </div>
        </li>
    </ul>
</li>
<li class="widget-collapsible">
    <a href="#" class="head widget-head terques-bg active clearfix">
        <span class="pull-left">contact online (5)</span>
        <span class="pull-right widget-collapse"><i class="ico-minus"></i></span>
    </a>
    <ul class="widget-container">
        <li>
            <div class="prog-row">
                <div class="user-thumb">
                    <a href="#"><img src="images/avatar1_small.jpg" alt=""></a>
                </div>
                <div class="user-details">
                    <h4><a href="#">Jonathan Smith</a></h4>
                    <p>
                        Work for fun
                    </p>
                </div>
                <div class="user-status text-danger">
                    <i class="fa fa-comments-o"></i>
                </div>
            </div>
            <div class="prog-row">
                <div class="user-thumb">
                    <a href="#"><img src="images/avatar1.jpg" alt=""></a>
                </div>
                <div class="user-details">
                    <h4><a href="#">Anjelina Joe</a></h4>
                    <p>
                        Available
                    </p>
                </div>
                <div class="user-status text-success">
                    <i class="fa fa-comments-o"></i>
                </div>
            </div>
            <div class="prog-row">
                <div class="user-thumb">
                    <a href="#"><img src="images/chat-avatar2.jpg" alt=""></a>
                </div>
                <div class="user-details">
                    <h4><a href="#">John Doe</a></h4>
                    <p>
                        Away from Desk
                    </p>
                </div>
                <div class="user-status text-warning">
                    <i class="fa fa-comments-o"></i>
                </div>
            </div>
            <div class="prog-row">
                <div class="user-thumb">
                    <a href="#"><img src="images/avatar1_small.jpg" alt=""></a>
                </div>
                <div class="user-details">
                    <h4><a href="#">Mark Henry</a></h4>
                    <p>
                        working
                    </p>
                </div>
                <div class="user-status text-info">
                    <i class="fa fa-comments-o"></i>
                </div>
            </div>
            <div class="prog-row">
                <div class="user-thumb">
                    <a href="#"><img src="images/avatar1.jpg" alt=""></a>
                </div>
                <div class="user-details">
                    <h4><a href="#">Shila Jones</a></h4>
                    <p>
                        Work for fun
                    </p>
                </div>
                <div class="user-status text-danger">
                    <i class="fa fa-comments-o"></i>
                </div>
            </div>
            <p class="text-center">
                <a href="#" class="view-btn">View all Contacts</a>
            </p>
        </li>
    </ul>
</li>
<li class="widget-collapsible">
    <a href="#" class="head widget-head purple-bg active">
        <span class="pull-left"> recent activity (3)</span>
        <span class="pull-right widget-collapse"><i class="ico-minus"></i></span>
    </a>
    <ul class="widget-container">
        <li>
            <div class="prog-row">
                <div class="user-thumb rsn-activity">
                    <i class="fa fa-clock-o"></i>
                </div>
                <div class="rsn-details ">
                    <p class="text-muted">
                        just now
                    </p>
                    <p>
                        <a href="#">Jim Doe </a>Purchased new equipments for zonal office setup
                    </p>
                </div>
            </div>
            <div class="prog-row">
                <div class="user-thumb rsn-activity">
                    <i class="fa fa-clock-o"></i>
                </div>
                <div class="rsn-details ">
                    <p class="text-muted">
                        2 min ago
                    </p>
                    <p>
                        <a href="#">Jane Doe </a>Purchased new equipments for zonal office setup
                    </p>
                </div>
            </div>
            <div class="prog-row">
                <div class="user-thumb rsn-activity">
                    <i class="fa fa-clock-o"></i>
                </div>
                <div class="rsn-details ">
                    <p class="text-muted">
                        1 day ago
                    </p>
                    <p>
                        <a href="#">Jim Doe </a>Purchased new equipments for zonal office setup
                    </p>
                </div>
            </div>
        </li>
    </ul>
</li>
<li class="widget-collapsible">
    <a href="#" class="head widget-head yellow-bg active">
        <span class="pull-left"> shipment status</span>
        <span class="pull-right widget-collapse"><i class="ico-minus"></i></span>
    </a>
    <ul class="widget-container">
        <li>
            <div class="col-md-12">
                <div class="prog-row">
                    <p>
                        Full sleeve baby wear (SL: 17665)
                    </p>
                    <div class="progress progress-xs mtop10">
                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                            <span class="sr-only">40% Complete</span>
                        </div>
                    </div>
                </div>
                <div class="prog-row">
                    <p>
                        Full sleeve baby wear (SL: 17665)
                    </p>
                    <div class="progress progress-xs mtop10">
                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 70%">
                            <span class="sr-only">70% Completed</span>
                        </div>
                    </div>
                </div>
            </div>
        </li>
    </ul>
</li>
</ul>
</div>
</div>
<!--right sidebar end-->

</section>

<!-- Placed js at the end of the document so the pages load faster -->

<!--Core js-->
<script src=""""),_display_(Seq[Any](/*420.15*/routes/*420.21*/.Assets.at("javascripts/jquery.js"))),format.raw/*420.56*/(""""></script>
<script src=""""),_display_(Seq[Any](/*421.15*/routes/*421.21*/.Assets.at("bs3/js/bootstrap.min.js"))),format.raw/*421.58*/(""""></script>
<script class="include" type="text/javascript" src=""""),_display_(Seq[Any](/*422.54*/routes/*422.60*/.Assets.at("javascripts/jquery.dcjqaccordion.2.7.js"))),format.raw/*422.113*/(""""></script>
<script src=""""),_display_(Seq[Any](/*423.15*/routes/*423.21*/.Assets.at("javascripts/jquery.scrollTo.min.js"))),format.raw/*423.69*/(""""></script>
<script src=""""),_display_(Seq[Any](/*424.15*/routes/*424.21*/.Assets.at("javascripts/jQuery-slimScroll-1.3.0/jquery.slimscroll.js"))),format.raw/*424.91*/(""""></script>
<script src=""""),_display_(Seq[Any](/*425.15*/routes/*425.21*/.Assets.at("javascripts/jquery.nicescroll.js"))),format.raw/*425.67*/(""""></script>
<!--Easy Pie Chart-->
<script src=""""),_display_(Seq[Any](/*427.15*/routes/*427.21*/.Assets.at("javascripts/easypiechart/jquery.easypiechart.js"))),format.raw/*427.82*/(""""></script>
<!--Sparkline Chart-->
<script src=""""),_display_(Seq[Any](/*429.15*/routes/*429.21*/.Assets.at("javascripts/sparkline/jquery.sparkline.js"))),format.raw/*429.76*/(""""></script>
<!--jQuery Flot Chart-->
<script src=""""),_display_(Seq[Any](/*431.15*/routes/*431.21*/.Assets.at("javascripts/flot-chart/jquery.flot.js"))),format.raw/*431.72*/(""""></script>
<script src=""""),_display_(Seq[Any](/*432.15*/routes/*432.21*/.Assets.at("javascripts/flot-chart/jquery.flot.tooltip.min.js"))),format.raw/*432.84*/(""""></script>
<script src=""""),_display_(Seq[Any](/*433.15*/routes/*433.21*/.Assets.at("javascripts/flot-chart/jquery.flot.resize.js"))),format.raw/*433.79*/(""""></script>
<script src=""""),_display_(Seq[Any](/*434.15*/routes/*434.21*/.Assets.at("javascripts/flot-chart/jquery.flot.pie.resize.js"))),format.raw/*434.83*/(""""></script>


<!--common script init for all pages-->
<script src=""""),_display_(Seq[Any](/*438.15*/routes/*438.21*/.Assets.at("javascripts/scripts.js"))),format.raw/*438.57*/(""""></script>

</body>
</html>

<!-- Localized -->"""))}
    }
    
    def render(account:Account,content:Html): play.api.templates.HtmlFormat.Appendable = apply(account)(content)
    
    def f:((Account) => (Html) => play.api.templates.HtmlFormat.Appendable) = (account) => (content) => apply(account)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Sep 10 08:28:16 ICT 2014
                    SOURCE: E:/KANTOR/bukopin/app/views/main.scala.html
                    HASH: 88cc87205c9074ed31eeec8b9bf92725fded9e95
                    MATRIX: 779->1|906->34|1325->417|1340->423|1401->462|1474->499|1489->505|1556->550|1629->587|1644->593|1713->640|1834->725|1849->731|1906->766|1979->803|1994->809|2062->855|2280->1037|2295->1043|2335->1061|2406->1096|2421->1102|2475->1134|3336->1959|3352->1966|3383->1975|3567->2123|3582->2129|3618->2143|3810->2299|3825->2305|3869->2327|4491->2913|4506->2919|4546->2937|4757->3112|4772->3118|4809->3133|5025->3313|5040->3319|5077->3334|5166->3387|5181->3393|5215->3405|7130->5283|7160->5290|17059->15152|17075->15158|17133->15193|17196->15219|17212->15225|17272->15262|17374->15327|17390->15333|17467->15386|17530->15412|17546->15418|17617->15466|17680->15492|17696->15498|17789->15568|17852->15594|17868->15600|17937->15646|18022->15694|18038->15700|18122->15761|18208->15810|18224->15816|18302->15871|18390->15922|18406->15928|18480->15979|18543->16005|18559->16011|18645->16074|18708->16100|18724->16106|18805->16164|18868->16190|18884->16196|18969->16258|19074->16326|19090->16332|19149->16368
                    LINES: 26->1|29->1|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|62->34|62->34|62->34|63->35|63->35|63->35|85->57|85->57|85->57|89->61|89->61|89->61|91->63|91->63|91->63|112->84|112->84|112->84|118->90|118->90|118->90|123->95|123->95|123->95|124->96|124->96|124->96|183->155|183->155|448->420|448->420|448->420|449->421|449->421|449->421|450->422|450->422|450->422|451->423|451->423|451->423|452->424|452->424|452->424|453->425|453->425|453->425|455->427|455->427|455->427|457->429|457->429|457->429|459->431|459->431|459->431|460->432|460->432|460->432|461->433|461->433|461->433|462->434|462->434|462->434|466->438|466->438|466->438
                    -- GENERATED --
                */
            