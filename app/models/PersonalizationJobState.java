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
@Entity(name = "personalizationJobState")
public class PersonalizationJobState extends Model {

    @Id
    public Integer id;
    public String stateName;
    public String description;

    @OneToMany(mappedBy = "personalizationJobState", cascade = CascadeType.ALL)
    public List<PersonalizationJob> personalizationJobs;

    @OneToMany(mappedBy = "personalizationJobState", cascade = CascadeType.ALL)
    public List<PersonalizationJobStateHistory> personalizationJobStateHistories;

    public static Finder<Integer, PersonalizationJobState> find = new Finder<Integer, PersonalizationJobState>(Integer.class, PersonalizationJobState.class);
}
