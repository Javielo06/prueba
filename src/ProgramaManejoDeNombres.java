import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer nombre");
        String nombre1 = scanner.nextLine();
        String nombre1a = nombre1.toUpperCase().charAt(1)+"."+ nombre1.substring(nombre1.length()-2);

        System.out.println("Ingresa el segundo nombre");
        String nombre2 = scanner.nextLine();
        String nombre2a = nombre2.toUpperCase().charAt(1)+"."+ nombre2.substring(nombre2.length()-2);

        System.out.println("Ingresa el segundo nombre");
        String nombre3 = scanner.nextLine();
        String nombre3a = nombre3.toUpperCase().charAt(1)+"."+ nombre3.substring(nombre3.length()-2);

        String resultado = nombre1a + nombre2a + nombre3a;

        System.out.println(resultado);


        //System.out.println("Ingresa el segundo nombre");
        //String nombre2 = "";
        //nombre2 = scanner.nextLine();
        //char


        //ystem.out.println("Ingresa el tercer nombre");
        //String nombre3 = "";
        //nombre3 = scanner.nextLine();
        //char


        //System.out.println("nombre 1 = " + nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre1.substring(4,6)));
        //System.out.println("nombre 2 = " + nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(4,6)));
        //System.out.println("nombre 3 = " + nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(4,6)));


    }
}
