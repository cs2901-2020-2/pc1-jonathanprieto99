package lab;

import java.util.Observable;

public class RegistrApp extends Observable {

    private final String[] datos = new String[2];

    public void addData(String titulo, String enlace) {
        setChanged();
        datos[0] = titulo;
        datos[1] = enlace;
        notifyObservers(datos);
    }

    public String[] getData() {
        return datos;
    }
}
