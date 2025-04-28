import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);

        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);

        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javahome);
    }
}
