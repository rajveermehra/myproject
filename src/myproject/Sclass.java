/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;
import java.sql.*;
/**
 *
 * @author Rajveermehra
 */
public class Sclass {
     public static Connection ConnectDB()
    {Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/mess","root","");
        System.out.println("connect");
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e);
    }
    return con;
    }
    
}
