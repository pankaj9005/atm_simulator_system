package bank.management.system;

import java.sql.*;
public class Conn {
  
    Connection c;
    Statement s;
    
    public  Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystems","root","Pankaj@#$2075");
            s = c.createStatement();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
}
