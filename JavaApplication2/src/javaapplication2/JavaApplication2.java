/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
          
try{ 
        Connection con; 
        con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.0.70:1521:cas","fdp7","fdp7"); 
         if (con != null) 
         {
             System.out.println("Connection Established");
             Statement stmt = con.createStatement();
             ResultSet rs =stmt.executeQuery("select * from addressbook");
             while(rs.next())
             {
                 String name= rs.getString(1);
                 String mob= rs.getString(1);
                 String email= rs.getString(1);
                 System.out.println("name:" + name);
                 System.out.println("mob:" + mob);
                 System.out.println("email:" + email);
             }
         } catch(Exception e) { System.out.println("Connection Failed");}
         }
    }

   

