package controllers;

import models.Account;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.servlet.annotation.ServletSecurity;

/**
 * Created by MAF on 9/9/2014.
 */

@Security.Authenticated(Secured.class)
public class Profile extends Controller {
    public static Result index() {
        Account account = Account.findByUsername(request().username());
        return ok(views.html.profile.index.render(account));
    }

}
