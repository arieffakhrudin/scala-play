package controllers;

import models.Account;
import play.*;
import play.api.PlayException;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.*;

import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;

@Security.Authenticated(Secured.class)
public class Application extends Controller {

    public static Result index() {
        return ok(home.render(Account.findByUsername(request().username())));
    }

}
