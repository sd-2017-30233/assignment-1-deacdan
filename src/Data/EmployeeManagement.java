package Data;

import Business.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by dandeac on 28/03/2017.
 */
public class EmployeeManagement {

    public static void addEmployee(User employee) throws Exception {
        Connection conn = Connect.getConnection();
        try{

            PreparedStatement posted = conn.prepareStatement("INSERT INTO `employees`(`username`, `password`) VALUES ('"+employee.getUsername()+"','"+employee.getPassword()+"')");
                    posted.executeUpdate();

        }  catch(Exception e){
            System.out.println(e);
        }

        Connect.closeConnection(conn);
    }


    public static void updateEmployee(String name, User employee) throws Exception {
        Connection conn = Connect.getConnection();
        try{

            PreparedStatement posted = conn.prepareStatement("UPDATE `employees` SET `username`='"+employee.getUsername()+"',`password`='"+employee.getPassword()+"' WHERE `username`='"+name
                    +"'");
            posted.executeUpdate();

        }  catch(Exception e){
            System.out.println(e);
        }

        Connect.closeConnection(conn);
    }

    public static void deleteEmployee(String name) throws Exception {
        Connection conn = Connect.getConnection();
        try{

            PreparedStatement posted = conn.prepareStatement("DELETE FROM `employees` WHERE `username`='"+name+"'");
            posted.executeUpdate();

        }  catch(Exception e){
            System.out.println(e);
        }

        Connect.closeConnection(conn);
    }

    public static ResultSet viewEmployee(String name) throws Exception {
        Connection conn = Connect.getConnection();
        try{

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT `username`, `password` FROM `employees` WHERE `username`='"+name+"'");

            return rs;
        }  catch(Exception e){
            System.out.println(e);

        }

        Connect.closeConnection(conn);
        return null;
    }




}
