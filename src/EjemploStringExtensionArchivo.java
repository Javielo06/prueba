public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "alguna_imagen.pdf" ;
        int i = archivo.lastIndexOf("."); // nos da la ultima ocurrencia o donde aparace por ultimo el caracter
        System.out.println("cantidad de caracteres = "+ archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(i));
    }
}
