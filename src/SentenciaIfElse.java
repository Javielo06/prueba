public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 5.8f;
        if(promedio >= 6.5){
            System.out.println("Felicitaciones excelente promedio");
        }else if (promedio >=6.0) {
            System.out.println(" muy buen promedio");

        } else if (promedio >= 5.5) {
            System.out.println("buen promedio");
            
        } else if (promedio >= 5.0) {
            System.out.println("regular, necesitas mas esfuerzo");

        } else if (promedio >= 4.0) {
            System.out.println("insuficiente, estudiale");

        }else {
            System.out.println("reprobado");
        }
        System.out.println( "tu promedio es: " +promedio);


    }
}

