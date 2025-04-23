import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
     String [] gatos = {"nico","luna","wally","negus","molly"};
        int count = gatos.length;
        for (int i = 0; i < count; i++){
            if (gatos[i].equalsIgnoreCase("molly") ||
                    gatos[i].equalsIgnoreCase("negus"))
                continue;
            System.out.println(i + "-." + gatos[i]);
        }
        String buscar = JOptionPane.showInputDialog("ingrese un nombre");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (gatos[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar + "  gato encontrado");
        }else {
            JOptionPane.showMessageDialog(null,buscar+"no se encontró al gatito");
        }
    }
}
