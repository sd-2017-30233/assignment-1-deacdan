package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

/**
 * Created by dandeac on 03/04/2017.
 */
public class ReportManagement {
    public static void addEntry(String employee, String description,LocalDate date) throws Exception{
        Connection conn = Connect.getConnection();
        try{

            PreparedStatement posted = conn.prepareStatement("INSERT INTO `report`(`employee`, `description`, `date`) VALUES ('"+employee+"','"+description+"','"+date+"')");
            posted.executeUpdate();

        }  catch(Exception e){
            System.out.println(e);
        }

        Connect.closeConnection(conn);
    }

    public static ResultSet viewReport(String employee, LocalDate from, LocalDate to) throws Exception {
        Connection conn = Connect.getConnection();
        try{

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT  `description` FROM `report` WHERE `employee`='"+employee+"' AND `date` BETWEEN '"+from+"' AND '"+to+"'");

            return rs;
        }  catch(Exception e){
            System.out.println(e);

        }

        Connect.closeConnection(conn);
        return null;

    }
}
