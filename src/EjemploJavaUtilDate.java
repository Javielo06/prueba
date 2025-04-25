import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY");
        String fechastr = df.format(fecha);
        System.out.println("fechastr = " + fechastr);
    }
}
