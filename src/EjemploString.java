public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);
        
        esIgual = curso.equals(curso2); //evalua si el texto es igual en ambas variables, equalsIgnoreCase ingnora si son mayúsculas y minúsculas
        System.out.println("esIgual = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);


    }
}
