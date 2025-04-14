public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String alumno = "Javier Mendoza";
        
        String detalle = curso + " del alumno " + alumno;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle +" "+ (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);
        
        String detalle2 = curso.concat(" con ").concat(alumno);
        System.out.println("detalle2 = " + detalle2);

        
    }
}
