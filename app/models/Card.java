package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by MAF on 9/10/2014.
 */
@Entity(name = "card")
public class Card extends Model {

    @Id
    public Integer id;
    public String cardName;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    public List<CardData> cardDatas;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    public List<CardStateHistory> cardStateHistories;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    public List<DataPreparationLog> dataPreparationLogs;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    public List<CardDistribution> cardDistributions;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    public List<PersonalizationLog> personalizationLogs;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    public List<PersonalizationJobDetail> personalizationJobDetails;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    public List<TransactionHistory> transactionHistories;

    @ManyToOne
    public CardState cardState;

    public static Finder<Integer, Card> find = new Finder<Integer, Card>(Integer.class, Card.class);
}
