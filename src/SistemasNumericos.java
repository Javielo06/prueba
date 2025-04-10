import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr) ;

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe de ingresar un numero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        //convierte numero decimal a binario
        String mensajeBinario = "numero binario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);
        
        //agrega 0b para indicar que es un numero binario
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        // para numeros octales se antepone un cero para que la maquina comprenda que es octal
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHex = "numero hexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println();
        // para numeros hexadecimales anteponer 0x 
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = mensajeBinario;
        mensaje += " \n " + mensajeOctal;
        mensaje += " \n " + mensajeHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
