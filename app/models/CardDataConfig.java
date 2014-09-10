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
@Entity(name = "cardDataConfig")
public class CardDataConfig extends Model {

    @Id
    public Integer id;
    public String stationName;
    public String description;

    @OneToMany(mappedBy = "cardDataConfig", cascade = CascadeType.ALL)
    public List<CardData> cardDatas;

    public static Finder<Integer, CardDataConfig> find = new Finder<Integer, CardDataConfig>(Integer.class, CardDataConfig.class);
}
