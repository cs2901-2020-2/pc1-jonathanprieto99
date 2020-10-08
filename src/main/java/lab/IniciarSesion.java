package lab;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class IniciarSesion{
    public static RegistrApp readUser() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (name.isEmpty()){
            throw new Exception("¡El nombre que ingreso esta vacio!");
        }
        else{
            return new RegistrApp();
        }
    }
}
