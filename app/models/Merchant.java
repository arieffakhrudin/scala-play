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
@Entity(name = "merchant")
public class Merchant extends Model {

    @Id
    public Integer id;
    public String merchantName;
    public String address;
    public String description;

    @OneToMany(mappedBy = "merchant", cascade = CascadeType.ALL)
    public List<TransactionHistory> transactionHistories;

    public static Finder<Integer, Merchant> find = new Finder<Integer, Merchant>(Integer.class, Merchant.class);
}
