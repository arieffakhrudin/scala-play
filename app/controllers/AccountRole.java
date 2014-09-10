package controllers;

import com.avaje.ebean.Ebean;
import models.Account;
import models.Role;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.List;


/**
 * Created by MAF on 9/9/2014.
 */
@Security.Authenticated(Secured.class)
public class AccountRole extends Controller {

    public static Result setRole(Integer id){
        List<Role> roles = Role.find.all();
        Account account = Account.find.byId(id);
        Account session = Account.findByUsername(request().username());
        return ok(views.html.accountrole.setrole.render(roles, account, session));
    }

    public static Result saveRole(Integer id){
        Role role = Form.form(Role.class).bindFromRequest().get();

        Ebean.createSqlUpdate("delete from account_role where account_id = :id")
                .setParameter("id", id).execute();

        Ebean.createSqlUpdate("insert into account_role values(:account_id, :role_id)")
                .setParameter("account_id", id).
                setParameter("role_id", role.id)
                .execute();

        List<Account> accounts = Account.find.all();
        Account session = Account.findByUsername(request().username());
        return ok(views.html.account.account.render(accounts, session));
    }
}
