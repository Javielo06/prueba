public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java ";
        String alumno = "Javier Mendoza";
        
        String resultado = curso.concat(alumno);
        System.out.println("curso = " + curso);
        System.out.println(" resultado = " + resultado);
        System.out.println(curso == resultado);
        
        String resultado2 = curso.transform(c -> {
            return c + " con " + alumno;
                });
        System.out.println("curso = " + curso);
        System.out.println("resultado2  = " +resultado2 );

        String resutado3 = resultado.replace("a","A");
        System.out.println("resultado3 = " + resutado3);

    }
}
