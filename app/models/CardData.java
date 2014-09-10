package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity
public class CardData extends Model {

    @Id
    public Integer id;
    public String data;

    @ManyToOne
    public Card card;

    @ManyToOne
    public CardDataConfig cardDataConfig;

    public static Finder<Integer, CardData> find = new Finder<Integer, CardData>(Integer.class, CardData.class);
}
