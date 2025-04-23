import javax.swing.*;

public class NombreLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog(null,"Ingresa nombre y apellido de una persona de tu familia o amigos");
        String nombre2 = JOptionPane.showInputDialog(null,"Ingresa nombre y apellido de la segunda persona de tu familia o amigos");
        String nombre3 = JOptionPane.showInputDialog(null,"Ingresa nombre y apellido de la tercera persona de tu familia o amigos");

        String[] separa1 = nombre1.split(";");
        String[] separa2 = nombre2.split(";");
        String[] separa3 = nombre3.split(";");

        if (nombre1.length() > nombre2.length()){
            //System.out.println(nombre1 + "Tiene el nombre mas largo");
            JOptionPane.showMessageDialog(null, nombre1 +" Tiene el nombre mas largo");

        }else if (nombre2.length() < nombre1.length() ) {
            //System.out.println(  nombre2 + "Tiene el nombre mas largo");
            JOptionPane.showMessageDialog(null, nombre2 + " Tiene el nombre mas largo");

        }else {
            //System.out.println(nombre3 + " Tiene el nombre mas largo");
            JOptionPane.showMessageDialog(null, nombre3 + " Tiene el nombre mas largo");
        }

    }
}
