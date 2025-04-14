import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de la factura");

        int numeroFactura = 0;
        try {
            numeroFactura = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Error debes de agregar numeros");
            main(args);
            System.exit(0);
        }

        System.out.println("su numero de factura es = " + numeroFactura);
    }
}
