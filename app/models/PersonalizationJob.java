package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity(name = "personalizationJob")
public class PersonalizationJob extends Model {

    @Id
    public Integer id;
    public String jobName;

    @OneToMany(mappedBy = "personalizationJob", cascade = CascadeType.ALL)
    public List<PersonalizationLog> personalizationLogs;

    @OneToMany(mappedBy = "personalizationJob", cascade = CascadeType.ALL)
    public List<PersonalizationJobStateHistory> personalizationJobStateHistories;

    @OneToMany(mappedBy = "personalizationJob", cascade = CascadeType.ALL)
    public List<PersonalizationJobDetail> personalizationJobDetails;

    @ManyToOne
    public PersonalizationConfig personalizationConfig;

    @ManyToOne
    public PersonalizationStation personalizationStation;

    @ManyToOne
    public PersonalizationJobState personalizationJobState;

    public static Finder<Integer, PersonalizationJob> find = new Finder<Integer, PersonalizationJob>(Integer.class, PersonalizationJob.class);
}
