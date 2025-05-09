public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);  //entrega el valor absoluto no importando si es negativo
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5,1.2); // ve cual es el valor maximo
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.5);  //ve cual es el valor minimo
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5); //redondea valores al siguiente mayor
        System.out.println("techo = " + techo);

        double piso =   Math.floor(3.5); //redondea valores al siguiente menor
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5); // redondea al mas cercano
        System.out.println("entero = " + entero);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);  //obtiene el logaritmo del dato indicado
        System.out.println("log = " + log);

        double potencia = Math.pow(10,3);  //obtiene la potencia de un numero (numero, elevado a)
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);  //obtiene raiz cuadrada
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57); //convertir un angulo de radianes a grados
        System.out.println("grados = " + grados);
        
        double radianes = Math.toRadians(90.00);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(98): " + Math.sin(radianes));  //recibe el valor en radianes
        System.out.println("cos(98): " + Math.cos(radianes));

        radianes = Math.toRadians(180);
        System.out.println("cos(98): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(98): " + Math.cos(radianes));
    }
}
