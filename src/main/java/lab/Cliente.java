package lab;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer{

    int clientId;

    private String[]datos = new String[2];

    public Cliente(int id) {
        clientId = id;
    }

    public void update(Observable estacion, Object values) {
        this.datos = (String []) values;
    }

    public String[] getData() {
        return datos;
    }

}

