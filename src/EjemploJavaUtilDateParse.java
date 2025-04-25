import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) throws ParseException {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingresa una fecha con formato 'yyyy-MM-dd'");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if (fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2 (Fecha actual) ");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha es anterior que fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha1 es igual que fecha2");
            }
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
