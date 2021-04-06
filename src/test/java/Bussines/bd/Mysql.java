package Bussines.bd;

import org.junit.Assert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {

    Connection conn;

    public Connection getConnection(){
        try {
            String url = "jdbc:mysql//localhost:8080/phpmyadmin/";
            String user = "root";
            String pass = "";

             conn = DriverManager.getConnection(url, user, pass);
            return conn;

        }catch (SQLException e) {
            Assert.fail("Error de conexión a Mysql, se detecta en" + e.getMessage());
                e.printStackTrace();
            }
            return  null;
    }

    public void cerrarConexion(){
        try {
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
