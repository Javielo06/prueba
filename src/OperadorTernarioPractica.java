import java.util.Scanner;

public class OperadorTernarioPractica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    /*    System.out.println("Ingresa un numero entero");
        int numeroEntero = scanner.nextInt();

        String resultado = (numeroEntero % 2 == 0) ? "Es par" : "No es par";
        System.out.println("resultado = " + resultado);     */

        System.out.println("Ingresa tu edad");
        int edad = scanner.nextInt();

        String mayorEdad = edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(mayorEdad);

    }
}
