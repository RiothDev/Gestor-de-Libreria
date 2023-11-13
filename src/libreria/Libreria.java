package libreria;

import libreria.UI.Sesion;
import libreria.Data.LibreriaDatabaseModel;

public class Libreria {
    public static void main(String[] args) {
        LibreriaDatabaseModel model = new LibreriaDatabaseModel("jdbc:mysql://localhost:3306/libreria", "root", "password");
        model.connect();
        
        Sesion sesion = new Sesion(model);
        sesion.setVisible(true);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            model.close();
        }));
    }
}