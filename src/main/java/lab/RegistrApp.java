package lab;

import java.util.Observable;

public class RegistrApp extends Observable {

    private final String[] datos = new String[2];

    public void addData(String titulo, String enlace)throws Exception {
        setChanged();
        if(ValidateData.validarTitulo(titulo) && ValidateData.validarUrl(enlace)) {
            datos[0] = titulo;
            datos[1] = enlace;
            notifyObservers(datos);
        }
        else {
            throw new Exception("¡El formato de los parametros ingresados es incorrecto!");
        }
    }

    public String[] getData() {
        return datos;
    }
}
