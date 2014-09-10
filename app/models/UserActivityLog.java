package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity
public class UserActivityLog extends Model {

    @Id
    public Integer id;
    public Integer terminal;
    public Date activityDate;
    public String activity;

    public static Finder<Integer, Privilege> find = new Finder<Integer, Privilege>(Integer.class, Privilege.class);

}
