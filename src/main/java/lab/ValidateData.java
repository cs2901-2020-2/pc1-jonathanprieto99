package lab;
import java.util.logging.Logger;

public class ValidateData {
    static final Logger logger = Logger.getLogger(ValidateData.class.getName());
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public static boolean validarTitulo(String titulo){
        if(ValidateData.isNumeric(titulo.substring(0,4))){
            logger.info("Paso1");
            if (titulo.charAt(5) == '-'){
                logger.info("Paso2");
                if(titulo.startsWith("I ", 6) || titulo.startsWith("II", 6)){
                    logger.info("Paso3");
                    if (titulo.charAt(7) == ' '){
                        logger.info("Paso4");
                        if(titulo.substring(9,14).matches("^[a-zA-Z0-9]*$")){
                            logger.info("Paso5");
                            if (titulo.charAt(14) == ' '){
                                logger.info("Paso6");
                                if(titulo.startsWith("ES", 16) || titulo.startsWith("EN", 16)){
                                    logger.info("Paso7");
                                      return true;
                                    }

                                }

                            }

                        }

                    }

                }

            }
        return false;
    }
    public static boolean validarUrl(String url){
        return url.startsWith("https://utec.zoom.us/rec/share/");
    }
}
