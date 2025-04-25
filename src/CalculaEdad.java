import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CalculaEdad {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now();

        System.out.println("Ingresa tu año de nacimiento en formato YYYY-MM-DD");

        try {
            LocalDate fechaNacimiento = LocalDate.parse(s.nextLine());

            //Date fecha = format.parse(s.nextLine());

            System.out.println("fecha de nacimiento = " + fechaNacimiento);
            System.out.println("fecha actual " + fechaActual);

            Period anios  = Period.between(fechaNacimiento,fechaActual);
            System.out.print("Tienes : " +anios.getYears() + " años");
            System.out.print( " y " + anios.getMonths() + " Meses");
            //System.out.println("anios = " + anios);

        } catch (Exception e) {
            System.out.println("Formato incorrecto");
            System.out.println("Intentalo Nuevamente con el formato YYYY-MM-DD");
            main(args);
        }
    }
}