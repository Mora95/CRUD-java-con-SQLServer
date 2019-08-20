/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectarSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mora
 */
public class MoraConnection {
    
    private static Connection cn;
    
    public static Connection getConnection(){
       try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=JavaAmigos", "sa", "123");
            
        }catch(Exception e){
            cn= null;
        }
                        return cn;
        
        
       /* try {
  String connectionUrl = "jdbc:sqlserver://;database=DB_Name;integratedSecurity=true;";
  conect = DriverManager.getConnection(connectionUrl);
  System.out.println("Conectado.");
} 
catch (SQLException ex) 
{
  System.out.println("Error.");
}*/
    }
    public static void main(String[] args){
      Connection pruebaCn = MoraConnection.getConnection();
        if(pruebaCn!=null){
            System.out.println("Conectado");
            System.out.println(""+pruebaCn);
        }else{
            System.out.println("Estamos desconectados");
        }
       // Connection pruebaCn = MoraConnection.getConnection();
    }
    
}
