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
public class PersonalizationJobStateHistory extends Model {

    @Id
    public Integer id;
    public String modifiedBy;
    public Date modifiedDate;

    @ManyToOne
    public PersonalizationJob personalizationJob;

    @ManyToOne
    public PersonalizationJobState personalizationJobState;

    public static Finder<Integer, PersonalizationJobStateHistory> find = new Finder<Integer, PersonalizationJobStateHistory>(Integer.class, PersonalizationJobStateHistory.class);
}
