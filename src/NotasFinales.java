import java.util.Scanner;

public class NotasFinales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notas [] = new double[5];
        double suma = 0;
        int contador = 0;
        int contador2 = 0;
        double suma2 = 0;

        for(int i = 0; i < notas.length; i++) {
            System.out.println("Ingresa 20 notas finales del 1 al 7");
            notas[i] = scanner.nextDouble();
            if (notas[i] >= 5) {
                suma = suma + notas[i];
                contador++;
            }else if (notas[i] <= 4){
                suma2 = suma2 + notas[i];
                contador2 ++;
            }
        }
            if (contador > 0 ){
                System.out.println("Promedio de notas mayores a 5: " + suma /contador);
                System.out.println("promedio de notas menores a 4: " + suma2 /contador2);

            }
            for (int i = 0; i < notas.length; i++){
            if (notas[i] == notas.length) {


            }


    }

        }
}




