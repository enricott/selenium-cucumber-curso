package Bussines.bd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultaMysql extends Mysql{

    private Connection con = getConnection();

    private ResultSet ejecutarQueryResultado(String query){
            ResultSet  rs = null;

            try {
                Statement stmt = con.createStatement();
                rs = stmt.executeQuery(query);

                if (rs != null){ // while (rs.next())
                    if (rs.next()){
                        System.out.println("Se journalizo correctamente en Mysql");
                    }
                }
            }catch (SQLException e) {
                System.out.println("El resultado Mysql fue null");
            }
        return rs;
    }

    public List<String> consultaProducto (String id_producto){
        List<String> datos = null;
        ResultSet rs = null;

        String query= "SELECT * FROM `productos` WHERE id_producto = "+id_producto;

        try {
            rs = ejecutarQueryResultado(query);
            int i = 0;
            datos = new ArrayList<>();
            if (rs !=null){
                while (rs.next()){
                    datos.add(i,rs.getString(2));
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return datos;
    }


}
