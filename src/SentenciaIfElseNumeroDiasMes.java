import java.util.Scanner;

public class SentenciaIfElseNumeroDiasMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el mes que deseas evaluar");
        int mes = s.nextInt();
        int numeroDias = 0;
        System.out.println("Ingresa eñ año que quieres saber si es biciestro");
        int anio = s.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {  //meses con 31 dias
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                numeroDias = 29; // bisiesto
            } else {
                numeroDias = 28;  //no bisiesto
            }
        }
        System.out.println("numeroDias = " + numeroDias);
    }
}