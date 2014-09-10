package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity
public class PersonalizationJobDetail extends Model {

    @Id
    public Integer id;
    public String description;

    @ManyToOne
    public PersonalizationJob personalizationJob;

    @ManyToOne
    public Card card;

    public static Finder<Integer, PersonalizationJobDetail> find = new Finder<Integer, PersonalizationJobDetail>(Integer.class, PersonalizationJobDetail.class);
}
