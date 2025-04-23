public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        bucle1:
        for (int i = 0; i < 5; i++){
            if (i == 2){
               continue bucle1;
            }
            System.out.println("i = " + i);
        }
    }
}
