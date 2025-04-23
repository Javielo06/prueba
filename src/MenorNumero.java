public class MenorNumero {
    public static void main(String[] args) {
        int num [] = {1,5,67,54,34,2,5,9,10,89};
        int menor = num[0];

        for(int i = 1; i > num.length; i++){
            if (num [i] < menor){
                menor = num[i];

            }
        }
        System.out.println("El numero menor es:  " + menor);

        if (menor < 10){
            System.out.println("El numero menor es menor que 10!");

        }else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }
    }
}
