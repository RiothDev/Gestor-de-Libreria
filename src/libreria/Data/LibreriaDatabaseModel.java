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

    public Map<Integer, Map<String, Object>> getLibrosData() {
        try {
            Connection connection = this.getConnection();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM libros");

            Map<Integer, Map<String, Object>> usersMap = new HashMap<>();

            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String autor = resultSet.getString("autor");
                String titulo = resultSet.getString("titulo");
                String ISBN = resultSet.getString("ISBN");

                Map<String, Object> newUser = new HashMap<>();
                newUser.put("autor", autor);
                newUser.put("titulo", titulo);
                newUser.put("ISBN", ISBN);
                
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

    public Map<Integer, Map<String, Object>> getUsersData() {
        try {
            Connection connection = this.getConnection();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");

            Map<Integer, Map<String, Object>> usersMap = new HashMap<>();

            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String usuario = resultSet.getString("usuario");
                String nombre = resultSet.getString("nombre");
                String pwd = resultSet.getString("pwd");
                String especialidad = resultSet.getString("especialidad");
                int grado = resultSet.getInt("grado");
                String grupo = resultSet.getString("grupo");

                Map<String, Object> newUser = new HashMap<>();
                newUser.put("usuario", usuario);
                newUser.put("pwd", pwd);
                newUser.put("especialidad", especialidad);
                newUser.put("grado", grado);
                newUser.put("grupo", grupo);
                newUser.put("nombre", nombre);

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