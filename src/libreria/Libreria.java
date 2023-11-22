package libreria;

import libreria.UI.Sesion;
import libreria.Data.LibreriaDatabaseModel;
import java.io.*;

public class Libreria {
    public static String[] getInformation() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Setup.ini"))) {
            String line;
            
            String[] array = new String[3];
            
            for(int i = 0; (line = reader.readLine()) != null; i++) {
                array[i] = line.split("=")[1];
            }
            
            return array;
            
        } catch(IOException e) {
            System.out.println("Error al intentar conseguir la información de la base de datos.");
            
            return new String[1];
        }
    }
    
    public static void main(String[] args) {
        String[] data = getInformation();
        
        LibreriaDatabaseModel model = new LibreriaDatabaseModel(data[0], data[1], data[2]);
        model.connect();
        
        Sesion sesion = new Sesion(model);
        sesion.setVisible(true);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            model.close();
        }));
    }
}