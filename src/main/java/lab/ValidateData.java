package lab;

public class ValidateData {
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
            if (titulo.charAt(5) == '-'){
                if(titulo.startsWith("I ", 6) || titulo.startsWith("II", 6)){
                    if (titulo.charAt(7) == ' '){
                        if(titulo.substring(9,14).matches("^[a-zA-Z0-9]*$")){
                            if (titulo.charAt(14) == ' '){
                                if(titulo.startsWith("ES", 16) || titulo.startsWith("EN", 16)){
                                      return true;
                                    }
                                    else {
                                        return false;
                                    }
                                }
                                else{
                                    return false;
                                }
                            }
                            else {
                                return false;
                            }
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            else{
                return false;
            }
        }
    public static boolean validarUrl(String url){
        return url.startsWith("https://utec.zoom.us/rec/share/");
    }
}
