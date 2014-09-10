package models;

import play.db.ebean.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.List;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity(name = "cardHolder")
public class CardHolder extends Model {

    @Id
    public Integer id;
    public String name;
    public String gender;
    public Date birthDate;
    public String address;
    public String telephone;
    public String personalIdType;
    public String personalId;
    public String occupation;

    @OneToMany(mappedBy = "cardHolder", cascade = CascadeType.ALL)
    public List<CardDistribution> cardDistributions;

    public static Finder<Integer, CardHolder> find = new Finder<Integer, CardHolder>(Integer.class, CardHolder.class);
}
