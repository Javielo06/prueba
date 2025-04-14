import java.awt.*;
import java.util.Scanner;

public class EjerciciosComparativoCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



            String nombre1 = "";
            String nombre2 = "";
            String apellido = "";

            System.out.println("Ingresa tu primer nombre");
            nombre1 = scanner.nextLine();

            System.out.println("Ingresa tu segundo nombre");
            nombre2 = scanner.nextLine();

            System.out.println("Ingresa tu apellido paterno");
            apellido = scanner.nextLine();

            System.out.println("su nombre es: " + nombre1.concat(" ").concat(nombre2).concat(" ").concat(apellido) );
            
            String frase1 = "";
            String frase2 = "";

            System.out.println("Ingresa una frase" );
            frase1 = scanner.nextLine();

            System.out.println("Ingresa la misma frase");
            frase2 = scanner.nextLine();

            String comparativo = String.valueOf(frase1.equals(frase2));
            System.out.println("comparativo = " + comparativo);

            String comparativo2 = String.valueOf(frase1.equalsIgnoreCase(frase2));
            System.out.println("comparativo2 = " + comparativo2);

            String text1 = "hola";
            String text2 = "mundo";
            StringBuilder prueba= new StringBuilder();

            prueba.append(text1).append(" ").append(text2);
            System.out.println("prueba = " + prueba);
    }
}
