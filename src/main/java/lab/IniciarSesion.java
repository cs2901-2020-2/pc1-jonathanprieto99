package lab;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class IniciarSesion{
    public static void readConsole(String args[]) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name);
    }
}
