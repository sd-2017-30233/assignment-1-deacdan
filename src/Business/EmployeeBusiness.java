package Business;

import Business.Account;
import Business.Client;
import Data.AccountManagement;
import Data.ClientManagement;
import Data.ReportManagement;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by dandeac on 03/04/2017.
 */
public class EmployeeBusiness {

    public static boolean isClient(int id) throws Exception{
        ResultSet rs = ClientManagement.viewClient(id);

        if(rs.next())
            return true;
        return false;

    }

    public static boolean isAccount(int id) throws Exception{
        ResultSet rs = AccountManagement.viewAccount(id);

        if(rs.next())
            return true;
        return false;

    }

    public static String accountType(int id) throws Exception{
        ResultSet rs = AccountManagement.viewAccount(id);

        while (rs.next()) {
            String accountType = rs.getString("accountType");


            return accountType;
        }
        return null;

    }

    public static int moneyAvailable(int idAccount) throws Exception{
        ResultSet rs = AccountManagement.viewAccount(idAccount);


        // iterate through the java resultset
        while (rs.next()) {

            int money = rs.getInt("money");


            return money;
        }
        return 0;
    }


    public static String addClient(String employee, int id, String name, int cardNumber, int personalCode, String address, String email) throws Exception{
        if(isClient(id) || cardNumber<0 || personalCode<0) return "Operatiune esuata!";

        Client client = new Client(id, name, cardNumber, personalCode, address, email);
        ClientManagement.addClient(client);


        LocalDate date = LocalDate.now();
        String description = new String("A adaugat clientul cu ID-ul: "+id+", la data: "+date+"\n");
        ReportManagement.addEntry(employee,description,date);

        return "Operatiune reusita!";
    }

    public static String updateClient(String employee, int oldID, String newName, int newCardNumber, int newPersonalCode, String newAddress, String newEmail) throws Exception{
        if(!isClient(oldID) || newCardNumber<0 || newPersonalCode<0) return "Operatiune esuata!";

        Client client = new Client(oldID,newName,newCardNumber,newPersonalCode,newAddress,newEmail);
        ClientManagement.updateClient(oldID,client);


        LocalDate date = LocalDate.now();
        String description = new String("A modificat clientul cu ID-ul: "+oldID+", la data: "+date+"\n");
        ReportManagement.addEntry(employee,description,date);

        return "Operatiune reusita!";
    }

    public static String viewClient(int idClient) throws Exception {
        ResultSet rs = ClientManagement.viewClient(idClient);

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int cardNumber = rs.getInt("cardNumber");
            int personalCode = rs.getInt("personalCode");
            String address = rs.getString("address");
            String email = rs.getString("email");

            return ("Clientul " + name + " ,are ID-ul " + id + " ,codul personal " + personalCode + " ,e-mail-ul " + email + " ,adresa " + address + " ,numarul cardului " + cardNumber + ".");

        }
        return null;
    }

   public static String addAccount(String employee, int id, int money, LocalDate creationDate, String accountType, int idClient) throws Exception{
       if(!isClient(idClient) || isAccount(id) || money<0) return "Operatiune esuata!";

       Account account = new Account(id, money, creationDate, accountType, idClient);
       AccountManagement.addAccount(account);


       LocalDate date = LocalDate.now();
       String description = new String("A adaugat contul cu ID-ul: "+id+", la data: "+date+"\n");
       ReportManagement.addEntry(employee,description,date);

       return "Operatiune reusita!";

   }

   public static String updateAccount(String employee, int oldID, int newMoney, LocalDate newCreationDate, String newAccountType, int newIDClient) throws Exception{
       if(!isClient(newIDClient) || !isAccount(oldID) || newMoney<0) return "Operatiune esuata!";

       Account account = new Account(oldID,newMoney,newCreationDate,newAccountType,newIDClient);
       AccountManagement.updateAccount(oldID,account);


       LocalDate date = LocalDate.now();
       String description = new String("A modificat contul cu ID-ul: "+oldID+", la data: "+date+"\n");
       ReportManagement.addEntry(employee,description,date);

       return "Operatiune reusita!";
   }

   public static String removeAccount(String employee, int id) throws Exception{

       if(!isAccount(id)) return "Operatiune esuata!";
       AccountManagement.deleteAccount(id);


       LocalDate date = LocalDate.now();
       String description = new String("A sters contul cu ID-ul: "+id+", la data: "+date+"\n");
       ReportManagement.addEntry(employee,description,date);

       return "Operatiune reusita!";
   }

    public static String accountInfo(int idAccount) throws Exception {


        ResultSet rs = AccountManagement.viewAccount(idAccount);


        // iterate through the java resultset
        while (rs.next()) {
            int id = rs.getInt("id");
            int money = rs.getInt("money");
            Date creationDate = rs.getDate("creationDate");
            String accountType = rs.getString("accountType");
            int idClient = rs.getInt("idClient");


            return ("Contul cu ID-ul " + id + " apartine clientului cu ID-ul " + idClient + ". A fost creat la data " + creationDate + ", este un cont de " + accountType + " si contine suma de" + money + "RON.");

        }
        return "Operatiune esuata!";
    }



    public static String transferMoney(String employee, int fromID, int toID, int money) throws Exception {

            if(moneyAvailable(fromID) < money || money< 0 || !isAccount(fromID) || !isAccount(toID) || !accountType(fromID).equalsIgnoreCase("Spending")) return "Operatiune esuata!";

            AccountManagement.transferMoney(fromID, toID, money);

            LocalDate date = LocalDate.now();
        String description = new String("A transferat suma de la contul " + fromID + " la contul " + toID + " suma de " + money + ", la data: "+date+"\n");

        ReportManagement.addEntry(employee, description,date);

    return "Operatiune reusita!";
    }
    public static String payBill(String employee, int fromID, int money) throws Exception {

             if(moneyAvailable(fromID) < money || money< 0 || !isAccount(fromID) || !accountType(fromID).equalsIgnoreCase("Spending")) return "Operatiune esuata!";

            AccountManagement.payBill(fromID, money);

            LocalDate date = LocalDate.now();
            String description = new String("A platit " + money + " din contul " + fromID + ", la data: "+date+"\n");
            ReportManagement.addEntry(employee, description,date);
        return "Operatiune reusita!";
    }

}
