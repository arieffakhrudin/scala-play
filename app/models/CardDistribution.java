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
public class CardDistribution extends Model {

    @Id
    public Integer id;
    public Date distributionDate;
    public String distributedBy;

    @ManyToOne
    private Card card;

    @ManyToOne
    private CardHolder cardHolder;

    public static Finder<Integer, CardDistribution> find = new Finder<Integer, CardDistribution>(Integer.class, CardDistribution.class);
}
