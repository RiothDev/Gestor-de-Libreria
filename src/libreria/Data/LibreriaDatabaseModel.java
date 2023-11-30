package libreria.Data;

import java.util.*;
import java.sql.*;

public class LibreriaDatabaseModel extends DefaultDatabaseModel {
    public LibreriaDatabaseModel(String url, String user, String password) {
        super(url, user, password);
    }

    @Override
    public void executeQuery(String query, String parameter) {
        try(Connection connection = this.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, parameter);

            statement.executeQuery();

        } catch(SQLException e) {
            System.out.println("Error al intentar ejecutar la query.");
        }
    }

    public LinkedHashMap<Integer, Map<String, Object>> getLibrosData() {
        try {
            Connection connection = this.getConnection();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM libros ORDER BY noLibro ASC");

            LinkedHashMap<Integer, Map<String, Object>> librosMap = new LinkedHashMap<>();

            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                
                Map<String, Object> newLibro = new HashMap<>();
                newLibro.put("autor", resultSet.getString("autor"));
                newLibro.put("titulo", resultSet.getString("titulo"));
                newLibro.put("ISBN", resultSet.getString("ISBN"));
                newLibro.put("noLibro", Integer.toString(resultSet.getInt("noLibro")));
                newLibro.put("edicion", resultSet.getString("edicion"));
                newLibro.put("cantidad", Integer.toString(resultSet.getInt("cantidad")));
                newLibro.put("prestados", Integer.toString(resultSet.getInt("prestados")));
                newLibro.put("editorial", resultSet.getString("editorial"));
                newLibro.put("categoria", resultSet.getString("categoria"));
                
                librosMap.put(id, newLibro);
            }

            return librosMap;

        } catch(SQLException e) {
            System.out.println("Error al intentar conseguir los datos.");

            LinkedHashMap<Integer, Map<String, Object>> map = new LinkedHashMap<>();
            Map<String, Object> def = new HashMap<>();

            def.put("usuario", "Error");
            def.put("pwd", "Error");
            def.put("especialidad", "Error");
            def.put("grado", 0);
            def.put("grupo", "Error");

            map.put(0, def);

            return map;
        }
    }

    public Map<Integer, Map<String, Object>> getUsersData() {
        try {
            Connection connection = this.getConnection();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");

            Map<Integer, Map<String, Object>> usersMap = new HashMap<>();

            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                
                Map<String, Object> newUser = new HashMap<>();
                newUser.put("usuario", resultSet.getString("usuario"));
                newUser.put("pwd", resultSet.getString("pwd"));
                newUser.put("especialidad", resultSet.getString("especialidad"));
                newUser.put("grado", Integer.toString(resultSet.getInt("grado")));
                newUser.put("grupo", resultSet.getString("grupo"));
                newUser.put("nombre", resultSet.getString("nombre"));
                newUser.put("credencial", resultSet.getString("credencial"));
                newUser.put("numero", Integer.toString(resultSet.getInt("numero")));

                usersMap.put(id, newUser);
            }

            return usersMap;

        } catch(SQLException e) {
            System.out.println("Error al intentar conseguir los datos.");

            Map<Integer, Map<String, Object>> map = new HashMap<>();
            Map<String, Object> def = new HashMap<>();

            def.put("usuario", "Error");
            def.put("pwd", "Error");
            def.put("especialidad", "Error");
            def.put("grado", 0);
            def.put("grupo", "Error");

            map.put(0, def);

            return map;
        }
    }
}