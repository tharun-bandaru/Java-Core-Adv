package com.tcs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Example {
   public static void main(String args[]) {
      //Getting the connection
      String mysqlUrl = "oracle.jdbc.driver.OracleDriver";
      System.out.println("Connection established......");
      //Registering the Driver
      try(Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
      Statement stmt = con.createStatement(); ) {
         try(ResultSet rs = stmt.executeQuery("select * from MyPlayers");){
            //Retrieving the data
            while(rs.next()) {
               System.out.print(rs.getInt("ID")+", ");
               System.out.print(rs.getString("First_Name")+", ");
               System.out.print(rs.getString("Last_Name")+", ");
               System.out.print(rs.getDate("Date_Of_Birth")+", ");
               System.out.print(rs.getString("Place_Of_Birth")+", ");
               System.out.print(rs.getString("Country"));
               System.out.println();
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      } catch (SQLException e) {
            e.printStackTrace();
      }
   }
}
