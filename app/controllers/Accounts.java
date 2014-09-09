package controllers;

import models.Account;
import models.Person;
import org.mindrot.jbcrypt.BCrypt;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.account.account;
import views.html.create;
import views.html.edit;
import views.html.home;

import java.util.List;

import static play.libs.Json.toJson;

/**
 * Created by MAF on 9/8/2014.
 */

@Security.Authenticated(Secured.class)
public class Accounts extends Controller {

    public static Result index() {
        List<Account> accounts = Account.find.all();
        Account session = Account.findByUsername(request().username());
        return ok(views.html.account.account.render(accounts, session));
    }

    public static Result getAuthentication(){
        Account account = Account.findByUsername(request().username());
        return ok(toJson(account));
    }

    public static Result createAccount(){
        return ok(views.html.account.create.render(Account.findByUsername(request().username())));
    }

    public static Result saveAccount(){
        Account account = Form.form(Account.class).bindFromRequest().get();
        account.password = BCrypt.hashpw(account.password, BCrypt.gensalt());
        account.save();
        return redirect(routes.Accounts.index());
    }

    public static Result editAccount(Integer id){
        Account account= Account.find.byId(id);
        return ok(views.html.account.edit.render(account, Account.findByUsername(request().username())));
    }

    public static Result updateAccount(){
        Account account = Form.form(Account.class).bindFromRequest().get();
        account.update();
        return redirect(routes.Accounts.index());
    }

    public static Result deleteAccount(Integer id){
        Account account = Account.find.byId(id);
        account.delete();
        return redirect(routes.Accounts.index());
    }

}
