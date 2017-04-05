package Business;

import Data.EmployeeManagement;
import Data.ReportManagement;

import java.sql.ResultSet;
import java.time.LocalDate;

/**
 * Created by dandeac on 28/03/2017.
 */
/*

* @startuml



* @enduml

*/
public class AdminBusiness {
    public static boolean equalsEmployee(User emp1, User emp2) {
        if (emp1.getPassword().equalsIgnoreCase(emp2.getPassword()) && emp1.getUsername().equalsIgnoreCase(emp2.getUsername()))
            return true;
        return false;
    }

    public static boolean isEmployee(String username, String password) throws Exception {
        User employee = new User(username, password);

        ResultSet rs = EmployeeManagement.viewEmployee(username);

        while (rs.next()) {

            String usr = rs.getString("username");
            String pass = rs.getString("password");

            User dbEmployee = new User(usr, pass);

            if (equalsEmployee(employee, dbEmployee))
                return true;

        }


        return false;
    }


    public static boolean isEmployee(String username) throws Exception {


        ResultSet rs = EmployeeManagement.viewEmployee(username);

        while (rs.next()) {

            String usr = rs.getString("username");




            if (username.equalsIgnoreCase(usr))
                return true;

        }


        return false;
    }

    public static void addEmployee(String username, String password) throws Exception {
        User employee = new User(username, password);

        EmployeeManagement.addEmployee(employee);
    }

    public static void removeEmployee(String username) throws Exception {
        EmployeeManagement.deleteEmployee(username);
    }

    public static void updateEmployee(String oldUsername, String newUsername, String newPassword) throws Exception {

        User employee = new User(newUsername,newPassword);
        EmployeeManagement.updateEmployee(oldUsername,employee);
    }

    public static String viewEmployee(String username) throws Exception{
        ResultSet rs = EmployeeManagement.viewEmployee(username);

        while (rs.next()) {

            String usr = rs.getString("username");
            String pass = rs.getString("password");

            return "USERNAME: "+usr+"\nPASSWORD: "+pass;
        }

        return "Business.User-ul introdus nu exista in baza de date. Reintroduceti username-ul!";
    }


    public static String generateReport(String username, LocalDate from , LocalDate to) throws Exception{
        if(!isEmployee(username))
            return "Angajatul introdus nu exista in baza de date!";

        ResultSet rs = ReportManagement.viewReport(username,from,to);
        if(!rs.next()) return "Nu exista operatiuni efectuate in aceasta perioada";
        StringBuilder stringBuilder = new StringBuilder();




        while (rs.next()) {

            String description = rs.getString("description");

            stringBuilder.append(description);
            stringBuilder.append("\n");


        }
        String finalString = stringBuilder.toString();
        return finalString;
    }
}