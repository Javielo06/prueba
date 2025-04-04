public class HolaMundo {

    public static double circunferencia(double radio) {
        return Math.PI * Math.pow(radio, (double)2.0F);
    }

    public static void main(String[] args) {
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        int numero = 10;
        System.out.println("numero = " + numero);
        int edad = 30;
        double altura = 1.71;
        System.out.println("Tengo " + edad + " años y mido " + altura + " metros");
        double original = 9.99;
        int valorNuevo = (int)original;
        System.out.println("Valor doble = " + original);
        System.out.println("valor Entero = " + valorNuevo);
        int num1 = 10;
        int num2 = 5;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        float division = (float)(num1 / num2);
        System.out.println("Suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("division = " + division);
        int a = 5;
        int b = 10;
        System.out.println("antes del intercambio a = " + a + ", b = " + b);
        System.out.println("despues del intercambio a = " + b + ", b = " + a);
        double radio = (double)3.5F;
        System.out.println("El area del circulo con radio = " + radio + " es = " + circunferencia(radio));
        int num = 50;
        String nombre = "Javier";
        if (num < 10) {
            nombre = "Jesus";
            System.out.println("nombre = " + nombre);
        }

    }


}
