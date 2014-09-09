package models;

import org.mindrot.jbcrypt.BCrypt;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import scala.concurrent.stm.ccstm.AccessHistory;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
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
    public String real_name;
    public String password;
    public String email;
    public String security_question;
    public String security_answer;

    @ManyToMany
    public List<Role> roleList = new ArrayList<Role>();

    // -- Queries
    
    public static Model.Finder<Integer, Account> find = new Model.Finder<Integer, Account>(Integer.class, Account.class);

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
        return "Account(" + real_name + ")";
    }

}

