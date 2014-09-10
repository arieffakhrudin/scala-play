package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity
public class PersonalizationLog extends Model {

    @Id
    public Integer id;
    public Date persoDate;
    public String persoBy;
    public Integer persoResult;
    public String persoLog;

    @ManyToOne
    public Card card;

    @ManyToOne
    public PersonalizationJob personalizationJob;

    public static Finder<Integer, PersonalizationLog> find = new Finder<Integer, PersonalizationLog>(Integer.class, PersonalizationLog.class);
}
