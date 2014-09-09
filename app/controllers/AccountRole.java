package controllers;

import com.avaje.ebean.Ebean;
import models.Account;
import play.mvc.Controller;
import play.mvc.Result;


/**
 * Created by MAF on 9/9/2014.
 */
public class AccountRole extends Controller {

    public static Result setRole(Integer id){
        /*
        Ebean.createSqlUpdate(
                "delete from account_role where id_account = :id"
        ).setParameter("id_account", id).execute();
        */

        Account account = Account.find.byId(id);
        return ok(views.html.accountrole.setrole.render(account, Account.findByUsername(request().username())));
    }

    public static Result saveRole(){
        return TODO;
    }
}
