package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity(name = "transactionHistory")
public class TransactionHistory extends Model {

    @Id
    public Integer id;
    public Integer invoiceNumber;
    public String transactionType;
    public Date transactionDate;
    public Integer debet;
    public Integer kredit;
    public Integer balance;

    @OneToMany(mappedBy = "transactionHistory", cascade = CascadeType.ALL)
    public List<TransactionData> transactionDatas;

    @ManyToOne
    public Merchant merchant;

    @ManyToOne
    public Terminal terminal;

    @ManyToOne
    public Card card;

    public static Finder<Integer, TransactionHistory> find = new Finder<Integer, TransactionHistory>(Integer.class, TransactionHistory.class);
}
