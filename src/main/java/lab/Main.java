package lab;
import java.util.Arrays;
import java.util.logging.Logger;

public class Main {

    static final Logger logger = Logger.getLogger(IngresarData.class.getName());

    static void main(String[] args) throws Exception {

        RegistrApp mainApp = IniciarSesion.readUser();

        Cliente nuevoCliente = new Cliente(0);

        mainApp.addObserver(nuevoCliente);

        IngresarData.readInput(mainApp);

        logger.info("Valor Cliente: "+ Arrays.toString(nuevoCliente.getData())+", Valor Servidor: "+ Arrays.toString(mainApp.getData()));


    }
}
