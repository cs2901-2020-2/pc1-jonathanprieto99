package lab;

import com.sun.org.apache.xpath.internal.operations.String;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrAppTest {
    @Test
    public void test_get_data_single() {
        RegistrApp estacion_principal = new RegistrApp();
        Cliente nuevoCliente = new Cliente(0);
        estacion_principal.addObserver(nuevoCliente);
        estacion_principal.addData(32.0,43.33,56.0);

        Assert.assertEquals(nuevoCliente.getData(), estacion_principal.getData());
    }

    @Test
    public void test_get_data_multiple() {
        RegistrApp estacion_principal = new RegistrApp();
        Cliente nuevoCliente0 = new Cliente(0);
        Cliente nuevoCliente1 = new Cliente(1);
        Cliente nuevoCliente2 = new Cliente(2);
        Cliente nuevoCliente3 = new Cliente(3);
        Cliente nuevoCliente4 = new Cliente(4);

        estacion_principal.addObserver(nuevoCliente0);
        estacion_principal.addObserver(nuevoCliente1);
        estacion_principal.addObserver(nuevoCliente2);
        estacion_principal.addObserver(nuevoCliente3);
        estacion_principal.addObserver(nuevoCliente4);

        estacion_principal.addData(32.0,43.33,56.0);

        Assert.assertEquals(nuevoCliente0.getData(), estacion_principal.getData());
        Assert.assertEquals(nuevoCliente1.getData(), estacion_principal.getData());
        Assert.assertEquals(nuevoCliente2.getData(), estacion_principal.getData());
        Assert.assertEquals(nuevoCliente3.getData(), estacion_principal.getData());
        Assert.assertEquals(nuevoCliente4.getData(), estacion_principal.getData());
    }

}

