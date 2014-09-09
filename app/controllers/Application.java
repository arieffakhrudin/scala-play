package controllers;

import models.Account;
import models.Person;
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
        List<Person> persons = Person.find.all();
        return ok(home.render(persons, Account.findByUsername(request().username())));
    }

    public static Result getPersons(){
        List<Person> persons = Person.find.all();
        return ok(toJson(persons));
    }

    public static Result getPerson(Integer id){
        Person person = Person.find.byId(id);
        return ok(toJson(person));
    }

    public static Result createPerson(){
        return ok(create.render(Account.findByUsername(request().username())));
    }

    public static Result savePerson(){
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.save();
        return redirect(routes.Application.index());
    }

    public static Result editPerson(Integer id){
        Person person = Person.find.byId(id);
        return ok(edit.render(person, Account.findByUsername(request().username())));
    }

    public static Result updatePerson(){
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.update();
        return redirect(routes.Application.index());
    }

    public static Result deletePerson(Integer id){
        Person person = Person.find.byId(id);
        person.delete();
        return redirect(routes.Application.index());
    }
}
