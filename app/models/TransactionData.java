package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity
public class TransactionData extends Model {

    @Id
    public Integer id;
    public String transactionData;

    @ManyToOne
    public TransactionHistory transactionHistory;

    public static Finder<Integer, TransactionData> find = new Finder<Integer, TransactionData>(Integer.class, TransactionData.class);
}
