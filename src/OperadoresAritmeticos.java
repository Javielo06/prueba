public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 8;
        System.out.println("i = " + i);

        i += 2;
        System.out.println("i = " + i);

        i+= 5;
        System.out.println("i = " + i);

        j -= 4;
        System.out.println("j = " + j);

        String sqlString = "select * from clientes c";
        sqlString += " where nombre_cliente = 'Javier'";
        sqlString += " where nombre_cliente = 'Je'";
        System.out.println("sqlString = " + sqlString);
    }
}
