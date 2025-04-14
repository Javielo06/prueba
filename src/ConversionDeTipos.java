public class ConversionDeTipos {
    public static void main(String[] args) {
       String numeroStr = "50";

       int numeroInt = Integer.parseInt(numeroStr); // convierte la cadena de texto a un numero
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "958.30";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "FALSE";  //Convierte de texto a boolean
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        
        String otroNumeroStr = Integer.toString(otroNumeroInt); // convierte numero a cadena de texto
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroInt);
        
        double otroRealDouble = 234.45;  // convierte numero a cadena de texto
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(123456.66);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 10000;
        short s = (short) i; //casteo forza la conversion
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
    }
}
