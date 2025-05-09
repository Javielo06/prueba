import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","mi valor guadado en el archivo properties");
            System.setProperties(p);

            Properties ps  = System.getProperties();
            System.out.println("ps.getProperty(...) " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("otra"));
            System.out.println(System.getProperty("confir.texto..ambiente"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.correo"));
            p.list(System.out);

        }catch (Exception e) {
            System.out.println("No existe el archivo");
        }
    }
}
