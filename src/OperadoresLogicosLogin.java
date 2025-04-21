import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

 /*     String [] usernames = new String[2];
        String [] passwords = new  String[2];
        usernames[0] = "Javier";
        passwords [0] = "12345";

        usernames [1] = "admin";
        passwords [1] = "12345";    */

        String [] usernames = {"Javier","admin"};
        String [] passwords ={"12345","6789"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        String u = scanner.next();

        System.out.println("ingrese su contraseña");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            if ( (usernames[i].equalsIgnoreCase(u) && passwords[i].equals(p))){

                esAutenticado = true;
                break; //para salir del ciclo for

        }


        }
        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u));
        }else{
            System.out.println("Contraseña incorrecta, intentalo de nuevo");

            System.out.println("Es necesaria la autenticación");
        }
    }
}
