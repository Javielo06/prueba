public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        
        String texto = "creando un objeto de la clase String";
        
        Integer num = 7;
        
        boolean b1 = texto instanceof String;

        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        b1 = num instanceof Integer;

        System.out.println("Texto es del tipo Integer = " + b1);

        
    }
}
