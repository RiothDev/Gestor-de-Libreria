package libreria;

import libreria.UI.Sesion;
import libreria.Data.LibreriaDatabaseModel;

public class Libreria {
    public static void main(String[] args) {
        LibreriaDatabaseModel model = new LibreriaDatabaseModel("jdbc:mysql://190.1.0.131:3306/22progb39", "22progb39", "userEnzo");
        model.connect();
        
        Sesion sesion = new Sesion(model);
        sesion.setVisible(true);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            model.close();
        }));
    }
}