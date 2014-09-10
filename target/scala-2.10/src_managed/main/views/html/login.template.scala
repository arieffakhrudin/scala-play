
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Authentication.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Authentication.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="CMS Bukopin Login Page">
    <meta name="author" content="MAF">
    <link rel="shortcut icon" href="images/favicon.png">

    <title>Login</title>

    <!--Core CSS -->
    <link href=""""),_display_(Seq[Any](/*16.18*/routes/*16.24*/.Assets.at("bs3/css/bootstrap.min.css"))),format.raw/*16.63*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*17.18*/routes/*17.24*/.Assets.at("stylesheets/bootstrap-reset.css"))),format.raw/*17.69*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*18.18*/routes/*18.24*/.Assets.at("font-awesome/css/font-awesome.css"))),format.raw/*18.71*/("""" rel="stylesheet" />

    <!-- Custom styles for this template -->
    <link href=""""),_display_(Seq[Any](/*21.18*/routes/*21.24*/.Assets.at("stylesheets/style.css"))),format.raw/*21.59*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*22.18*/routes/*22.24*/.Assets.at("stylesheets/style-responsive.css"))),format.raw/*22.70*/("""" rel="stylesheet" />
</head>

<body class="login-body">

<div class="container">

    """),_display_(Seq[Any](/*29.6*/helper/*29.12*/.form(action=routes.Authentication.authenticate, 'class->"form-signin")/*29.83*/{_display_(Seq[Any](format.raw/*29.84*/("""
        <h2 class="form-signin-heading">Card Management System<br />BUKOPIN</h2>
        <div class="login-wrap">
            <div class="user-login-info">
                <input name="username" type="text" class="form-control" placeholder="Username" autofocus>
                <input name="password" type="password" class="form-control" placeholder="Password">
            </div>
            <label class="checkbox">
                <input type="checkbox" value="remember-me"> Remember me
                <span class="pull-right">
                    <a data-toggle="modal" href="#myModal"> Forgot Password?</a>

                </span>
            </label>
            <button class="btn btn-lg btn-login btn-block" type="submit">Sign in</button>
        </div>
    """)))})),format.raw/*45.6*/("""

</div>

<!--Core js-->
<script src="javascripts/jquery.js"></script>
<script src="bs3/js/bootstrap.min.js"></script>

</body>
</html>"""))}
    }
    
    def render(form:Form[Authentication.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Authentication.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Sep 09 13:02:55 ICT 2014
                    SOURCE: E:/KANTOR/bukopin/app/views/login.scala.html
                    HASH: f279f12c78895c2914caaf3be2c9443cfa46d2bd
                    MATRIX: 794->1|922->35|1342->419|1357->425|1418->464|1492->502|1507->508|1574->553|1648->591|1663->597|1732->644|1856->732|1871->738|1928->773|2002->811|2017->817|2085->863|2215->958|2230->964|2310->1035|2349->1036|3166->1822
                    LINES: 26->1|29->1|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|57->29|57->29|57->29|57->29|73->45
                    -- GENERATED --
                */
            