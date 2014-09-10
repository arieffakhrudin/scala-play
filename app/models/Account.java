package models;

import org.mindrot.jbcrypt.BCrypt;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import scala.concurrent.stm.ccstm.AccessHistory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User entity managed by Ebean
 */
@Entity 
public class Account extends Model {

    //private static final long serialVersionUID = 1L;

    /*@Constraints.Required
    @Formats.NonEmpty*/
    @Id
    public Integer id;
    public String username;
    public String realName;
    public String password;
    public String email;
    public String securityQuestion;
    public String securityAnswer;

    @OneToMany(cascade = CascadeType.ALL)
    public List<UserActivityLog> userActivityLogs;

    @ManyToMany
    public List<Role> roles;

    public static Finder<Integer, Account> find = new Finder<Integer, Account>(Integer.class, Account.class);

    public static Account findByUsername(String username) {
        return find.where().eq("username", username).findUnique();
    }

    /**
     * Authenticate a User.
     */
    public static Account authenticate(String username, String password) {
        Account account= Account.find.where().eq("username", username).findUnique();
        if (account != null && BCrypt.checkpw(password, account.password)) {
            return account;
        } else {
            return null;
        }

        /*
        return find.where()
            .eq("username", username)
            .eq("password", BCrypt.checkpw(passwords, password))
            .findUnique();
            */
    }
    
    // --
    public String toString() {
        return "Account(" + realName + ")";
    }

}

