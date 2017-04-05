package Data;

import Business.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Created by dandeac on 27/03/2017.
 */
public class AccountManagement {



    public static void addAccount(Account account) throws Exception {
        Connection conn = Connect.getConnection();
        try{

            PreparedStatement posted = conn.prepareStatement("INSERT INTO `accounts` (`id`, `money`, `creationDate`, `accountType`,`idClient`) VALUES ('"+ account.getId() +"', '"+account.getMoney()+"', '"+account.getCreationDate()+"', '"+account.getAccountType()+"', '"+account.getIdClient()+"')");

            posted.executeUpdate();

        }  catch(Exception e){
            System.out.println(e);
        }

        Connect.closeConnection(conn);


    }

    public static void updateAccount(int oldAccountID, Account account) throws Exception{
        Connection conn = Connect.getConnection();
        try{

            PreparedStatement posted = conn.prepareStatement("UPDATE `accounts` SET `money`='"+account.getMoney()+"',`creationDate`='"+account.getCreationDate()+"',`accountType`='"+account.getAccountType()+"',`idClient`='"+account.getIdClient()+"' WHERE `id`='"+oldAccountID+"'");
            posted.executeUpdate();

        }  catch(Exception e){
            System.out.println(e);
        }

        Connect.closeConnection(conn);

    }

    public static ResultSet viewAccount(int idAccount) throws Exception {
        Connection conn = Connect.getConnection();
        try{

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT `id`, `money`, `creationDate`, `accountType`, `idClient` FROM `accounts` WHERE `id`='"+idAccount+"'");



            return rs;
        }  catch(Exception e){
            System.out.println(e);

        }

        Connect.closeConnection(conn);
        return null;

    }

    public static void deleteAccount(int idAccount) throws Exception{
        Connection conn = Connect.getConnection();
        try{

            PreparedStatement posted = conn.prepareStatement("DELETE FROM `accounts` WHERE `id`='"+idAccount+"'");
            posted.executeUpdate();

        }  catch(Exception e){
            System.out.println(e);
        }

        Connect.closeConnection(conn);

    }


    public static void transferMoney(int fromID, int toID, int amount) throws Exception{
        Connection conn = Connect.getConnection();
        try{

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT  `money` FROM `accounts` WHERE `id`='"+fromID+"'");

            // iterate through the java resultset
            while (rs.next()) {

                int money = rs.getInt("money");


                int remainingMoney = money - amount;
                    try{
                    PreparedStatement posted = conn.prepareStatement("UPDATE `accounts` SET `money`='"+remainingMoney+"' WHERE `id`='"+fromID+"'");
                    posted.executeUpdate();}
                    catch (Exception e){
                        System.out.println(e);
                    }

                    try{
                        Statement st1 = conn.createStatement();
                        ResultSet rs1 = st1.executeQuery("SELECT `money` FROM `accounts` WHERE `id`='"+toID+"'");

                        while (rs1.next()) {
                            int moneyTo = rs1.getInt("money");
                            int newAmount = moneyTo + amount;
                            try{
                                PreparedStatement posted2 = conn.prepareStatement("UPDATE `accounts` SET `money`='"+newAmount+"' WHERE `id`='"+toID+"'");
                                posted2.executeUpdate();
                            }catch(Exception e){
                                System.out.println(e);
                            }

                        }
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }


            }

        }  catch(Exception e){


        }

        Connect.closeConnection(conn);


    }

    public static void payBill(int id, int amount) throws Exception {
        Connection conn = Connect.getConnection();
        try{

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT  `money` FROM `accounts` WHERE `id`='"+id+"'");

            while(rs.next()) {
                int money = rs.getInt("money");
                try {
                    int remainingMoney = money-amount;
                            PreparedStatement posted = conn.prepareStatement("UPDATE `accounts` SET `money`='"+remainingMoney+"' WHERE `id`='"+id+"'");
                            posted.executeUpdate();


                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }  catch(Exception e){
            System.out.println(e);
        }

        Connect.closeConnection(conn);


    }

}
