import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        // variable = condicion ? si es verdadero: si es falso;
         String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu calificación en matemáticas");
        double calificacionMat = scanner.nextDouble();

        System.out.println("Ingresa tu calificación en ciencias");
        double calificacionCie = scanner.nextDouble();

        System.out.println("Ingresa tu calificación en historia");
        double calificacionHis = scanner.nextDouble();

        promedio = ( calificacionMat + calificacionCie + calificacionHis) / 3;

        estado = promedio >= 6.00 ? "Aprobado" : "Reprobado"; // ? pregunta si se cumple la condicion seguido de lo que debe mostrar : si no se cumple
        System.out.println("Tu promedio es: " + promedio);
        System.out.println("Por lo tanto estas: " + estado);

    }
}
