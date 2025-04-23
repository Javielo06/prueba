import java.util.Scanner;

public class GasolineraCapacidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la capacidad actual del estanque:");
        double capTanque = scanner.nextDouble();

        if ( capTanque == 70){
            System.out.println("El Tanque Está Lleno");
        }else if((capTanque < 70) && (capTanque >= 60)) {
            System.out.println("Estanque Casi Lleno");

        }else if ((capTanque < 60) && (capTanque >= 40)) {
            System.out.println("Estanque a 3/4");

        } else if ((capTanque < 40) && (capTanque >= 35)) {
            System.out.println("Medio Estanque");

        } else if ((capTanque < 35) && (capTanque >= 20 )) {
            System.out.println("Suficiente");

        } else if ((capTanque < 20) && (capTanque >= 1)) {
            System.out.println("Insuficiente");
        }
    }
}
