package Data;

import Business.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by dandeac on 27/03/2017.
 */
public class ClientManagement {

    public static void addClient(Client client) throws Exception {
        Connection conn = Connect.getConnection();
        try{

            PreparedStatement posted = conn.prepareStatement("INSERT INTO `clients` (`id`, `name`, `cardNumber`, `personalCode`,`address`,`email`) VALUES ('"+ client.getId() +"', '"+client.getName()+"', '"+client.getCardNumber()+"', '"+client.getPersonalCode()+"', '"+client.getAddress()+"', '"+client.getEmail()+"')");
            posted.executeUpdate();

        }  catch(Exception e){
            System.out.println(e);
        }

        Connect.closeConnection(conn);
    }


    public static void updateClient(int oldClientID, Client client) throws Exception{
        Connection conn = Connect.getConnection();
        try{

            PreparedStatement posted = conn.prepareStatement("UPDATE `clients` SET `name`='"+client.getName()+"',`cardNumber`='"+client.getCardNumber()+"',`personalCode`='"+client.getPersonalCode()+"',`address`='"+client.getAddress()+"',`email`='"+client.getEmail()+"' WHERE `id`='"+oldClientID+"'");
                    posted.executeUpdate();

        }  catch(Exception e){
            System.out.println(e);
        }

        Connect.closeConnection(conn);

    }

    public static ResultSet viewClient(int idClient) throws Exception {
        Connection conn = Connect.getConnection();
        try{

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT `id`, `name`, `cardNumber`, `personalCode`, `address`, `email` FROM `clients` WHERE `id`='"+idClient+"'");




            return rs;
        }  catch(Exception e){
            System.out.println(e);

        }

        Connect.closeConnection(conn);
        return null;

    }

}
