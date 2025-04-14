public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();
        
        for (int i = 0; i < 1000; i++){
           // c = c.concat(a).concat(b).concat("\n"); // tardo 1ms
           // c += a + b + "\n"; //tarda 5ms
            sb.append(a).append(b).append("\n");  //tarda 0ms

        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

        
    }
}
