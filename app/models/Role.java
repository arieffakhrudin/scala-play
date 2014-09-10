package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by MAF on 9/9/2014.
 */
@Entity
public class Role extends Model {
    @Id
    public Integer id;
    public String roleName;

    @OneToMany(cascade = CascadeType.ALL)
    public List<Privilege> privileges;

    public static Finder<Integer, Role> find = new Finder<Integer, Role>(Integer.class, Role.class);
}
