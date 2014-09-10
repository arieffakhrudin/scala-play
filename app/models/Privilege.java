package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity
public class Privilege extends Model {

    @Id
    public Integer id;
    public String moduleName;
    public boolean createAccess;
    public boolean readAccess;
    public boolean updateAccess;
    public boolean deleteAccess;

    public static Model.Finder<Integer, Privilege> find = new Model.Finder<Integer, Privilege>(Integer.class, Privilege.class);

}
