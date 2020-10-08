package lab;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.logging.Logger;

public class IniciarSesion{

    static final Logger logger = Logger.getLogger(IniciarSesion.class.getName());

    public static RegistrApp readUser() throws Exception {
        logger.info("Ingresar nombre: ");
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
