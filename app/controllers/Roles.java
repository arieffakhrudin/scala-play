package controllers;

import models.Account;
import models.Role;
import org.mindrot.jbcrypt.BCrypt;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.List;

import static play.libs.Json.toJson;

/**
 * Created by MAF on 9/9/2014.
 */
@Security.Authenticated(Secured.class)
public class Roles extends Controller {

    public static Result index() {
        List<Role> Roles = Role.find.all();
        Account session = Account.findByUsername(request().username());
        return ok(views.html.role.role.render(Roles, session));
    }

    public static Result createRole(){
        return ok(views.html.role.create.render(Account.findByUsername(request().username())));
    }

    public static Result saveRole(){
        Role Role = Form.form(Role.class).bindFromRequest().get();
        Role.save();
        return redirect(routes.Roles.index());
    }

    public static Result editRole(Integer id){
        Role role= Role.find.byId(id);
        return ok(views.html.role.edit.render(role, Account.findByUsername(request().username())));
    }

    public static Result updateRole(){
        Role Role = Form.form(Role.class).bindFromRequest().get();
        Role.update();
        return redirect(routes.Roles.index());
    }

    public static Result deleteRole(Integer id){
        Role role = Role.find.byId(id);
        role.delete();
        return redirect(routes.Roles.index());
    }
}
