package Presentation;

import Business.AdminBusiness;
import Business.EmployeeBusiness;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;


/**
 * Created by dandeac on 28/03/2017.
 */
public class GUI extends JPanel {



    public static JFrame adminFrame(){
        JButton logout;

         JLabel addEmployee;
         JLabel addUsernameL;
         JLabel addPasswordL;
         JTextField addUsernameTF;
         JTextField addPasswordTF;
         JButton addEmployeeB;
         JLabel deleteEmployeeL;
         JTextField deleteEmployeeTF;
         JLabel deleteUsernameL;
         JButton deleteEmployeeB;
         JLabel updateEmployeeL;
         JLabel updateOldUsernameL;
         JLabel updateNewUsernameL;
         JLabel updateNewPasswordL;
         JTextField updateOldUsernameTF;
         JTextField updateNewUsernameTF;
         JTextField updateNewPasswordTF;
         JButton updateB;
         JLabel viewEmployeeL;
         JLabel viewUsernameL;
         JTextField viewUsernameTF;
         JButton viewB;
         JTextArea viewTextfield;
         JLabel generateL;
         JLabel generateUsernameL;
         JTextField generateUsernameTF;
         JButton generateB;
         JTextArea generateTextfield;

        JLabel generateFromL;
        JLabel generateToL;
        JTextField generateFromTF;
        JTextField generateToTF;
        JLabel introFormat;

        logout = new JButton("LOGOUT");
        addEmployee = new JLabel ("Add employee:");
        addUsernameL = new JLabel ("username:");
        addPasswordL = new JLabel ("password:");
        addUsernameTF = new JTextField (5);
        addPasswordTF = new JTextField (5);
        addEmployeeB = new JButton ("ADD");
        deleteEmployeeL = new JLabel ("Delete employee:");
        deleteEmployeeTF = new JTextField (5);
        deleteUsernameL = new JLabel ("username:");
        deleteEmployeeB = new JButton ("DELETE");
        updateEmployeeL = new JLabel ("Update employee:");
        updateOldUsernameL = new JLabel ("old username:");
        updateNewUsernameL = new JLabel ("new username:");
        updateNewPasswordL = new JLabel ("new password:");
        updateOldUsernameTF = new JTextField (5);
        updateNewUsernameTF = new JTextField (5);
        updateNewPasswordTF = new JTextField (5);
        updateB = new JButton ("UPDATE");
        viewEmployeeL = new JLabel ("View employee:");
        viewUsernameL = new JLabel ("username:");
        viewUsernameTF = new JTextField (5);
        viewB = new JButton ("VIEW");
        viewTextfield = new JTextArea ();
        generateL = new JLabel ("Generate report:");
        generateUsernameL = new JLabel ("username:");
        generateUsernameTF = new JTextField (5);
        generateB = new JButton ("GENERATE");
        generateTextfield = new JTextArea ();
        generateFromL = new JLabel("from:");
        generateToL = new JLabel("to:");
        generateFromTF = new JTextField(5);
        generateToTF = new JTextField(5);
        introFormat = new JLabel("(YYYY-MM-DD)");

        logout.setBounds(5,5,100,25);
        addEmployee.setBounds (55, 25, 125, 25);
        addUsernameL.setBounds (30, 75, 100, 25);
        addPasswordL.setBounds (30, 105, 100, 25);
        addUsernameTF.setBounds (125, 75, 100, 25);
        addPasswordTF.setBounds (125, 105, 100, 25);
        addEmployeeB.setBounds (265, 90, 100, 25);
        deleteEmployeeL.setBounds (55, 160, 120, 25);
        deleteEmployeeTF.setBounds (125, 205, 100, 25);
        deleteUsernameL.setBounds (25, 205, 100, 25);
        deleteEmployeeB.setBounds (265, 205, 100, 25);
        updateEmployeeL.setBounds (50, 275, 115, 25);
        updateOldUsernameL.setBounds (25, 315, 100, 25);
        updateNewUsernameL.setBounds (25, 340, 100, 25);
        updateNewPasswordL.setBounds (25, 365, 100, 25);
        updateOldUsernameTF.setBounds (125, 315, 100, 25);
        updateNewUsernameTF.setBounds (125, 340, 100, 25);
        updateNewPasswordTF.setBounds (125, 365, 100, 25);
        updateB.setBounds (260, 340, 100, 25);
        viewEmployeeL.setBounds (50, 420, 100, 25);
        viewUsernameL.setBounds (20, 460, 100, 25);
        viewUsernameTF.setBounds (125, 460, 100, 25);
        viewB.setBounds (260, 460, 100, 25);
        viewTextfield.setBounds (15, 495, 335, 80);
        generateL.setBounds (550, 25, 150, 25);
        generateUsernameL.setBounds (425, 60, 100, 25);
        generateUsernameTF.setBounds (525, 60, 100, 25);
        generateB.setBounds (655, 60, 100, 25);
        generateFromL.setBounds(400, 90, 100, 25);
        generateFromTF.setBounds(440,90,100,25);
        generateToL.setBounds(550, 90, 100, 25);
        generateToTF.setBounds(580, 90, 100, 25);
        introFormat.setBounds(690,90,100,25);


        viewTextfield.setEditable(false);
        generateTextfield.setEditable(false);

        JScrollPane scrollGenerate = new JScrollPane(generateTextfield);
        scrollGenerate.setBounds (380, 125, 410, 450);
        scrollGenerate.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


        JFrame adminFrame = new JFrame("ADMINISTRATOR PAGE");
        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminFrame.pack();
        adminFrame.setVisible(true);
        adminFrame.setPreferredSize(new Dimension(830, 605));
        adminFrame.setLayout(null);

        adminFrame.add (logout);
        adminFrame.add (addEmployee);
        adminFrame.add (addUsernameL);
        adminFrame.add (addPasswordL);
        adminFrame.add (addUsernameTF);
        adminFrame.add (addPasswordTF);
        adminFrame.add (addEmployeeB);
        adminFrame.add (deleteEmployeeL);
        adminFrame.add (deleteEmployeeTF);
        adminFrame.add (deleteUsernameL);
        adminFrame.add (deleteEmployeeB);
        adminFrame.add (updateEmployeeL);
        adminFrame.add (updateOldUsernameL);
        adminFrame.add (updateNewUsernameL);
        adminFrame.add (updateNewPasswordL);
        adminFrame.add (updateOldUsernameTF);
        adminFrame.add (updateNewUsernameTF);
        adminFrame.add (updateNewPasswordTF);
        adminFrame.add (updateB);
        adminFrame.add (viewEmployeeL);
        adminFrame.add (viewUsernameL);
        adminFrame.add (viewUsernameTF);
        adminFrame.add (viewB);
        adminFrame.add (viewTextfield);
        adminFrame.add (generateL);
        adminFrame.add (generateUsernameL);
        adminFrame.add (generateUsernameTF);
        adminFrame.add (generateB);
        adminFrame.add (scrollGenerate);
        adminFrame.add (generateFromL);
        adminFrame.add (generateFromTF);
        adminFrame.add (generateToL);
        adminFrame.add (generateToTF);
        adminFrame.add (introFormat);


       logout.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {


                adminFrame.dispose();
                JFrame frame = introFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();

            }
        });

        addEmployeeB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
               String username =addUsernameTF.getText();
               String password = addPasswordTF.getText();
                try {
                    AdminBusiness.addEmployee(username, password);

                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
                finally {
                    addPasswordTF.setText("");
                    addUsernameTF.setText("");
                }
            }
        });

        deleteEmployeeB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
               String username = deleteEmployeeTF.getText();
                try{
                    AdminBusiness.removeEmployee(username);
                }
                catch (Exception ex1){
                    ex1.printStackTrace();
                }
                finally {
                    deleteEmployeeTF.setText("");
                }
            }
        });

        updateB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {

                String oldUsername = updateOldUsernameTF.getText();
                String newUsername = updateNewUsernameTF.getText();
                String newPassword = updateNewPasswordTF.getText();

                try {
                    AdminBusiness.updateEmployee(oldUsername,newUsername,newPassword);
                }
                catch (Exception ex2)
                {
                    ex2.printStackTrace();
                }
                finally {
                    updateNewPasswordTF.setText("");
                    updateNewUsernameTF.setText("");
                    updateOldUsernameTF.setText("");
                }
            }
        });


        viewB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                String username = viewUsernameTF.getText();
                try {
                    viewTextfield.setText(AdminBusiness.viewEmployee(username));
                }
                catch (Exception ex3){
                    ex3.printStackTrace();
                }
                finally {
                    viewUsernameTF.setText("");
                }

            }
        });

        generateB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                String username = generateUsernameTF.getText();
                LocalDate from = LocalDate.parse(generateFromTF.getText());
                LocalDate to = LocalDate.parse(generateToTF.getText());

                try{
                    generateTextfield.setText(AdminBusiness.generateReport(username,from,to));
                }
                catch (Exception ex4){
                    ex4.printStackTrace();
                }


            }
        });

        return adminFrame;
    }

    public static JFrame empFrame(String user){

        JFrame employeeFrame = new JFrame("EMPLOYEE PAGE");
        employeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeFrame.pack();
        employeeFrame.setVisible(true);
        employeeFrame.setPreferredSize(new Dimension(1071, 835));
        employeeFrame.setLayout(null);

        JButton logout;
         JLabel clientIDL;
         JTextField clientIDTF;
         JLabel clientNAMEL;
         JTextField clientNAMETF;
         JTextField clientCNTF;
         JLabel clientCNL;
         JLabel clientPCL;
         JTextField clientPCTF;
         JLabel clientADDRESSL;
         JTextField clientADDRESSTF;
         JLabel clientEMAILL;
         JTextField clientEMAILTF;
         JButton addClientB;
         JButton updateClientB;
         JButton viewClientB;
         JTextArea clientTF;
         JLabel jcomp17;
         JLabel jcomp18;
         JLabel accountIDL;
         JTextField accountIDTF;
         JLabel accountMONEYL;
         JTextField accountMONEYTF;
         JLabel accountTYPEL;
         JTextField accountTYPETF;
         JLabel accountIDCLIENTL;
         JTextField accountIDCLIENTTF;
         JButton addAccountB;
         JButton updateAccountB;
         JButton deleteAccountB;
         JButton viewAccountB;
         JTextArea accountTF;
         JLabel jcomp35;
         JLabel transferFROML;
         JTextField transferFROMTF;
         JLabel transferTOL;
         JTextField transferTOTF;
         JLabel transferAMOUNTL;
         JTextField transferAMOUNTTF;
         JButton transferB;
         JLabel jcomp43;
         JLabel payFROML;
         JTextField payFROMTF;
         JLabel payAMOUNTL;
         JTextField payAMOUNTTF;
         JButton payB;
         JTextField operationsTF;




        logout = new JButton("LOGOUT");
        clientIDL = new JLabel ("ID:");
        clientIDTF = new JTextField (5);
        clientNAMEL = new JLabel ("NAME:");
        clientNAMETF = new JTextField (5);
        clientCNTF = new JTextField (5);
        clientCNL = new JLabel ("CARD NUMBER:");
        clientPCL = new JLabel ("PERSONAL CODE:");
        clientPCTF = new JTextField (5);
        clientADDRESSL = new JLabel ("ADDRESS:");
        clientADDRESSTF = new JTextField (5);
        clientEMAILL = new JLabel ("E-MAIL:");
        clientEMAILTF = new JTextField (5);
        addClientB = new JButton ("ADD");
        updateClientB = new JButton ("UPDATE");
        viewClientB = new JButton ("VIEW");
        clientTF = new JTextArea ();
        jcomp17 = new JLabel ("CLIENT");
        jcomp18 = new JLabel ("ACCOUNT");
        accountIDL = new JLabel ("ID:");
        accountIDTF = new JTextField (5);
        accountMONEYL = new JLabel ("MONEY:");
        accountMONEYTF = new JTextField (5);

        accountTYPEL = new JLabel ("TYPE:");
        accountTYPETF = new JTextField (5);
        accountIDCLIENTL = new JLabel ("ID CLIENT:");
        accountIDCLIENTTF = new JTextField (5);
        addAccountB = new JButton ("ADD");
        updateAccountB = new JButton ("UPDATE");
        deleteAccountB = new JButton ("DELETE");
        viewAccountB = new JButton ("VIEW");
        accountTF = new JTextArea ();
        jcomp35 = new JLabel ("TRANSFER");
        transferFROML = new JLabel ("FROM:");
        transferFROMTF = new JTextField (5);
        transferTOL = new JLabel ("TO:");
        transferTOTF = new JTextField (5);
        transferAMOUNTL = new JLabel ("AMOUNT:");
        transferAMOUNTTF = new JTextField (5);
        transferB = new JButton ("TRANSFER");
        jcomp43 = new JLabel ("PAY BILL");
        payFROML = new JLabel ("FROM:");
        payFROMTF = new JTextField (5);
        payAMOUNTL = new JLabel ("AMOUNT:");
        payAMOUNTTF = new JTextField (5);
        payB = new JButton ("PAY");
        operationsTF = new JTextField (5);

        operationsTF.setEditable(false);
        clientTF.setEditable(false);
        accountTF.setEditable(false);

        JScrollPane scrollClient = new JScrollPane(clientTF);
        scrollClient.setBounds (330, 195, 690, 50);
        scrollClient.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        JScrollPane scrollAccount = new JScrollPane(accountTF);
        scrollAccount.setBounds (330, 560, 690, 50);
        scrollAccount.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);





        //set component bounds (only needed by Absolute Positioning)
        logout.setBounds(900,5,100,25);
        clientIDL.setBounds (45, 35, 100, 25);
        clientIDTF.setBounds (180, 35, 100, 25);
        clientNAMEL.setBounds (45, 70, 100, 25);
        clientNAMETF.setBounds (180, 70, 100, 25);
        clientCNTF.setBounds (180, 105, 100, 25);
        clientCNL.setBounds (45, 105, 100, 25);
        clientPCL.setBounds (45, 140, 115, 20);
        clientPCTF.setBounds (180, 140, 100, 25);
        clientADDRESSL.setBounds (45, 175, 100, 25);
        clientADDRESSTF.setBounds (180, 175, 100, 25);
        clientEMAILL.setBounds (45, 210, 100, 25);
        clientEMAILTF.setBounds (180, 210, 100, 25);
        addClientB.setBounds (600, 45, 100, 25);
        updateClientB.setBounds (600, 95, 100, 25);
        viewClientB.setBounds (600, 145, 100, 25);
        jcomp17.setBounds (120, 5, 100, 25);
        jcomp18.setBounds (120, 350, 100, 25);
        accountIDL.setBounds (45, 400, 100, 25);
        accountIDTF.setBounds (180, 400, 100, 25);
        accountMONEYL.setBounds (45, 435, 100, 25);
        accountMONEYTF.setBounds (180, 435, 100, 25);

        accountTYPEL.setBounds (45, 470, 100, 25);
        accountTYPETF.setBounds (180, 470, 100, 25);
        accountIDCLIENTL.setBounds (45, 505, 100, 25);
        accountIDCLIENTTF.setBounds (180, 505, 100, 25);
        addAccountB.setBounds (600, 405, 100, 25);
        updateAccountB.setBounds (600, 445, 100, 25);
        deleteAccountB.setBounds (600, 485, 100, 25);
        viewAccountB.setBounds (600, 525, 100, 25);
        jcomp35.setBounds (120, 635, 100, 25);
        transferFROML.setBounds (45, 665, 100, 25);
        transferFROMTF.setBounds (180, 665, 100, 25);
        transferTOL.setBounds (45, 700, 100, 25);
        transferTOTF.setBounds (180, 700, 100, 25);
        transferAMOUNTL.setBounds (45, 735, 100, 25);
        transferAMOUNTTF.setBounds (180, 735, 100, 25);
        transferB.setBounds (355, 700, 100, 25);
        jcomp43.setBounds (625, 630, 100, 25);
        payFROML.setBounds (570, 665, 100, 25);
        payFROMTF.setBounds (660, 665, 100, 25);
        payAMOUNTL.setBounds (570, 710, 100, 25);
        payAMOUNTTF.setBounds (660, 710, 100, 25);
        payB.setBounds (835, 685, 100, 25);
        operationsTF.setBounds (385, 740, 430, 30);


        //add components
        employeeFrame.add (logout);
        employeeFrame.add (clientIDL);
        employeeFrame.add (clientIDTF);
        employeeFrame.add (clientNAMEL);
        employeeFrame.add (clientNAMETF);
        employeeFrame.add (clientCNTF);
        employeeFrame.add (clientCNL);
        employeeFrame.add (clientPCL);
        employeeFrame.add (clientPCTF);
        employeeFrame.add (clientADDRESSL);
        employeeFrame.add (clientADDRESSTF);
        employeeFrame.add (clientEMAILL);
        employeeFrame.add (clientEMAILTF);
        employeeFrame.add (addClientB);
        employeeFrame.add (updateClientB);
        employeeFrame.add (viewClientB);
        employeeFrame.add (scrollClient);
        employeeFrame.add (jcomp17);
        employeeFrame.add (jcomp18);
        employeeFrame.add (accountIDL);
        employeeFrame.add (accountIDTF);
        employeeFrame.add (accountMONEYL);
        employeeFrame.add (accountMONEYTF);

        employeeFrame.add (accountTYPEL);
        employeeFrame.add (accountTYPETF);
        employeeFrame.add (accountIDCLIENTL);
        employeeFrame.add (accountIDCLIENTTF);
        employeeFrame.add (addAccountB);
        employeeFrame.add (updateAccountB);
        employeeFrame.add (deleteAccountB);
        employeeFrame.add (viewAccountB);
        employeeFrame.add (scrollAccount);
        employeeFrame.add (jcomp35);
        employeeFrame.add (transferFROML);
        employeeFrame.add (transferFROMTF);
        employeeFrame.add (transferTOL);
        employeeFrame.add (transferTOTF);
        employeeFrame.add (transferAMOUNTL);
        employeeFrame.add (transferAMOUNTTF);
        employeeFrame.add (transferB);
        employeeFrame.add (jcomp43);
        employeeFrame.add (payFROML);
        employeeFrame.add (payFROMTF);
        employeeFrame.add (payAMOUNTL);
        employeeFrame.add (payAMOUNTTF);
        employeeFrame.add (payB);
        employeeFrame.add (operationsTF);


        logout.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {


                employeeFrame.dispose();
                JFrame frame = introFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();

            }
        });



        addClientB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
               try{int id= Integer.parseInt(clientIDTF.getText());
               String name = clientNAMETF.getText();
                int cardNumber = Integer.parseInt(clientCNTF.getText());
                int personalCode = Integer.parseInt(clientPCTF.getText());
                String address = clientADDRESSTF.getText();
                String email = clientEMAILTF.getText();

                   clientTF.setText(EmployeeBusiness.addClient(user,id,name,cardNumber,personalCode,address,email));
                }
                catch (Exception ex){
                    clientTF.setText("Datele introduse sunt eronate! Reintroduceti!");
                }
                finally {
                    clientIDTF.setText("");
                    clientNAMETF.setText("");
                    clientCNTF.setText("");
                    clientPCTF.setText("");
                    clientADDRESSTF.setText("");
                    clientEMAILTF.setText("");


                }

            }
        });


        updateClientB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                try{int id= Integer.parseInt(clientIDTF.getText());
                    String name = clientNAMETF.getText();
                    int cardNumber = Integer.parseInt(clientCNTF.getText());
                    int personalCode = Integer.parseInt(clientPCTF.getText());
                    String address = clientADDRESSTF.getText();
                    String email = clientEMAILTF.getText();

                    clientTF.setText(EmployeeBusiness.updateClient(user,id,name,cardNumber,personalCode,address,email));
                }
                catch (Exception ex){
                    clientTF.setText("Datele introduse sunt eronate! Reintroduceti!");
                }
                finally {
                    clientIDTF.setText("");
                    clientNAMETF.setText("");
                    clientCNTF.setText("");
                    clientPCTF.setText("");
                    clientADDRESSTF.setText("");
                    clientEMAILTF.setText("");


                }

            }
        });

        viewClientB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                try{int id= Integer.parseInt(clientIDTF.getText());


                    clientTF.setText(EmployeeBusiness.viewClient(id));
                }
                catch (Exception ex){
                    clientTF.setText("Datele introduse sunt eronate! Reintroduceti!");
                }
                finally {
                    clientIDTF.setText("");
                    clientNAMETF.setText("");
                    clientCNTF.setText("");
                    clientPCTF.setText("");
                    clientADDRESSTF.setText("");
                    clientEMAILTF.setText("");


                }

            }
        });

        addAccountB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    int id= Integer.parseInt(accountIDTF.getText());
                    int money = Integer.parseInt(accountMONEYTF.getText());

                    LocalDate date  = LocalDate.now();


                    String type = accountTYPETF.getText();
                    int idClient = Integer.parseInt(accountIDCLIENTTF.getText());



                  accountTF.setText(EmployeeBusiness.addAccount(user,id,money,date,type,idClient));
                }
                catch (Exception ex){
                   accountTF.setText("Datele introduse sunt eronate! Reintroduceti!");
                }
                finally {
                   accountIDTF.setText("");
                    accountMONEYTF.setText("");

                    accountTYPETF.setText("");
                    accountIDCLIENTTF.setText("");


                }

            }
        });

        deleteAccountB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    int id= Integer.parseInt(accountIDTF.getText());

                    accountTF.setText(EmployeeBusiness.removeAccount(user,id));
                }
                catch (Exception ex){
                    accountTF.setText("Datele introduse sunt eronate! Reintroduceti!");
                }
                finally {
                    accountIDTF.setText("");
                    accountMONEYTF.setText("");

                    accountTYPETF.setText("");
                    accountIDCLIENTTF.setText("");


                }

            }
        });


        viewAccountB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    int id= Integer.parseInt(accountIDTF.getText());

                    accountTF.setText(EmployeeBusiness.accountInfo(id));
                }
                catch (Exception ex){
                    accountTF.setText("Datele introduse sunt eronate! Reintroduceti!");
                }
                finally {
                    accountIDTF.setText("");
                    accountMONEYTF.setText("");

                    accountTYPETF.setText("");
                    accountIDCLIENTTF.setText("");


                }

            }
        });
        updateAccountB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    int id= Integer.parseInt(accountIDTF.getText());
                    int money = Integer.parseInt(accountMONEYTF.getText());

                    LocalDate date  = LocalDate.now();

                    String type = accountTYPETF.getText();
                    int idClient = Integer.parseInt(accountIDCLIENTTF.getText());



                    accountTF.setText(EmployeeBusiness.updateAccount(user,id,money,date,type,idClient));
                }
                catch (Exception ex){
                    accountTF.setText("Datele introduse sunt eronate! Reintroduceti!");
                }
                finally {
                    accountIDTF.setText("");
                    accountMONEYTF.setText("");
                    accountTYPETF.setText("");
                    accountIDCLIENTTF.setText("");


                }

            }
        });

        transferB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    int from = Integer.parseInt(transferFROMTF.getText());
                    int to = Integer.parseInt(transferTOTF.getText());
                    int amount = Integer.parseInt(transferAMOUNTTF.getText());

                    operationsTF.setText(EmployeeBusiness.transferMoney(user,from,to,amount));
                }
                catch (Exception ex){
                    operationsTF.setText("Datele introduse sunt eronate! Reintroduceti!");
                }
                finally {
                   transferAMOUNTTF.setText("");
                    transferTOTF.setText("");
                    transferFROMTF.setText("");


                }

            }
        });

        payB.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    int from = Integer.parseInt(payFROMTF.getText());
                    int amount = Integer.parseInt(payAMOUNTTF.getText());

                    operationsTF.setText(EmployeeBusiness.payBill(user,from,amount));
                }
                catch (Exception ex){
                    operationsTF.setText("Datele introduse sunt eronate! Reintroduceti!");
                }
                finally {
                   payAMOUNTTF.setText("");
                    payFROMTF.setText("");

                }

            }
        });

        return employeeFrame;
    }

    public static JFrame introFrame(){

        JLabel intro;
        JTextField username;
        JPasswordField password;
        JButton login;
        JLabel error;

        JFrame introFrame = new JFrame("INTRO PAGE");
        introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        introFrame.pack();
        introFrame.setVisible(true);


        intro = new JLabel("Introduceti username-ul si parola:");
        username = new JTextField(5);
        password = new JPasswordField(5);
        login = new JButton("LOGIN");
        error = new JLabel("");


        //adjust size and set layout
        introFrame.setPreferredSize(new Dimension(250, 280));
        introFrame.setLayout(null);


        //set component bounds (only needed by Absolute Positioning)
        intro.setBounds(13, 50, 225, 25);
        username.setBounds(80, 95, 100, 25);
        password.setBounds(80, 140, 100, 25);
        login.setBounds(95, 185, 75, 30);
        error.setBounds(115,215,100,25);

        error.setForeground(Color.red);
       login.addActionListener(new ActionListener()
                                           {

                                               public void actionPerformed(ActionEvent e)
                                               {
                                                   String passText = new String(password.getPassword());
                                                   if(username.getText().equals("admin") && passText.equals("admin")){
                                                      introFrame.setVisible(false);

                                                       JFrame adminFrame = adminFrame();
                                                       adminFrame.setVisible(true);
                                                       adminFrame.pack();
                                                       adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                   }
                                                   else{
                                                       AdminBusiness buss = new AdminBusiness();

                                                       try {

                                                           if(buss.isEmployee(username.getText(),passText)){
                                                               introFrame.setVisible(false);
                                                               String user = username.getText();
                                                               JFrame empFrame = empFrame(user);
                                                               empFrame.setVisible(true);
                                                               empFrame.pack();
                                                               empFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                           }
                                                           else{
                                                               error.setText("ERROR");
                                                               username.setText("");
                                                               password.setText("");
                                                           }
                                                       } catch (Exception e1) {

                                                           e1.printStackTrace();

                                                       }


                                                   }
                                               }
                                           });

        //add components
        introFrame.add(intro);
        introFrame.add(username);
        introFrame.add(password);
        introFrame.add(login);
        introFrame.add(error);


        return introFrame;
    }



    public static void main (String[] args) {
        JFrame main = introFrame();
        main.setVisible(true);
        main.pack();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
}
