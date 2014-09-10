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
@Entity (name = "terminal")
public class Terminal extends Model {

    @Id
    public Integer id;
    public String terminalName;
    public String brand;
    public String type;
    public String description;
    public String ipAddress;

    @OneToMany(mappedBy = "terminal", cascade = CascadeType.ALL)
    public List<TransactionHistory> transactionHistories;

    public static Finder<Integer, Terminal> find = new Finder<Integer, Terminal>(Integer.class, Terminal.class);
}
