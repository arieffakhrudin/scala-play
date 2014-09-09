package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by MAF on 9/9/2014.
 */
@Entity
public class Role extends Model {
    @Id
    public Integer id;
    public String role_name;

    public static Model.Finder<Integer,Role> find = new Model.Finder<Integer,Role>(
            Integer.class, Role.class
    );
}
