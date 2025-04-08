public class PrimitivosCaracteres {
    public static void main(String[] args) {
        //se puede agregar el caracter por codigo de sitema operativo
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracter));

        char espacio = '\u0020'; // el espacio tambien se puede agregar con comillas ' '
        char retroceso = '\b'; //elimina un caracter hacia atrás
        char tabulador = '\t'; //tabulador
        char nuevaLinea = '\n';
        char retornoCarro = '\r';



        System.out.println("char corresponde en \t byte ="+ retornoCarro +Character.BYTES);
        System.out.println("char corresponde en bites = " +Character.SIZE);
        System.out.println("character.MIN_VALUE = " +Character.MIN_VALUE);
        System.out.println("character.MAX_VALUE = " +Character.MAX_VALUE);





    }
}
