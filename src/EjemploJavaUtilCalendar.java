import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {


        Calendar calendario = Calendar.getInstance();

        calendario.set(2020,0,25);
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);
    }
}
