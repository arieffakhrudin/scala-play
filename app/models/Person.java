package models;


import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by MAF on 9/1/2014.
 */

@Entity
public class Person extends Model {

    @Id
    public Integer id;
    public String name;

    public static Finder<Integer,Person> find = new Finder<Integer,Person>(
            Integer.class, Person.class
    );
}
