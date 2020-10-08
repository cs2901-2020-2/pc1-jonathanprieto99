package lab;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class IngresarData {

    static final Logger logger = Logger.getLogger(IngresarData.class.getName());

    public static void readInput(RegistrApp app) throws Exception {
        logger.info("Ingresar Titulo: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String titulo = reader.readLine();
        logger.info("Ingresar Url: ");
        String url = reader.readLine();
        app.addData(titulo, url);
    }
}
