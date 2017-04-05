package Business;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by dandeac on 27/03/2017.
 */
public class Account {
    public int id;
    public int money;
    public LocalDate creationDate;
    public String accountType;
    public int idClient;

    public Account(int id, int money, LocalDate creationDate, String accountType, int idClient) {
        this.id = id;
        this.money = money;
        this.creationDate = creationDate;
        this.accountType = accountType;
        this.idClient = idClient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
}
