/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
  * @author Hafees
 */
public class DBConnection {
    
//    private static DBConnection dbConnection;
//    
//    private static final int MAXIMUM_CONNECTIONS = 2;
//    
//    //connection pool
//    private ArrayList<Connection> idleConnections = new ArrayList<>();
//    private ArrayList<Connection> usedConnections = new ArrayList<>();
//    
//    private DBConnection(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            
//            for(int i=0;i<MAXIMUM_CONNECTIONS;i++){
//                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade","root","system");
//                idleConnections.add(connection);
//            }
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
//    
//    public static DBConnection getInstance(){
//        if (dbConnection == null){
//            System.out.println(" dbconnection");
//            dbConnection = new DBConnection();
//        }
//        return dbConnection;
//    }
//    
//    
//    public synchronized Connection getConnection(){
//        if (idleConnections.isEmpty()){
//            try {
//                wait();//should use with syncronized methods (Thread class=method)
//            } catch (InterruptedException ex) {
//                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        Connection connection = idleConnections.get(0);
//        usedConnections.add(connection);
//        idleConnections.remove(connection);
//        return connection;
//    }
//    
//    public synchronized void releaseConnection(Connection connection){
//        idleConnections.add(connection);
//        usedConnections.remove(connection);
//        notifyAll();
//    }
//    
//    public synchronized void releaseAllConnections(){
//        for (Connection usedConnection : usedConnections) {
//            idleConnections.add(usedConnection);
//        }
//        usedConnections.removeAll(usedConnections);
//        notifyAll();
//    }
        
}
