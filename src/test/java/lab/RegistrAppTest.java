package lab;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrAppTest {
    @Test
    public void test_get_data_single() throws Exception {

        RegistrApp mainApp = IniciarSesion.readUser();

        Cliente nuevoCliente = new Cliente(0);

        mainApp.addObserver(nuevoCliente);

        IngresarData.readInput(mainApp);

        Assert.assertEquals(nuevoCliente.getData(), mainApp.getData());
    }
}