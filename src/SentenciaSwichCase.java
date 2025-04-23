import java.util.Scanner;

public class SentenciaSwichCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el numero del mes entre 1 y 12");
        int mes = s.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1: nombreMes = "Enero";
            break;
            case 2:
                nombreMes = "Febrero";
                break;
            case  3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes =  "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
        }
        System.out.println(nombreMes);



        int num = 1;
        switch (num){
            case 0:
                System.out.println("el numero es cero");
                break;
            case 1:
                System.out.println("el numero es uno");
                break;
            case 2:
                System.out.println("el numero es dos");
                break;  // se utliza para salir del swich y no continuar evaluando los demás casos
            case 3:
                System.out.println("el numero es tres");
                break;
            default:// se utiliza en caso de que no se encuentre coincidencia con ningun caso
                System.out.println("numero de caso no encontrado");
        }
        String nombre = "pepe";
        switch (nombre){
            case "admin":
                System.out.println("hola admin, bienvenido");
                break;
            case "pepe":
                System.out.println("hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
