import java.util.Scanner;

public class PracticaFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingresa un numero para mostrarte sus multiplos" );
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero +" X " + i + " = " + i * numero);
            
        }
        System.out.println(" Ingresa un numero ");
        int numero2 = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= numero2; i++){
            suma += i;

        }
        System.out.print("los primeros numeros " + numero2 + " suman: " +suma );
    }
    
}
