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
@Entity(name = "personalizationStation")
public class PersonalizationStation extends Model {

    @Id
    public Integer id;
    public String stationName;
    public String ipAddress;
    public String description;

    @OneToMany(mappedBy = "personalizationStation", cascade = CascadeType.ALL)
    public List<PersonalizationJob> personalizationJobs;

    public static Finder<Integer, PersonalizationStation> find = new Finder<Integer, PersonalizationStation>(Integer.class, PersonalizationStation.class);
}
