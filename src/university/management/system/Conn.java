/*
SQL connectivity is done in 5 strps - 
    1.Registering the Driver Class.
    2.Creating Connection String
    3.Creating Statement
    4.Executing MySQL Queries
    5.Closing the Connection
*/
package university.management.system;
import java.sql.*;
public class Conn {
    
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver class is registered here.
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","sms124"); //This is the connection string
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
