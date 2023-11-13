package libreria.Data;

import java.sql.*;

public abstract class DefaultDatabaseModel {
    protected Connection currentConnection;
    protected String url, user, password;
    
    public DefaultDatabaseModel(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
    
    public void connect() {
        try {
            this.currentConnection = DriverManager.getConnection(url, user, password);
            System.out.println("La conexión fue activada exitosamente...");
            
        } catch(SQLException e) {
            System.out.println("Error al intentar conectar con la base de datos.");
        }
    }
    
    public Connection getConnection() {
        return currentConnection;
    }
    
    public abstract void executeQuery(String query, String parameters);
    
    public void close() {
        try {
            currentConnection.close();
            System.out.println("La conexión fue cerrada...");
            
        } catch(SQLException e) {
            System.out.println("Error al intentar cerrar conexión con la base de datos.");
        }
    }
;}