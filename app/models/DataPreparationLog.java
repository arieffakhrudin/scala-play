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
public class DataPreparationLog extends Model {

    @Id
    public Integer id;
    public Date prepareDate;
    public String preparedBy;

    @ManyToOne
    public Card card;

    public static Finder<Integer, DataPreparationLog> find = new Finder<Integer, DataPreparationLog>(Integer.class, DataPreparationLog.class);
}
