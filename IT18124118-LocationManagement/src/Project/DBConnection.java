/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilshika
 */
public class DBConnection {

    //private Connection con = null;
    
    

  public Connection getConnection() {
      
        
        
        try{
                Class.forName("org.h2.Driver");
                
                Connection con = DriverManager.getConnection("jdbc:h2:./Database/test;IFEXISTS=TRUE", "sa","");
                System.err.println("Successfully connected");
                return con;
                
           }catch(Exception e){
               
               JOptionPane.showMessageDialog(null, "Database Connection Error \n" +e);
               return null;
           
           
           }
        
                
      }
    


}
