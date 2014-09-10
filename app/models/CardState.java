package models;

import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity(name = "cardState")
public class CardState extends Model {

    @Id
    public Integer id;
    public String stateName;
    public String description;

    @OneToMany(mappedBy = "cardState", cascade = CascadeType.ALL)
    public List<Card> cards;

    @OneToMany(mappedBy = "cardState", cascade = CascadeType.ALL)
    public List<CardStateHistory> cardStateHistories;

    public static Finder<Integer, CardState> find = new Finder<Integer, CardState>(Integer.class, CardState.class);
}
