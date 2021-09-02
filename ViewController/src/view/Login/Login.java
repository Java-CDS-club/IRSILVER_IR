package view.Login;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;
//import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
//import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;



import view.DatabaseConnection.DatabaseConnection;

public class Login {

    // generating static variables to use in different scopes
    private static String role_master_id;
    private static String user_master_id;
    private static String company_id;
    private static String company_name;
    private static String sessUName;
    private static String sessCName;
//    private static Date COStart_Date;
//    private static String COEnd_Date;
//    private static String abc_Date;
    
    private RichInputText it1;
    private RichInputText it2;
    private RichLink l1;
//    private RichButton b1;
//    private RichPanelGroupLayout pgl2;
//    private RichButton b2;


    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }
     

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }
    

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }

    ///////////////////////////////////////////

    public String showMessage(String msgs) {
        String messageText = msgs;
        FacesMessage fm = new FacesMessage(messageText);
        /**
             * set the type of the message.
             * Valid types: error, fatal,info,warning
             */
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        return null;
    }
    // session value storing function
    public static void storeOnSession(String key, Object object) {
        FacesContext ctx = FacesContext.getCurrentInstance();
        Map sessionState = ctx.getExternalContext().getSessionMap();
        sessionState.put(key, object);
    }


    //user logging in
    public String login_action() {
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        
        // Add event code here...
        String username = this.getIt1().getValue().toString();
        String password = this.getIt2().getValue().toString();

        sessUName = username;
        storeOnSession("sessUName", sessUName);
        System.out.println("value for session..............." + sessUName);
        
        System.out.println(".......................................................................");
        System.out.println(".......................................................................");
        System.out.println("Entered username is : " + username + "....and password is : " + password);
        System.out.println(".......................................................................");
        System.out.println(".......................................................................");
        System.out.println(dateFormat.format(date));
        Connection conn;
        

        try {
            conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rset =
                stmt.executeQuery("SELECT role_master_id,user_master_id,company_id,col_code,Tbl_Company.NAME FROM tbl_user_master,Tbl_Company " +
                "where Tbl_Company.ID=company_id And user_master_name = '" + username + "' and user_master_pwd = '" + password + "'");

            if (rset.next()) {
                //                conn.close();
                //getting data against column from table
                role_master_id = (rset.getString("role_master_id")).toString();
                user_master_id = (rset.getString("user_master_id")).toString();
                company_id = (rset.getString("company_id"));
                company_name = (rset.getString("name"));
                
//                COStart_Date = (rset.getDate("Start_Date"));
//                COEnd_Date = (rset.getString("End_Date")).toString();
                
                
//                if (rset.wasNull()) {
//                    project_id = ""; // set it to empty string as you desire.
//                }
//                
                
                if(rset.getString("company_id") != null)
                {
                    company_id = rset.getString("company_id").toString();
                }
                else
                {
                    company_id = "";
                }
                
                
                //Storing value in session username from input text field and role_master_id from DB

                System.out.println(".........User Name stored in session is :..." + username + "...");
//                System.out.println(".........User Password stored in session is :..." + password + "...");
                System.out.println(".........User Role stored in session is :..." + role_master_id + "...");
                System.out.println(".........User Master ID stored in session is :..." + user_master_id + "...");
                System.out.println(".........Company ID stored in session is :..." + company_id + "...");
                System.out.println(".........Company Name stored in session is :..." + company_name + "...");
                
//                System.out.println(".........Company Start Date in session is :..." + COStart_Date + "...");
                
                storeOnSession("sessRMID", role_master_id);                
                storeOnSession("sessUMID", user_master_id);               
                storeOnSession("sessCoID", company_id);
                storeOnSession("sessCoName", company_name);
               
                
                conn.close();
                
//                if(dateFormat.format(date) > COStart_Date){
                    
                return "/faces/Main_Pages/Dashboard.jsf?faces-redirect=true";
//                }
            } else {
                showMessage("Wrong Login Credentials");
                conn.close();
                System.out.println("........wrong login credentials........");
                //return "/faces/Main_Pages/Login.jsf?faces-redirect=true";
                return "false";

            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return role_master_id;
    }

    //Logout > session cleared and session variable cleared
    public String logout_action() {
        System.out.println("logout called");
        sessUName = "";
        role_master_id = "";
        storeOnSession("sessUName", "");
        storeOnSession("sessUID", "");
        storeOnSession("sessCoID", "");
        storeOnSession("sessRID", "");
        //        return "good";
        return "/faces/Main_Pages/Login.jsf?faces-redirect=true";
    }
}
