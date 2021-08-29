/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GanapriyaS
 */
public class dbConnection {
//    con static as can use only static inside static method
    static Connection con;
//    method is public so other package can use it
//    static method as no need to create object for all connection in login.java
//    or else in login.java
//    DbConnection db=new Dbconnection();
//    Connection con=db.getconnect();
    
    static public Connection getConnect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bill","root","");           
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        return con;
    }
}
