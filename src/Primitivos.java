public class Primitivos {

    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a 1");
        System.out.println("tipo byte corresponde en bites a  8");
        System.out.println("Valor maximo de un byte:  127");
        System.out.println("Valor minimo de un byte:  -128");
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a 2");
        System.out.println("tipo short corresponde en bites a  16");
        System.out.println("Valor maximo de un short:  32767");
        System.out.println("Valor minimo de un short:  -32768");
        int numeroInt = Integer.MAX_VALUE;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a 4");
        System.out.println("tipo int corresponde en bites a  32");
        System.out.println("Valor maximo de un int:  2147483647");
        System.out.println("Valor minimo de un int:  -2147483648");
        long numeroLong = Long.MAX_VALUE;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a 8");
        System.out.println("tipo int corresponde en bites a  64");
        System.out.println("Valor maximo de un long:  9223372036854775807");
        System.out.println("Valor minimo de un long:  -9223372036854775808");
        float numeroFloat = (float)Long.MAX_VALUE;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("tipo float corresponde en byte a 4");
        System.out.println("tipo float corresponde en bites a  32");
        System.out.println("Valor maximo de un float:  3.4028235E38");
        System.out.println("Valor minimo de un float:  1.4E-45");
    }
}
