import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es la tabla de multiplicar que deseas del 1 al 10?");
        int tabla = scanner.nextInt();

        System.out.println("tabla del " +tabla);
        bucletabla:
        for (int i = 1; i <= 10; i++){
            System.out.println(tabla + " x " + i  + " = " + (tabla   *i) );
            continue bucletabla;
        }

        System.out.println("Ingresa un numero de filas");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
