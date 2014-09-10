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
public class CardStateHistory extends Model {

    @Id
    public Integer id;
    public Date changeDate;
    public String changeBy;

    @ManyToOne
    public Card card;

    @ManyToOne
    public CardState cardState;

    public Finder<Integer, CardStateHistory> find = new Finder<Integer, CardStateHistory>(Integer.class, CardStateHistory.class);
}
