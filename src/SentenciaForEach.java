public class SentenciaForEach {  // solo se utiliza para recorrer arreglos
    public static void main(String[] args) {
        int [] numeros= {1,3,5,7,9,11,13,14};
        for (int num: numeros){
            System.out.println("num = " + num);
        }

        String [] gatos = {"nico","luna","wally","negus","molly"};
        for (String cat: gatos){
            System.out.println("cat = " + cat);
        }
    }
}
