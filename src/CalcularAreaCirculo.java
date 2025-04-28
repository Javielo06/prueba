import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo que deseas calcular");
        double usuarioRadio = s.nextDouble();

        double area = Math.PI * Math.pow(usuarioRadio,2);
        System.out.println("El area del circulo es = " + area + " cm²");
        
    }
}
