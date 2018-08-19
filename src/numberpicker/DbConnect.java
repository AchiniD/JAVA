/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpicker;

import java.sql.*;

/**
 *
 * @author Kalana Hettiarachchi
 */

public class DbConnect {

    public static Connection connect(){
        
        Connection con = null;
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafinalassignment","root","");
        }catch(Exception e){
            System.out.println(e);
        }
      return con;
    }
    
}
