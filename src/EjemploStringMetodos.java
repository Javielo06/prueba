import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Jesus";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Jesus\") = " + nombre.equals("Jesus"));
        System.out.println("nombre.equals(\"Jesus\") = " + nombre.equals("jesus"));
        System.out.println("nombre.equalsIgnoreCase(\"jesus\") = " + nombre.equalsIgnoreCase("jesus"));
        System.out.println("nombre.compareTo(\"Jesus\") = " + nombre.compareTo("Jesus"));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));
        System.out.println("nombre.substring(2) = " + nombre.substring(2));//muestra texto apartir de la posición indicada
        System.out.println("nombre.substring(1,3) = " + nombre.substring(3,5)); //(desde,hasta) contando la posición cero
        System.out.println("nombre.substring(nombre.length()-3) = " + nombre.substring(nombre.length()-3)); // obtiene posición de manera dinámica
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a",".")); // (caracter a reemplazar, caracter nuevo)
        System.out.println("trabalenguas.indexOf(\"ba\") = " + trabalenguas.indexOf("ba")); // (recorre desde la posición cero
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a")); // da la ultima posición donde se encuentra el caracter
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));// devuelve el valor como booleano si existe en la cadena
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("traba"));
        System.out.println("   trabalenguas   ");
        System.out.println("   trabalenguas   ".trim()); //quita espacios


    }
}
