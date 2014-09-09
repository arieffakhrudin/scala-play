package controllers;

import play.mvc.*;
import play.data.*;
import models.*;
import views.html.*;

public class Authentication extends Controller {

    // authentication
    public static class Login {

        public String username;
        public String password;

        public String validate(){
            if(Account.authenticate(username, password) == null){
                return "Invalid user or password";
            }
            return null;
        }
    }

    //login page
    public static Result login(){
        return ok(
            login.render(Form.form(Login.class))
        );
    }

    //handle login form submission
    public static Result authenticate(){
        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
        if(loginForm.hasErrors()){
            return badRequest(login.render(loginForm));
        }else{
            session("username", loginForm.get().username);
            return redirect(routes.Application.index());
        }
    }

    //logout and clear the session
    public static Result logout(){
        session().clear();
        flash("success", "You've been log out.");
        return redirect(routes.Authentication.login());
    }


}
