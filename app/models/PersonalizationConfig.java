package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity(name = "personalizationConfig")
public class PersonalizationConfig extends Model {

    @Id
    public Integer id;
    public String profileName;
    public String personalizationScript;
    public String thermalLayout;
    public String embossLayout;
    public String indentLayout;
    public Integer profileState;

    @OneToMany(mappedBy = "personalizationConfig", cascade = CascadeType.ALL)
    public List<PersonalizationJob> personalizationJobs;

    public static Finder<Integer, PersonalizationConfig> find = new Finder<Integer, PersonalizationConfig>(Integer.class, PersonalizationConfig.class);
}
