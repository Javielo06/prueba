import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num1 = s.nextInt();

        System.out.println("Ingresa un segundo numero");
        int num2 = s.nextInt();

        System.out.println("Los numeros ordenados: ");

        int mayor = num1 > num2 ? num1 : num2;
        System.out.println(mayor);

        int mayor2 = num2 < num1 ? num2 : num1 ;
        System.out.println(mayor2);

        }
    }

